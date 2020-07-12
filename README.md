
##A small sample to play around the desugaring settings on Android Studio 4.0.0
  
###Conclusion:

1. If the app enables the desugar settings, the library does not have to enable the desugar settings. Everything will be OK. 
2. If the library enables the desugar settings but the app does not have to enable the desugar settings. The library will compile but the app will crash.
3. With the above statement, I reckon that it could be dangerous for library developers mistakenly use the Java 8 API without knowing that it will break the library consumers.