package com.tonybrooks.sharpmq.message;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.MessageFormatException;
import java.io.*;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BytesMessageImpl extends AbstractMessage implements BytesMessage {

    private byte[] body;

    private DataInputStream inputStream;

    private DataOutputStream outputStream;

    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private final ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();

    private final ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();

    public BytesMessageImpl() {
        header = new MessgeHeader();
        properties = new MessageProperties();
    }
    
    public BytesMessageImpl(byte[] body) {
        this();
        this.body = body;
    }

    @Override
    public long getBodyLength() throws JMSException {
        return Objects.isNull(body) ? 0 : body.length;
    }

    @Override
    public boolean readBoolean() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readBoolean();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public byte readByte() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readByte();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public int readUnsignedByte() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readUnsignedByte();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public short readShort() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readShort();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public int readUnsignedShort() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readUnsignedShort();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public char readChar() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readChar();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public int readInt() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readInt();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public long readLong() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readLong();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public float readFloat() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readFloat();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public double readDouble() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readDouble();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public String readUTF() throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.readUTF();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public int readBytes(byte[] value) throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.read(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public int readBytes(byte[] value, int length) throws JMSException {
        try {
            checkCanRead();
            readLock.lock();
            return inputStream.read(value, 0, length);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public void writeBoolean(boolean value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeBoolean(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeByte(byte value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeByte(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeShort(short value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeShort(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeChar(char value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeChar(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeInt(int value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeInt(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeLong(long value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeLong(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeFloat(float value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeFloat(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeDouble(double value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeDouble(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeUTF(String value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeUTF(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeBytes(byte[] value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeBytes(new String(value));
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeBytes(byte[] value, int offset, int length) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            outputStream.writeBytes(new String(value, offset, length));
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void writeObject(Object value) throws JMSException {
        try {
            checkCanWrite();
            writeLock.lock();
            new ObjectOutputStream(outputStream).writeObject(value);
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void reset() throws JMSException {
        try {
            readLock.lock();
            inputStream.reset();
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public void clearBody() {
        try {
            writeLock.lock();
            body = null;
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public <T> T getBody(Class<T> c) throws JMSException {
        try {
            return (T) (new ObjectInputStream(inputStream).readObject());
        } catch (ClassNotFoundException e) {
            throw new MessageFormatException(e.getMessage());
        } catch (Exception e) {
            throw new JMSException(e.getMessage());
        }
    }

    public synchronized void releaseResource() throws JMSException {
        try {
            if (Objects.nonNull(inputStream)) {
                inputStream.close();
            }

            if (Objects.nonNull(outputStream)) {
                outputStream.close();
            }
        } catch (IOException e) {
            throw new JMSException(e.getMessage());
        }
    }

    private void checkCanRead() throws JMSException {
        if (Objects.isNull(body)) {
            throw new JMSException("message's body is null!");
        }

        //双重锁校验
        if (Objects.isNull(inputStream)) {
            synchronized (this) {
                if (Objects.isNull(inputStream)) {
                    inputStream = new DataInputStream(new InputStream() {
                        private int pos = 0;

                        private int count = body.length;

                        @Override
                        public int read() {
                            return (pos < count) ? body[pos++] : -1;
                        }
                    });
                }
            }
        }
    }

    private void checkCanWrite() throws JMSException {
        if (Objects.isNull(body)) {
            throw new JMSException("message's body is null!");
        }

        //双重锁校验
        if (Objects.isNull(outputStream)) {
            synchronized (this) {
                if (Objects.isNull(outputStream)) {
                    outputStream = new DataOutputStream(new OutputStream() {
                        private int count = 0;

                        @Override
                        public void write(int b) {
                            body[count++] = (byte) b;
                        }
                    });
                }
            }
        }
    }
}
