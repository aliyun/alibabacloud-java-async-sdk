// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The session data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRedisAllSessionResponseBody build() {
            return new GetRedisAllSessionResponseBody(this);
        } 

    } 

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

            /**
             * The IP address and port number of the client.
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * The connection duration of the session. Unit: seconds.
             */
            public Builder age(String age) {
                this.age = age;
                return this;
            }

            /**
             * The IP address of the client.
             */
            public Builder client(String client) {
                this.client = client;
                return this;
            }

            /**
             * The alias of the client.
             */
            public Builder clientDesc(String clientDesc) {
                this.clientDesc = clientDesc;
                return this;
            }

            /**
             * The command that was last run.
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * The ID of the database that the client is using.
             */
            public Builder db(Long db) {
                this.db = db;
                return this;
            }

            /**
             * The file descriptor event. Valid values:
             * <p>
             * 
             * *   **r**: Client sockets are readable in the event loop.
             * *   **w**: Client sockets are writable in the event loop.
             */
            public Builder events(String events) {
                this.events = events;
                return this;
            }

            /**
             * The file descriptor that is used by sockets.
             */
            public Builder fd(Long fd) {
                this.fd = fd;
                return this;
            }

            /**
             * The client flag. Valid values:
             * <p>
             * 
             * *   **A**: The connection needs to be closed at the earliest opportunity.
             * *   **b**: The client is waiting for blocked events.
             * *   **c**: The connection is closed after all replies are written.
             * *   **d**: The monitored keys have been modified, and the `EXEC` command is about to fail.
             * *   **i**: The client is waiting for VM I/O operations. This value is no longer used.
             * *   **M**: The client is the primary node.
             * *   **N**: No special flags are configured.
             * *   **O**: The client is in monitor mode.
             * *   **r**: The client is a cluster node in read-only mode.
             * *   **S**: The client is a replica node in normal mode.
             * *   **u**: The client is not blocked.
             * *   **U**: The client is connected by using UNIX domain sockets.
             * *   **x**: The client is executing a transaction.
             */
            public Builder flags(String flags) {
                this.flags = flags;
                return this;
            }

            /**
             * The client ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The duration during which the session is in the idle state. Unit: seconds.
             */
            public Builder idle(Long idle) {
                this.idle = idle;
                return this;
            }

            /**
             * The number of commands in `MULTI` or `EXEC`.
             */
            public Builder multi(Long multi) {
                this.multi = multi;
                return this;
            }

            /**
             * The name of the client.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The size of the fixed output buffer. Unit: bytes.
             */
            public Builder obl(Long obl) {
                this.obl = obl;
                return this;
            }

            /**
             * The number of objects contained in the output list.
             */
            public Builder oll(Long oll) {
                this.oll = oll;
                return this;
            }

            /**
             * The size of the output buffer. Unit: bytes.
             */
            public Builder omem(Long omem) {
                this.omem = omem;
                return this;
            }

            /**
             * The number of subscriptions that match the pattern.
             */
            public Builder psub(Long psub) {
                this.psub = psub;
                return this;
            }

            /**
             * The size of the input buffer. Unit: bytes.
             */
            public Builder qbuf(Long qbuf) {
                this.qbuf = qbuf;
                return this;
            }

            /**
             * The remaining size of the input buffer. Unit: bytes.
             */
            public Builder qbufFree(Long qbufFree) {
                this.qbufFree = qbufFree;
                return this;
            }

            /**
             * The number of subscribed channels.
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
    public static class SourceStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("Ids")
        private java.util.List < Long > ids;

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
        public java.util.List < Long > getIds() {
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
            private java.util.List < Long > ids; 
            private String key; 

            /**
             * The total number of sessions from the access source.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * The client IDs.
             */
            public Builder ids(java.util.List < Long > ids) {
                this.ids = ids;
                return this;
            }

            /**
             * The access source.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List < Sessions> sessions;

        @com.aliyun.core.annotation.NameInMap("SourceStats")
        private java.util.List < SourceStats> sourceStats;

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
        public java.util.List < Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return sourceStats
         */
        public java.util.List < SourceStats> getSourceStats() {
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
            private java.util.List < Sessions> sessions; 
            private java.util.List < SourceStats> sourceStats; 
            private Long timestamp; 
            private Long total; 

            /**
             * The information about the sessions.
             */
            public Builder sessions(java.util.List < Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * The statistics on the access source.
             */
            public Builder sourceStats(java.util.List < SourceStats> sourceStats) {
                this.sourceStats = sourceStats;
                return this;
            }

            /**
             * The time when the instance sessions were returned. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The total number of sessions.
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
