# APIautomation_ByVandy


Setup GITbash for the first time:

1.	Download GitBash:
https://git-scm.com/downloads

2.	Install on your system by default settings and complete the installation
3.	Start GitBash open.
4.	Change into the directory where your source code is located in the command prompt.
Pwd
Ls
Cd workspace/   (take/copy the path next to your projectname under intellij)
Ls
Cd projectname/
Ls
5.	After you locate the your project location
6.	Initialize the git for the first time
7.	Git init
8.	Configure user name and email
git config --global user.name "Vandana" 
git config --global user.email <email>
9.	git add .   (use this command to add files)
10.	git status
11.	git commit -m "basic API framework upload"
12.	git status
13.	git push       (push directly if there is no new changes to pull from master else do pull first)
if you get below error
fatal: No configured push destination.
Then do
$ git remote add origin https://github.com/vandy-automation/APIautomation_ByVandy.git
14.	git status
15.	git push
