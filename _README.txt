Warning at edu.wpi.first.wpilibj.RobotBase.startRobot(RobotBase.java:274): Robots should not quit, but yours did!
Error at edu.wpi.first.wpilibj.RobotBase.startRobot(RobotBase.java:276): The startCompetition() method (or methods called by it) should have handled the exception above.
mattbook:5588CameraTest2019 mfitzgib$ cd /Users/mfitzgib/proj/5588CameraTest2019 ; env "DYLD_LIBRARY_PATH=/Users/mfitzgib/proj/5588CameraTest2019/build/tmp/jniExtractDir" "HALSIM_EXTENSIONS=" "LD_LIBRARY_PATH=/Users/mfitzgib/proj/5588CameraTest2019/build/tmp/jniExtractDir" "PATH=/Users/mfitzgib/proj/5588CameraTest2019/build/tmp/jniExtractDir" /Library/Java/JavaVirtualMachines/jdk-11.0.1.jdk/Contents/Home/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:51060 -Djava.library.path=/Users/mfitzgib/proj/5588CameraTest2019/build/tmp/jniExtractDir -Dfile.encoding=UTF-8 -cp /Users/mfitzgib/proj/5588CameraTest2019/bin/main:/Users/mfitzgib/.gradle/caches/modules-2/files-2.1/edu.wpi.first.wpilibj/wpilibj-java/2019.3.1/c10042eb46f587734104db8e7da32442425cc379/wpilibj-java-2019.3.1.jar:/Users/mfitzgib/.gradle/caches/modules-2/files-2.1/edu.wpi.first.ntcore/ntcore-java/2019.3.1/e06232d308edeee8ca93677d52ed7bf69c5d1c04/ntcore-java-2019.3.1.jar:/Users/mfitzgib/.gradle/caches/modules-2/files-2.1/edu.wpi.first.wpiutil/wpiutil-java/2019.3.1/afdadea26c3036bc013d0b2f0967c63768c129d/wpiutil-java-2019.3.1.jar:/Users/mfitzgib/.gradle/caches/modules-2/files-2.1/edu.wpi.first.thirdparty.frc2019.opencv/opencv-java/3.4.4-4/5c546c223045ef680e643d97726623031831b1c5/opencv-java-3.4.4-4.jar:/Users/mfitzgib/.gradle/caches/modules-2/files-2.1/edu.wpi.first.cscore/cscore-java/2019.3.1/efe085809b133dbdcb4443ecf6763681acb6bf9d/cscore-java-2019.3.1.jar:/Users/mfitzgib/.gradle/caches/modules-2/files-2.1/edu.wpi.first.cameraserver/cameraserver-java/2019.3.1/9e86a2c674c9e26d054655ae3923767b5485f886/cameraserver-java-2019.3.1.jar:/Users/mfitzgib/.gradle/caches/modules-2/files-2.1/edu.wpi.first.hal/hal-java/2019.3.1/e86cc23970d2c6b27f3fd41c3e0384679cb8fe0e/hal-java-2019.3.1.jar:/Users/mfitzgib/.gradle/caches/modules-2/files-2.1/junit/junit/4.12/2973d150c0dc1fefe998f834810d68f278ea58ec/junit-4.12.jar:/Users/mfitzgib/.gradle/caches/modules-2/files-2.1/org.hamcrest/hamcrest-core/1.3/42a25dc3219429f0e5d060061f71acb49bf010a0/hamcrest-core-1.3.jar frc.robot.Main 


ssh-keygen -t rsa -b 4096 -C "matt.fitzgibbon@gmail.com"
eval "$(ssh-agent -s)"
Agent pid 29257
ssh-add -K ~/.ssh/id_rsa_github

echo "# 5588CameraTest2019" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin git@github.com:ma2tfitz/5588CameraTest2019.git
git push -u origin master


git remote add origin git@github.com:ma2tfitz/5588CameraTest2019.git
git push -u origin master

