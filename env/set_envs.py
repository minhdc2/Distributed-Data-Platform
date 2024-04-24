import os


os.environ['DERBY_HOME']='C:\db-derby-10.12.1.1-bin'
os.environ['HADOOP_HOME']='C:\hadoop-2.7.3'
os.environ['HADOOP_COMMON_HOME']=os.environ['HADOOP_HOME']
os.environ['HADOOP_MAPRED_HOME']=os.environ['HADOOP_HOME']
os.environ['HADOOP_USER_CLASSPATH_FIRST']='true'
os.environ['HIVE_HOME']='C:\apache-hive-2.1.0-bin'
os.environ['HIVE_HOSTMACHINE']='192.168.2.14'
os.environ['HOSTMACHINE']='192.168.2.14'
os.environ['SQOOP_HOME']='C:\sqoop-1.4.7.bin__hadoop-2.6.0'
os.environ['SPARK_HOME']='C:\spark-3.0.3-bin-hadoop2.7'
pathlist = [os.environ['DERBY_HOME']+'\bin', os.environ['HADOOP_HOME']+'\bin', os.environ['HIVE_HOME']+'\bin', 
            os.environ['SQOOP_HOME']+'\bin', os.environ['HIVE_HOSTMACHINE'], os.environ['SPARK_HOME']+'\bin', os.environ['HOSTMACHINE']]
os.environ['PATH'] += os.pathsep + os.pathsep.join(pathlist)
    
    

