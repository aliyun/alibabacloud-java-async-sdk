// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRedisAllSessionResponseBody} extends {@link TeaModel}
 *
 * <p>GetRedisAllSessionResponseBody</p>
 */
public class GetRedisAllSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRedisAllSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRedisAllSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRedisAllSessionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The session data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40C6E9AF-6C23-5614-AA83-34344CC6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRedisAllSessionResponseBody build() {
            return new GetRedisAllSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRedisAllSessionResponseBody} extends {@link TeaModel}
     *
     * <p>GetRedisAllSessionResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addr")
        private String addr;

        @com.aliyun.core.annotation.NameInMap("Age")
        private String age;

        @com.aliyun.core.annotation.NameInMap("Client")
        private String client;

        @com.aliyun.core.annotation.NameInMap("ClientDesc")
        private String clientDesc;

        @com.aliyun.core.annotation.NameInMap("Cmd")
        private String cmd;

        @com.aliyun.core.annotation.NameInMap("Db")
        private Long db;

        @com.aliyun.core.annotation.NameInMap("Events")
        private String events;

        @com.aliyun.core.annotation.NameInMap("Fd")
        private Long fd;

        @com.aliyun.core.annotation.NameInMap("Flags")
        private String flags;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Idle")
        private Long idle;

        @com.aliyun.core.annotation.NameInMap("Multi")
        private Long multi;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Obl")
        private Long obl;

        @com.aliyun.core.annotation.NameInMap("Oll")
        private Long oll;

        @com.aliyun.core.annotation.NameInMap("Omem")
        private Long omem;

        @com.aliyun.core.annotation.NameInMap("Psub")
        private Long psub;

        @com.aliyun.core.annotation.NameInMap("Qbuf")
        private Long qbuf;

        @com.aliyun.core.annotation.NameInMap("QbufFree")
        private Long qbufFree;

        @com.aliyun.core.annotation.NameInMap("Sub")
        private Long sub;

        private Sessions(Builder builder) {
            this.addr = builder.addr;
            this.age = builder.age;
            this.client = builder.client;
            this.clientDesc = builder.clientDesc;
            this.cmd = builder.cmd;
            this.db = builder.db;
            this.events = builder.events;
            this.fd = builder.fd;
            this.flags = builder.flags;
            this.id = builder.id;
            this.idle = builder.idle;
            this.multi = builder.multi;
            this.name = builder.name;
            this.nodeId = builder.nodeId;
            this.obl = builder.obl;
            this.oll = builder.oll;
            this.omem = builder.omem;
            this.psub = builder.psub;
            this.qbuf = builder.qbuf;
            this.qbufFree = builder.qbufFree;
            this.sub = builder.sub;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public String getAddr() {
            return this.addr;
        }

        /**
         * @return age
         */
        public String getAge() {
            return this.age;
        }

        /**
         * @return client
         */
        public String getClient() {
            return this.client;
        }

        /**
         * @return clientDesc
         */
        public String getClientDesc() {
            return this.clientDesc;
        }

        /**
         * @return cmd
         */
        public String getCmd() {
            return this.cmd;
        }

        /**
         * @return db
         */
        public Long getDb() {
            return this.db;
        }

        /**
         * @return events
         */
        public String getEvents() {
            return this.events;
        }

        /**
         * @return fd
         */
        public Long getFd() {
            return this.fd;
        }

        /**
         * @return flags
         */
        public String getFlags() {
            return this.flags;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idle
         */
        public Long getIdle() {
            return this.idle;
        }

        /**
         * @return multi
         */
        public Long getMulti() {
            return this.multi;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return obl
         */
        public Long getObl() {
            return this.obl;
        }

        /**
         * @return oll
         */
        public Long getOll() {
            return this.oll;
        }

        /**
         * @return omem
         */
        public Long getOmem() {
            return this.omem;
        }

        /**
         * @return psub
         */
        public Long getPsub() {
            return this.psub;
        }

        /**
         * @return qbuf
         */
        public Long getQbuf() {
            return this.qbuf;
        }

        /**
         * @return qbufFree
         */
        public Long getQbufFree() {
            return this.qbufFree;
        }

        /**
         * @return sub
         */
        public Long getSub() {
            return this.sub;
        }

        public static final class Builder {
            private String addr; 
            private String age; 
            private String client; 
            private String clientDesc; 
            private String cmd; 
            private Long db; 
            private String events; 
            private Long fd; 
            private String flags; 
            private Long id; 
            private Long idle; 
            private Long multi; 
            private String name; 
            private String nodeId; 
            private Long obl; 
            private Long oll; 
            private Long omem; 
            private Long psub; 
            private Long qbuf; 
            private Long qbufFree; 
            private Long sub; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.addr = model.addr;
                this.age = model.age;
                this.client = model.client;
                this.clientDesc = model.clientDesc;
                this.cmd = model.cmd;
                this.db = model.db;
                this.events = model.events;
                this.fd = model.fd;
                this.flags = model.flags;
                this.id = model.id;
                this.idle = model.idle;
                this.multi = model.multi;
                this.name = model.name;
                this.nodeId = model.nodeId;
                this.obl = model.obl;
                this.oll = model.oll;
                this.omem = model.omem;
                this.psub = model.psub;
                this.qbuf = model.qbuf;
                this.qbufFree = model.qbufFree;
                this.sub = model.sub;
            } 

            /**
             * <p>The IP address and port number of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX:53458</p>
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * <p>The connection duration of the session. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder age(String age) {
                this.age = age;
                return this;
            }

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder client(String client) {
                this.client = client;
                return this;
            }

            /**
             * <p>The alias of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>prod ip</p>
             */
            public Builder clientDesc(String clientDesc) {
                this.clientDesc = clientDesc;
                return this;
            }

            /**
             * <p>The command that was last run.</p>
             * 
             * <strong>example:</strong>
             * <p>PING</p>
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * <p>The ID of the database that the client is using.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder db(Long db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The file descriptor event. Valid values:</p>
             * <ul>
             * <li><strong>r</strong>: Client sockets are readable in the event loop.</li>
             * <li><strong>w</strong>: Client sockets are writable in the event loop.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>r</p>
             */
            public Builder events(String events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The file descriptor that is used by sockets.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder fd(Long fd) {
                this.fd = fd;
                return this;
            }

            /**
             * <p>The client flag. Valid values:</p>
             * <ul>
             * <li><strong>A</strong>: The connection needs to be closed at the earliest opportunity.</li>
             * <li><strong>b</strong>: The client is waiting for blocked events.</li>
             * <li><strong>c</strong>: The connection is closed after all replies are written.</li>
             * <li><strong>d</strong>: The monitored keys have been modified, and the <code>EXEC</code> command is about to fail.</li>
             * <li><strong>i</strong>: The client is waiting for VM I/O operations. This value is no longer used.</li>
             * <li><strong>M</strong>: The client is the primary node.</li>
             * <li><strong>N</strong>: No special flags are configured.</li>
             * <li><strong>O</strong>: The client is in monitor mode.</li>
             * <li><strong>r</strong>: The client is a cluster node in read-only mode.</li>
             * <li><strong>S</strong>: The client is a replica node in normal mode.</li>
             * <li><strong>u</strong>: The client is not blocked.</li>
             * <li><strong>U</strong>: The client is connected by using UNIX domain sockets.</li>
             * <li><strong>x</strong>: The client is executing a transaction.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder flags(String flags) {
                this.flags = flags;
                return this;
            }

            /**
             * <p>The client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9080586</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The duration during which the session is in the idle state. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder idle(Long idle) {
                this.idle = idle;
                return this;
            }

            /**
             * <p>The number of commands in <code>MULTI</code> or <code>EXEC</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder multi(Long multi) {
                this.multi = multi;
                return this;
            }

            /**
             * <p>The name of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-2zemyfd1sh1u2i****-proxy-14#1679****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The size of the fixed output buffer. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder obl(Long obl) {
                this.obl = obl;
                return this;
            }

            /**
             * <p>The number of objects contained in the output list.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder oll(Long oll) {
                this.oll = oll;
                return this;
            }

            /**
             * <p>The size of the output buffer. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder omem(Long omem) {
                this.omem = omem;
                return this;
            }

            /**
             * <p>The number of subscriptions that match the pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder psub(Long psub) {
                this.psub = psub;
                return this;
            }

            /**
             * <p>The size of the input buffer. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder qbuf(Long qbuf) {
                this.qbuf = qbuf;
                return this;
            }

            /**
             * <p>The remaining size of the input buffer. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder qbufFree(Long qbufFree) {
                this.qbufFree = qbufFree;
                return this;
            }

            /**
             * <p>The number of subscribed channels.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sub(Long sub) {
                this.sub = sub;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRedisAllSessionResponseBody} extends {@link TeaModel}
     *
     * <p>GetRedisAllSessionResponseBody</p>
     */
    public static class SourceStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("Ids")
        private java.util.List<Long> ids;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private SourceStats(Builder builder) {
            this.count = builder.count;
            this.ids = builder.ids;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceStats create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return ids
         */
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String count; 
            private java.util.List<Long> ids; 
            private String key; 

            private Builder() {
            } 

            private Builder(SourceStats model) {
                this.count = model.count;
                this.ids = model.ids;
                this.key = model.key;
            } 

            /**
             * <p>The total number of sessions from the access source.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The client IDs.</p>
             */
            public Builder ids(java.util.List<Long> ids) {
                this.ids = ids;
                return this;
            }

            /**
             * <p>The access source.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public SourceStats build() {
                return new SourceStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRedisAllSessionResponseBody} extends {@link TeaModel}
     *
     * <p>GetRedisAllSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List<Sessions> sessions;

        @com.aliyun.core.annotation.NameInMap("SourceStats")
        private java.util.List<SourceStats> sourceStats;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.sessions = builder.sessions;
            this.sourceStats = builder.sourceStats;
            this.timestamp = builder.timestamp;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sessions
         */
        public java.util.List<Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return sourceStats
         */
        public java.util.List<SourceStats> getSourceStats() {
            return this.sourceStats;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Sessions> sessions; 
            private java.util.List<SourceStats> sourceStats; 
            private Long timestamp; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.sessions = model.sessions;
                this.sourceStats = model.sourceStats;
                this.timestamp = model.timestamp;
                this.total = model.total;
            } 

            /**
             * <p>The information about the sessions.</p>
             */
            public Builder sessions(java.util.List<Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * <p>The statistics on the access source.</p>
             */
            public Builder sourceStats(java.util.List<SourceStats> sourceStats) {
                this.sourceStats = sourceStats;
                return this;
            }

            /**
             * <p>The time when the instance sessions were returned. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1660100753556</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The total number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
