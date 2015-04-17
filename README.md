# What's openflowj-otn
"Opt-transport apps of O3 orchestrator&amp;controller suite"
---

openflowj-otn is a software which modified OpenFlowJ-Loxi(Ver0.9.0). New OTN parameters are added into OpenFlow ver1.3 code.
openflowj-otn is used by DummyOptNode in order to handle OpenFlow1.3 with OTN parameters.

Please see [starting guide](http://www.o3project.org/ja/fujitsu/docs/getting_started_OPT.pdf) for detailed instructions of "Opt-transport apps of O3 orchestrator & controller suite". 

**Please also look at the** [**Web page that easily explained our OSS**](http://www.o3project.org/en/fujitsu/index.html)

Environment
--------------------------
Middleware: Oracle Java VM jdk1.7.0_51、Maven 3  

(Note) This software is used by [DummyOptNode](https://github.com/o3project/dummyOptNode)

Build
--------------------------

    $ git clone https://github.com/o3project/openflowj-otn.git
    $ cd openflowj-otn
    $ mvn clean install

openflowj-otn is installed in local MAVEN repository.
