PacketWrapper 
===========

When reading and writing packets in ProtocolLib, it is necessary to know the order at which the fields are stored in memory. 
This requires you to decompile the Minecraft source code with [JD Gui](http://java.decompiler.free.fr/?q=jdgui), while decoding the meaning of a field by looking up an online [wiki](http://www.wiki.vg/Protocol) resource 
([tutorial](http://forums.bukkit.org/threads/lib-1-4-6-protocollib-2-0-0-safely-and-easily-modify-sent-and-recieved-packets.101035/page-2#post-1366140)). 
It would be much easier if these packets could be accessed as any other normal Java bean. 

Enter PacketWrapper. It contains wrapper classes for all known packets in 1.5.1, providing you with access to the fields by name, along
with automatic conversion to existing Bukkit enumerations and classes. It also includes a number of custom enumerations when appropriate.

You can use PacketWrapper as a dependency if you wish, though the intent is for plugin authors to simply copy-and-paste the classes they need into their 
project. 

Building
--------
You can compile this project yourself by using the latest version of Maven.


Remarks
--------
This project was partly auto-generated by a script. 