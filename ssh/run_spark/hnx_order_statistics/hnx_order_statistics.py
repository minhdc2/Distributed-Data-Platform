import subprocess
import paramiko
import os
import time

host = "192.168.2.14"
port = 22
username = os.getenv('REMOTE_USERNAME')
password = os.getenv('REMOTE_PASSWORD')
print(username, password)

command = f"cd /d C:\\spark-3.0.3-bin-hadoop2.7\\bin && spark-submit --master spark://{os.getenv('HOSTMACHINE')}:7077 D:\\apps\\spark\\etl\\hnx_order_statistics\\hnx_order_statistics.py"
print(command)

ssh = paramiko.SSHClient()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect(host, port, username, password)

stdin, stdout, stderr = ssh.exec_command(command)
stdin.close()
out_lines = stdout.readlines()
err_lines = stderr.readlines()
print(out_lines)
print(err_lines)
    