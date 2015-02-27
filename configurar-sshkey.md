#Generar una nueva llave SSH (SSH key)

    $ ssh-keygen -t rsa -C "email@ejemplo.com"

#Copiar archivo

	/.ssh/id_rsa.pub

A github y guardarlo.


#Probar si funciona

	$ ssh -T git@github.com
