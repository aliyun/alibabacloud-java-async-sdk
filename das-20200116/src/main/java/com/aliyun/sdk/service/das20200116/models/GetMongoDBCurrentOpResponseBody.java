// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMongoDBCurrentOpResponseBody} extends {@link TeaModel}
 *
 * <p>GetMongoDBCurrentOpResponseBody</p>
 */
public class GetMongoDBCurrentOpResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMongoDBCurrentOpResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMongoDBCurrentOpResponseBody create() {
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
         * The response code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the sessions.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. Otherwise, an error message such as an error code is returned.
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

        public GetMongoDBCurrentOpResponseBody build() {
            return new GetMongoDBCurrentOpResponseBody(this);
        } 

    } 

    public static class SessionList extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("Client")
        private String client;

        @NameInMap("Command")
        private String command;

        @NameInMap("ConnectionId")
        private Long connectionId;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("Driver")
        private String driver;

        @NameInMap("Host")
        private String host;

        @NameInMap("KillPending")
        private Boolean killPending;

        @NameInMap("Ns")
        private String ns;

        @NameInMap("Op")
        private String op;

        @NameInMap("OpId")
        private String opId;

        @NameInMap("OsArch")
        private String osArch;

        @NameInMap("OsName")
        private String osName;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("PlanSummary")
        private String planSummary;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("SecsRunning")
        private Long secsRunning;

        @NameInMap("Shard")
        private String shard;

        private SessionList(Builder builder) {
            this.active = builder.active;
            this.client = builder.client;
            this.command = builder.command;
            this.connectionId = builder.connectionId;
            this.desc = builder.desc;
            this.driver = builder.driver;
            this.host = builder.host;
            this.killPending = builder.killPending;
            this.ns = builder.ns;
            this.op = builder.op;
            this.opId = builder.opId;
            this.osArch = builder.osArch;
            this.osName = builder.osName;
            this.osType = builder.osType;
            this.planSummary = builder.planSummary;
            this.platform = builder.platform;
            this.secsRunning = builder.secsRunning;
            this.shard = builder.shard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionList create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return client
         */
        public String getClient() {
            return this.client;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return connectionId
         */
        public Long getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return driver
         */
        public String getDriver() {
            return this.driver;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return killPending
         */
        public Boolean getKillPending() {
            return this.killPending;
        }

        /**
         * @return ns
         */
        public String getNs() {
            return this.ns;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return opId
         */
        public String getOpId() {
            return this.opId;
        }

        /**
         * @return osArch
         */
        public String getOsArch() {
            return this.osArch;
        }

        /**
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return planSummary
         */
        public String getPlanSummary() {
            return this.planSummary;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return secsRunning
         */
        public Long getSecsRunning() {
            return this.secsRunning;
        }

        /**
         * @return shard
         */
        public String getShard() {
            return this.shard;
        }

        public static final class Builder {
            private Boolean active; 
            private String client; 
            private String command; 
            private Long connectionId; 
            private String desc; 
            private String driver; 
            private String host; 
            private Boolean killPending; 
            private String ns; 
            private String op; 
            private String opId; 
            private String osArch; 
            private String osName; 
            private String osType; 
            private String planSummary; 
            private String platform; 
            private Long secsRunning; 
            private String shard; 

            /**
             * Indicates whether the operation is active.
             */
            public Builder active(Boolean active) {
                this.active = active;
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
             * The document that contains the complete command object associated with the operation.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The connection ID.
             */
            public Builder connectionId(Long connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * The description of the connection.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The driver.
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * The host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Indicates whether the operation is marked as terminated. If the operation is marked as terminated, true is returned.
             */
            public Builder killPending(Boolean killPending) {
                this.killPending = killPending;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder ns(String ns) {
                this.ns = ns;
                return this;
            }

            /**
             * The type of the operation.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * The operation ID.
             */
            public Builder opId(String opId) {
                this.opId = opId;
                return this;
            }

            /**
             * The architecture of the operating system.
             */
            public Builder osArch(String osArch) {
                this.osArch = osArch;
                return this;
            }

            /**
             * The name of the operating system.
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * The type of the operating system.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The description of the execution plan.
             */
            public Builder planSummary(String planSummary) {
                this.planSummary = planSummary;
                return this;
            }

            /**
             * The platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The duration of the operation. Unit: seconds.
             */
            public Builder secsRunning(Long secsRunning) {
                this.secsRunning = secsRunning;
                return this;
            }

            /**
             * The shard.
             */
            public Builder shard(String shard) {
                this.shard = shard;
                return this;
            }

            public SessionList build() {
                return new SessionList(this);
            } 

        } 

    }
    public static class SessionStat extends TeaModel {
        @NameInMap("ActiveCount")
        private Long activeCount;

        @NameInMap("ClientStats")
        private java.util.Map < String, DataSessionStatClientStatsValue > clientStats;

        @NameInMap("DbStats")
        private java.util.Map < String, DataSessionStatDbStatsValue > dbStats;

        @NameInMap("LongestSecsRunning")
        private Long longestSecsRunning;

        @NameInMap("TotalCount")
        private Long totalCount;

        private SessionStat(Builder builder) {
            this.activeCount = builder.activeCount;
            this.clientStats = builder.clientStats;
            this.dbStats = builder.dbStats;
            this.longestSecsRunning = builder.longestSecsRunning;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionStat create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return clientStats
         */
        public java.util.Map < String, DataSessionStatClientStatsValue > getClientStats() {
            return this.clientStats;
        }

        /**
         * @return dbStats
         */
        public java.util.Map < String, DataSessionStatDbStatsValue > getDbStats() {
            return this.dbStats;
        }

        /**
         * @return longestSecsRunning
         */
        public Long getLongestSecsRunning() {
            return this.longestSecsRunning;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long activeCount; 
            private java.util.Map < String, DataSessionStatClientStatsValue > clientStats; 
            private java.util.Map < String, DataSessionStatDbStatsValue > dbStats; 
            private Long longestSecsRunning; 
            private Long totalCount; 

            /**
             * The number of active sessions.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * The statistics on the IP addresses of the clients.
             */
            public Builder clientStats(java.util.Map < String, DataSessionStatClientStatsValue > clientStats) {
                this.clientStats = clientStats;
                return this;
            }

            /**
             * The statistics on the namespaces.
             */
            public Builder dbStats(java.util.Map < String, DataSessionStatDbStatsValue > dbStats) {
                this.dbStats = dbStats;
                return this;
            }

            /**
             * The longest duration of a session. Unit: seconds.
             */
            public Builder longestSecsRunning(Long longestSecsRunning) {
                this.longestSecsRunning = longestSecsRunning;
                return this;
            }

            /**
             * The total number of sessions.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public SessionStat build() {
                return new SessionStat(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SessionList")
        private java.util.List < SessionList> sessionList;

        @NameInMap("SessionStat")
        private SessionStat sessionStat;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.sessionList = builder.sessionList;
            this.sessionStat = builder.sessionStat;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sessionList
         */
        public java.util.List < SessionList> getSessionList() {
            return this.sessionList;
        }

        /**
         * @return sessionStat
         */
        public SessionStat getSessionStat() {
            return this.sessionStat;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private java.util.List < SessionList> sessionList; 
            private SessionStat sessionStat; 
            private Long timestamp; 

            /**
             * The sessions.
             */
            public Builder sessionList(java.util.List < SessionList> sessionList) {
                this.sessionList = sessionList;
                return this;
            }

            /**
             * The statistics on the sessions.
             */
            public Builder sessionStat(SessionStat sessionStat) {
                this.sessionStat = sessionStat;
                return this;
            }

            /**
             * The time when the database sessions were returned. The value is in the UNIX timestamp format. Unit: milliseconds.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
