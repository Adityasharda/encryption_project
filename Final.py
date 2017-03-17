## Command-line application for encryption and decryption of images using choas theory

from Encryption import *
from Decryption import *
import os

## specifying the directories to be used that are constant
images_directory = "images/"
encrypted_image_directory = "encrypted/"
decrypted_image_directory = "decrypted/"

## The encryption function lists all the images in the image folder and ask the user to input the file to be encrypted,
## then it uses the encrypt function to encrypt images and the key provided by the user
## after encryption it saves the encrypted file in the encrypted folder

def encryption():
    #selecting image file to be encrypted
    fileList = os.listdir(images_directory)
    for file in fileList:
        if 'png' in file or 'jpg' in file or 'jpeg' in file:
            print(str(fileList.index(file))+'. '+file)
    num=input('Enter the image file number that you want to encrypt:')
    image_file = str(fileList[int(num)])

    # taking the key from the user
    key = input("Please enter the encryption key:")
    while len(key)<10:
        print("Key should be of minimum 10 characters!")
        key = input("Please enter the encryption key:")




    encrypted_image = encrypt(images_directory+image_file,key)
    encrypted_image.show()
    # saving the image file
    encrypted_image.save(encrypted_image_directory+image_file.split('.')[0]+"_"+key+"."+"png")




def decryption():
    #selecting encrypted image file
    fileList = os.listdir(encrypted_image_directory)
    for file in fileList:
        if 'png' in file or 'jpg' in file or 'jpeg' in file:
            print(str(fileList.index(file))+'. '+file)
    num=input('Enter the encrypted image file number:')
    encrypted_file = str(fileList[int(num)])

    # taking the key from the user
    key = input("Please enter the decryption key:")
    while len(key)<10:
        print("Key should be of minimum 10 characters!")
        key = input("Please enter the decryption key:")



    decrypted_image = decrypt("encrypted/"+encrypted_file,key)
    decrypted_image.show()
    # saving the image file
    decrypted_image.save("decrypted/"+encrypted_file.split('.')[0]+"_"+key+"."+"png")


### Message to be shown to the user for the operation he wants to perform on image
message = '''Please enter a number:
1.) Encryption
2.) Decryption
3.) or press anything to exit
'''


#### Displaying the message and performing the operation based on user input
while True:
    print(message)
    choice = int(input())
    if choice == 1:
        encryption()
    elif choice == 2:
        decryption()
    else:
        break
