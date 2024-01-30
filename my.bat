@echo off
echo Hi >>file1.txt
java -cp target/classes com.takeo.App 2 1 0 -1 -2
cd myNode
npm run start
pause
