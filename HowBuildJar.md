# Introduction #

You have a android library project and want to distribute it. You need to create a JAR archive to do that.

# How To create your own JAR archive #

I consider you have a working library and you are using Eclipse on any platform.

- In Eclipse, right click on your project and choose "Export...". A new window will open.
- In Java, choose "JAR file" and click "Next >" at the bottom of the window.
- Choose the files you will put inside, for a simple project, you will only select the "src" folder.
- Check only the "Export all output folders for checked projects"
- Choose the export location.
- For less size, check "Compress the contents of the JAR file" and click "Finish".

**Your JAR file is created. You can now publish it and use it in other projects.**