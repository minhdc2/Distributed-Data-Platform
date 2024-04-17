import subprocess
import paramiko
import os
import time

host = "192.168.2.14"
port = 22
username = os.getenv('REMOTE_USERNAME')
password = os.getenv('REMOTE_PASSWORD')
print(username, password)

command = "cd /d D:\\apps\\sqoop\\Oracle_to_Hive\\hnx_order_statistics && python hnx_order_statistics.py"
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
    