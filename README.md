## What is SDF4J?

SDF4J represents an abstract layer between an application and concrete graphics implementation and can bridge the gap between different platforms. The goal is to write platform independent code for graphics manipulation that an be easily ported to other platforms simply by choosing a different implementation of SDF4J. You can have the same code work on desktop as well as mobile devices or even web! At the moment, SDF4J supports the following operations:
<ul>
<li>color, font and stroke management</li>
<li>affine transformations of the canvas</li>
<li>drawing primitives (line, rectangle, rounded rect, oval)</li>
<li>drawing images specified in binary format (as stored in files)</li>
</ul>
Should you need something that's missing feel free to extend the library or request the change in the issues.

## What is SDF4 NOT?

SDF4J is NOT a drawing library and cannot be used on its own, without having an implementation for some external library such as AWT Graphic2D, Android, GWT, OpenGL...

## How does it work?
The main part of the project is located in <b>sdf4j-core</b> project. It contains the SDF4J API and is not platform dependent, so it can be used in drawing applications regardless of their platform. The API strongly resembles AWT Graphics2D API to make converting existing application written for AWT Graphics2D relatively painless. In addition to this library, you will need a concrete implementation of SDF4J for each platform you want to run your application on (see the next section for the full list). In case it doesn't already exist, feel free to extend the library by writing the implementation for a new platform. Please note that any changes made in the core should be propagated to all concrete implementations to keep the whole project up to date and working.

## Existing implementations
<ul>
<li><b>sdf4j-awt</b> implementation for AWT Graphics2D. The main class is AWTCanvas which wraps around the provided Graphics2D and implements the SDF4J ICanvas interface.</li>
<li><b>sdf4j-android</b> implementation for Android platform. The main class is AndroidCanvas which wraps around the provided Canvas and implements the SDF4J ICanvas interface.</li>
</ul>
