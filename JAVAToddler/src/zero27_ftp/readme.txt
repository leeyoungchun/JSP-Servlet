FTP는 컴퓨터 간 파일을 전송하는 데 사용되는 프로토콜로 대용량의 서버에 각종 공개용 소프트웨어 및 문서를 저장하여 
사용자가 필요한 자료를 자신의 컴퓨터로 다운로드하여 쓸 수 있게 한다. 
이는 TCP/IP 네트워크 상에서 가장 널리 알려져 있는 프로토콜로 TCP/IP상의 다른 종류의 컴퓨터와 파일 또는 문서를 
교환할 수 있고 Windows의 경우 Cute-ftp, Ws-ftp와 같은 소프트웨어를 사용한다. 
한편 파일을 송수신하는 방법은 여러 가지가 있으나 FTP만큼 빠르게 파일을 올리고 내려 받는 방식이 없기 때문에 아직도 많이 
사용되고 있다.

FTP를 사용하기 위해서는 송신 혹은 수신하고자 하는 컴퓨터의 계정을 알아야 하며 일단 접속이 이루어지면 원하는 
디렉토리(directory)에서 원하는 파일을 송신 혹은 수신할 수 있다. 
FTP는 처음에는 워크스테이션과 같은 다중 사용자 컴퓨터 사이에서 가능하였으나, 현재는 개인 컴퓨터에서도 다중 사용자 
컴퓨터와 파일을 송수신할 수 있도록 한 응용 프로그램이 개발되어 많이 사용되고 있다.

1. (주)이스트소프트의 알FTP를 활용한 FTP서버구축
   http://software.altools.co.kr/ko-kr/closed.html
   1.1 기능
	   1) FTP 서버 기능
	     PC를 서버로 사용할 수 있으며 아이디, 비밀번호를 지정하여 최대 5명까지 접속자를 지정.
	   2) FTP클라이언트 기능
	     Passive Mode 접속, 예약 전송, 파일 이어 쓰기 및 고급 사용자를 위한 명령어 입력 기능 제공.
	   3) 서버데몬 기능
	       현재 사용중인 컴퓨터를 서버로 지정하고 접속할 폴더를 설정해 사용.
  
2. Apache Commons Net : java기반의 클라이언트 중심의 기본적인 인터넷 프로토콜을 구현.
   download : http://commons.apache.org/proper/commons-net/
              commons-net-3.0.1-bin.zip
              
       