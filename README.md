# MAD_Practical_9_21012011094
Aim: What is Frame by Frame Animation? What is Twin Animation? How can you achieve edge-to-edge content display in your app? Create Android Application to demonstrate Frame by frame animation and splash screen to demonstrate twin animation according to below instructions.

Create MainActivity according to below UI design.
Create SplashActivity according to Video
Create gradient Rectangle by using tag in tag for background of SplashActivity. Use radial rectangle with x = 0.9, y =0.9, radius = 1500. Start Color pink and End Color blue. shape should be rectangle

Add these all in project: , oneShot attribute, tag, android:startOffset = 100, android:duration=1000, tag, tag, tag, tag
Ans: Frame-by-frame animation: Frame-by-frame animation, in the context of Android, is a traditional animation technique where a series of individual images (frames) are displayed sequentially to create the illusion of motion. Each frame represents a specific moment in the animation sequence. By showing these frames rapidly in succession, typically at a high frame rate, you create the perception of continuous movement. Frame-by-frame animation is useful for simple animations or when you need precise control over each frame's content. To implement it in Android, you can use techniques like animation drawables or programmatically changing the images in an ImageView.

Twin animation: Twin animation usually refers to the simultaneous animation of two related properties or views, ensuring they move or change in sync. For example, if you want to animate both the position and opacity of an image, you can create a twin animation to ensure these changes happen together.

To achieve edge-to-edge content display in your Android app, set system UI flags to control the visibility of the status and navigation bars, use the android:fitsSystemWindows="true" attribute in your root layout to avoid content overlap, ensure your app's interactions are compatible with edge-to-edge gestures, account for display cutouts using the DisplayCutout API, utilize flexible layout managers like ConstraintLayout, test your app on different devices and orientations, and consider device-specific configuration and resources to optimize your UI for various screen sizes and resolutions. These steps help maximize screen real estate and create a seamless and immersive user experience across a range of Android devices.

OUTPUT:

![image](https://github.com/Nisarg512/MAD_Practical_9_21012011094/assets/139303998/668d7609-93dd-426f-b32a-d6a38740b642)

![image](https://github.com/Nisarg512/MAD_Practical_9_21012011094/assets/139303998/69e64fec-56b5-4057-af52-eb26fd295d53)

