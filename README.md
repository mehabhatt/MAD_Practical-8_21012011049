# MAD_Practical-8_21012011049
<b>Aim:</b> <br>
What is BroadcastReceiver? Difference between Service and BroadcastReceiver. Create an Alarm application by using service & BroadcastReceiver by following below instructions.

1. Create MainActivity according to below UI design.

2. Create AlarmBroadcastReceiver class

3. Create AlarmService Class

4. Add android.permission.SCHEDULE_EXACT_ALARM Permission in Manifest file

<b>Ans:</b>
<p> Broadcast in android is the system-wide events that can occur when the device starts, when a message is received on the device or when incoming calls are received, 
  or when a device goes to airplane mode, etc. Broadcast Receivers are used to respond to these system-wide events. Broadcast Receivers allow us to register for the 
  system and application events, and when that event happens, then the register receivers get notified. </p>
<p>Apps can use services to do long-running processes in the background, such as downloading files from a server, or checking for email, or checking your location. 
  Although services don't show up or interact with you directly, they still show up in the "Running apps" list. Broadcast receivers are the third kind of component. 
  Like services, they only exist in the background and don't interact with you directly. But unlike services, they can't stay running or perform long tasks: they exist 
  to respond to events.  And unlike activities and services, more than one broadcast receiver can be started in one go.</p>

  <h2>Output:</h2>
  <img src="https://github.com/mehabhatt/MAD_Practical-8_21012011049/assets/98047777/625aa233-2eae-4dda-ae9e-d4dcb10ca117" width="280" height="500"> <img src="https://github.com/mehabhatt/MAD_Practical-8_21012011049/assets/98047777/e4dd8ee9-ada1-41fd-825e-bfe9f1ba52aa"  width="280" height="500"> <img src="https://github.com/mehabhatt/MAD_Practical-8_21012011049/assets/98047777/a17bc417-3a06-4714-ab4d-5b04b2ef663a"  width="280" height="500">
