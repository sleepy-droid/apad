import multiprocessing
import time

class Process(multiprocessing.Process):
    def __init__(self, id):
        super(Process, self).__init__()
        self.id = id

    def run(self):
        time.sleep(1)
        print("Soy el proceso con el ID: {}".format(self.id))

if __name__ == '__main__':
    p = Process(0)
    p.start()
    p.join()
    p = Process(1)
    p.start()
    p.join()

