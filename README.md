[![](https://jitpack.io/v/markchous/MHKtx.svg)](https://jitpack.io/#markchous/MHKtx)[![MIT Licence](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/mit-license.php)[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](http://makeapullrequest.com)

## MHKtx
MHKtx was inspired by the constant need of the same extensions being used in every Android project I work with. This is for Android only as of right now, with no plans to branch out anytime this future. This could change, stay tuned. Please feel free to contribute your own extensions to the project if they are not already included. 

# Install Instructions
__Gradle:__  
_Step 1. Add the JitPack repository to your build file_  
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
_Step 2. Add the dependency_
```
dependencies {
	        implementation 'com.github.markchous:MHKtx:{version}'
	}
```

__Maven:__  
_Step 1. Add the JitPack repository to your build file_
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
_Step 2. Add the dependency_
```
<dependency>
	    <groupId>com.github.markchous</groupId>
	    <artifactId>MHKtx</artifactId>
	    <version>{version}</version>
	</dependency>
```

# Examples
// TODO: Coming soon...
