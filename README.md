# Movie Search Service - SOLR/Lucene based Search Service

###RESTful Interface to Search and Index movies.


####Incremental Indexing 

Delta changes or updates.

####Full Catalog Indexing

Entire movie catalog can be reindexed.

####SLAs 

90% queries response time - Order 10 m-secs

90-99% queries response time - Order 100 m-secs

###Dependencies
######For versions checkout pom.xml

Apache Solr

SolrJ

Spring 

Maven

Java


JUnit


Jackson


Apache HTTP Client


###How to build
#####This runs the Unit Tests as well

Install Maven - sudo apt-get install maven

mvn clean

If using eclipse - 'mvn eclipse:clean' followed by 'mvn eclipse:eclipse'

mvn install

###How to start 
Import project as existing project in your IDE.

Use 'mvn eclipse:clean' to clean and 'mvn eclipse:eclipse' to set up the project in eclipse

Download Apache Tomcat 7 (only binary) and untar it.


####How to do remote debugging

export JPDA_ADDRESS=8000 

export JPDA_TRANSPORT=dt_socket 

bin/catalina.sh jpda start


###Install Java

sudo apt-get update

Check if Java is already installed  - 'java -version'

sudo apt-get install python-software-properties

sudo add-apt-repository ppa:webupd8team/java

sudo apt-get update

sudo apt-get install oracle-java7-installer


###Set JAVA_HOME

sudo update-alternatives --config java

sudo vi /etc/environment

JAVA_HOME="/usr/lib/jvm/java-7-oracle"

source /etc/environment

###Check JAVA_HOME is configured

echo $JAVA_HOME


###How to import project in eclipse

File -> Import -> Maven -> Existing Maven Projects








