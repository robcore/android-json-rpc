package org.alexd.jsonrpc;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public abstract class JSONRPCClient {

	public static JSONRPCClient create(String uri)
	{
		return new JSONRPCHttpClient(uri);
	}
	
	protected abstract JSONObject doJSONRequest(JSONObject request) throws JSONRPCException;
	
	protected JSONObject doRequest(String method, Object[] params) throws JSONRPCException
	{
		//Copy method arguments in a json array
		JSONArray jsonParams = new JSONArray();
		for (int i=0; i<params.length; i++)
		{
			jsonParams.put(params[i]);
		}
		
		//Create the json request object
		JSONObject jsonRequest = new JSONObject();
		try 
		{
			//id hard-coded at 1 for now
			jsonRequest.put("id", 1);
			jsonRequest.put("method", method);
			jsonRequest.put("params", jsonParams);
		}
		catch (JSONException e1)
		{
			throw new JSONRPCException("Invalid JSON request", e1);
		}
		return doJSONRequest(jsonRequest);
	}
	
//	public Object beginCall(String method, final Object ... params)
//	{
//		//Handler 
//		class RequestThread extends Thread {
//			String mMethod;
//			Object[] mParams;
//			public RequestThread(String method, Object[] params)
//			{
//				mMethod = method;
//				mParams = params;
//			}
//			@Override
//			public void run() {
//				try
//				{
//					doRequest(mMethod, mParams);
//				}
//				catch (JSONRPCException e)
//				{
//					
//				}
//			}
//			
//		};
//		RequestThread requestThread = new RequestThread(method, params);
//		requestThread.start();
//		
//		return null;
//	}
	
	public Object call(String method, Object ... params) throws JSONRPCException
	{
		try 
		{
			return doRequest(method, params).get("result");
		} 
		catch (JSONException e)
		{
			throw new JSONRPCException("Cannot convert result", e);
		}
	}
	
	public String callString(String method, Object ... params) throws JSONRPCException
	{
		try 
		{
			return doRequest(method, params).getString("result");
		} 
		catch (JSONException e)
		{
			throw new JSONRPCException("Cannot convert result to String", e);
		}
	}
	
	public int callInt(String method, Object ... params) throws JSONRPCException
	{
		try 
		{
			return doRequest(method, params).getInt("result");
		} 
		catch (JSONException e)
		{
			throw new JSONRPCException("Cannot convert result to int", e);
		}
	}
	
	public long callLong(String method, Object ... params) throws JSONRPCException
	{
		try 
		{
			return doRequest(method, params).getLong("result");
		} 
		catch (JSONException e)
		{
			throw new JSONRPCException("Cannot convert result to long", e);
		}
	}
	
	public boolean callBoolean(String method, Object ... params) throws JSONRPCException
	{
		try 
		{
			return doRequest(method, params).getBoolean("result");
		} 
		catch (JSONException e)
		{
			throw new JSONRPCException("Cannot convert result to boolean", e);
		}
	}
	
	public double callDouble(String method, Object ... params) throws JSONRPCException
	{
		try 
		{
			return doRequest(method, params).getDouble("result");
		} 
		catch (JSONException e)
		{
			throw new JSONRPCException("Cannot convert result to double", e);
		}
	}
	
	public JSONObject callJSONObject(String method, Object ... params) throws JSONRPCException
	{
		try 
		{
			return doRequest(method, params).getJSONObject("result");
		} 
		catch (JSONException e)
		{
			throw new JSONRPCException("Cannot convert result to JSONObject", e);
		}
	}
	
	public JSONArray callJSONArray(String method, Object ... params) throws JSONRPCException
	{
		try 
		{
			return doRequest(method, params).getJSONArray("result");
		} 
		catch (JSONException e)
		{
			throw new JSONRPCException("Cannot convert result to JSONArray", e);
		}
	}
}
