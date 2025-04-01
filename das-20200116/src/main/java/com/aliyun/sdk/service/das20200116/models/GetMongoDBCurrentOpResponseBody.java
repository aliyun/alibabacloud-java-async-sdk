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
 * {@link GetMongoDBCurrentOpResponseBody} extends {@link TeaModel}
 *
 * <p>GetMongoDBCurrentOpResponseBody</p>
 */
public class GetMongoDBCurrentOpResponseBody extends TeaModel {
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

        private Builder(GetMongoDBCurrentOpResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the sessions.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
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
         * <p>FC6C0929-29E1-59FD-8DFE-70D9D41E****</p>
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

        public GetMongoDBCurrentOpResponseBody build() {
            return new GetMongoDBCurrentOpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMongoDBCurrentOpResponseBody} extends {@link TeaModel}
     *
     * <p>GetMongoDBCurrentOpResponseBody</p>
     */
    public static class SessionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("Client")
        private String client;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        private Long connectionId;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Driver")
        private String driver;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("KillPending")
        private Boolean killPending;

        @com.aliyun.core.annotation.NameInMap("Ns")
        private String ns;

        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("OpId")
        private String opId;

        @com.aliyun.core.annotation.NameInMap("OsArch")
        private String osArch;

        @com.aliyun.core.annotation.NameInMap("OsName")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PlanSummary")
        private String planSummary;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("SecsRunning")
        private Long secsRunning;

        @com.aliyun.core.annotation.NameInMap("Shard")
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

            private Builder() {
            } 

            private Builder(SessionList model) {
                this.active = model.active;
                this.client = model.client;
                this.command = model.command;
                this.connectionId = model.connectionId;
                this.desc = model.desc;
                this.driver = model.driver;
                this.host = model.host;
                this.killPending = model.killPending;
                this.ns = model.ns;
                this.op = model.op;
                this.opId = model.opId;
                this.osArch = model.osArch;
                this.osName = model.osName;
                this.osType = model.osType;
                this.planSummary = model.planSummary;
                this.platform = model.platform;
                this.secsRunning = model.secsRunning;
                this.shard = model.shard;
            } 

            /**
             * <p>Indicates whether the operation is active. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>219.143.177.4:52324</p>
             */
            public Builder client(String client) {
                this.client = client;
                return this;
            }

            /**
             * <p>The document that contains the complete command object associated with the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;command&quot; : {
             *   &quot;find&quot; : &quot;items&quot;,
             *   &quot;filter&quot; : {
             *     &quot;sku&quot; : 1403978
             *   },
             *   ...
             *   &quot;$db&quot; : &quot;test&quot;
             * }</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The connection ID.</p>
             * 
             * <strong>example:</strong>
             * <p>66378736</p>
             */
            public Builder connectionId(Long connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>The description of the connection.</p>
             * 
             * <strong>example:</strong>
             * <p>conn1013858</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The driver for MongoDB.</p>
             * 
             * <strong>example:</strong>
             * <p>mongo-java-driver|<a href="mailto:legacy@3.11.2">legacy@3.11.2</a></p>
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * <p>The host.</p>
             * 
             * <strong>example:</strong>
             * <p>a79******.cloud.et15:3328</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Indicates whether the operation is marked as terminated.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder killPending(Boolean killPending) {
                this.killPending = killPending;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>admin.cmd</p>
             */
            public Builder ns(String ns) {
                this.ns = ns;
                return this;
            }

            /**
             * <p>The type of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>update</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>The operation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>14508</p>
             */
            public Builder opId(String opId) {
                this.opId = opId;
                return this;
            }

            /**
             * <p>The architecture of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>amd64</p>
             */
            public Builder osArch(String osArch) {
                this.osArch = osArch;
                return this;
            }

            /**
             * <p>The name of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>The type of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The description of the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder planSummary(String planSummary) {
                this.planSummary = planSummary;
                return this;
            }

            /**
             * <p>The platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Java/Alibaba/1.8.0_152-b5</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The duration of the operation. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder secsRunning(Long secsRunning) {
                this.secsRunning = secsRunning;
                return this;
            }

            /**
             * <p>The ID of the data shard.</p>
             * <blockquote>
             * <p> This parameter is returned for sharded cluster instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>d-bp1689995b78****</p>
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
    /**
     * 
     * {@link GetMongoDBCurrentOpResponseBody} extends {@link TeaModel}
     *
     * <p>GetMongoDBCurrentOpResponseBody</p>
     */
    public static class SessionStat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("ClientStats")
        private java.util.Map<String, DataSessionStatClientStatsValue> clientStats;

        @com.aliyun.core.annotation.NameInMap("DbStats")
        private java.util.Map<String, DataSessionStatDbStatsValue> dbStats;

        @com.aliyun.core.annotation.NameInMap("LongestSecsRunning")
        private Long longestSecsRunning;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.Map<String, DataSessionStatClientStatsValue> getClientStats() {
            return this.clientStats;
        }

        /**
         * @return dbStats
         */
        public java.util.Map<String, DataSessionStatDbStatsValue> getDbStats() {
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
            private java.util.Map<String, DataSessionStatClientStatsValue> clientStats; 
            private java.util.Map<String, DataSessionStatDbStatsValue> dbStats; 
            private Long longestSecsRunning; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(SessionStat model) {
                this.activeCount = model.activeCount;
                this.clientStats = model.clientStats;
                this.dbStats = model.dbStats;
                this.longestSecsRunning = model.longestSecsRunning;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of active sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The statistics on the IP addresses of the clients.</p>
             */
            public Builder clientStats(java.util.Map<String, DataSessionStatClientStatsValue> clientStats) {
                this.clientStats = clientStats;
                return this;
            }

            /**
             * <p>The statistics on the namespaces.</p>
             */
            public Builder dbStats(java.util.Map<String, DataSessionStatDbStatsValue> dbStats) {
                this.dbStats = dbStats;
                return this;
            }

            /**
             * <p>The longest duration of a session. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder longestSecsRunning(Long longestSecsRunning) {
                this.longestSecsRunning = longestSecsRunning;
                return this;
            }

            /**
             * <p>The total number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
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
    /**
     * 
     * {@link GetMongoDBCurrentOpResponseBody} extends {@link TeaModel}
     *
     * <p>GetMongoDBCurrentOpResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionList")
        private java.util.List<SessionList> sessionList;

        @com.aliyun.core.annotation.NameInMap("SessionStat")
        private SessionStat sessionStat;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
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
        public java.util.List<SessionList> getSessionList() {
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
            private java.util.List<SessionList> sessionList; 
            private SessionStat sessionStat; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.sessionList = model.sessionList;
                this.sessionStat = model.sessionStat;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The sessions.</p>
             */
            public Builder sessionList(java.util.List<SessionList> sessionList) {
                this.sessionList = sessionList;
                return this;
            }

            /**
             * <p>The statistics on the sessions.</p>
             */
            public Builder sessionStat(SessionStat sessionStat) {
                this.sessionStat = sessionStat;
                return this;
            }

            /**
             * <p>The time when the database sessions were returned. The value is in the UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1692029584428</p>
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
