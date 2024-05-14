// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMySQLAllSessionAsyncResponseBody} extends {@link TeaModel}
 *
 * <p>GetMySQLAllSessionAsyncResponseBody</p>
 */
public class GetMySQLAllSessionAsyncResponseBody extends TeaModel {
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

    private GetMySQLAllSessionAsyncResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMySQLAllSessionAsyncResponseBody create() {
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
         * The data returned.
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

        public GetMySQLAllSessionAsyncResponseBody build() {
            return new GetMySQLAllSessionAsyncResponseBody(this);
        } 

    } 

    public static class ClientStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ThreadIdList")
        private java.util.List < Long > threadIdList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("UserList")
        private java.util.List < String > userList;

        private ClientStats(Builder builder) {
            this.activeCount = builder.activeCount;
            this.key = builder.key;
            this.threadIdList = builder.threadIdList;
            this.totalCount = builder.totalCount;
            this.userList = builder.userList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientStats create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return threadIdList
         */
        public java.util.List < Long > getThreadIdList() {
            return this.threadIdList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userList
         */
        public java.util.List < String > getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private Long activeCount; 
            private String key; 
            private java.util.List < Long > threadIdList; 
            private Long totalCount; 
            private java.util.List < String > userList; 

            /**
             * The number of active sessions that belong to the client IP address.
             * <p>
             * 
             * >  If the type of the command executed in the session is Query or Execute and the session in the transaction is not terminated, the session is active.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * The IP address of the client.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The IDs of the sessions that belong to the client IP address.
             */
            public Builder threadIdList(java.util.List < Long > threadIdList) {
                this.threadIdList = threadIdList;
                return this;
            }

            /**
             * The total number of sessions that belong to the client IP address.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The database accounts to which the sessions belong.
             */
            public Builder userList(java.util.List < String > userList) {
                this.userList = userList;
                return this;
            }

            public ClientStats build() {
                return new ClientStats(this);
            } 

        } 

    }
    public static class DbStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ThreadIdList")
        private java.util.List < Long > threadIdList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("UserList")
        private java.util.List < String > userList;

        private DbStats(Builder builder) {
            this.activeCount = builder.activeCount;
            this.key = builder.key;
            this.threadIdList = builder.threadIdList;
            this.totalCount = builder.totalCount;
            this.userList = builder.userList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbStats create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return threadIdList
         */
        public java.util.List < Long > getThreadIdList() {
            return this.threadIdList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userList
         */
        public java.util.List < String > getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private Long activeCount; 
            private String key; 
            private java.util.List < Long > threadIdList; 
            private Long totalCount; 
            private java.util.List < String > userList; 

            /**
             * The number of active sessions of the database.
             * <p>
             * 
             * >  If the type of the command executed in the session is Query or Execute and the session in the transaction is not terminated, the session is active.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * The database name.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The IDs of the sessions of the database.
             */
            public Builder threadIdList(java.util.List < Long > threadIdList) {
                this.threadIdList = threadIdList;
                return this;
            }

            /**
             * The total number of sessions of the database.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The database accounts to which the sessions belong.
             */
            public Builder userList(java.util.List < String > userList) {
                this.userList = userList;
                return this;
            }

            public DbStats build() {
                return new DbStats(this);
            } 

        } 

    }
    public static class SessionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Client")
        private String client;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private Long sessionId;

        @com.aliyun.core.annotation.NameInMap("SqlTemplateId")
        private String sqlTemplateId;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TrxDuration")
        private Long trxDuration;

        @com.aliyun.core.annotation.NameInMap("TrxId")
        private String trxId;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("UserClientAlias")
        private String userClientAlias;

        private SessionList(Builder builder) {
            this.client = builder.client;
            this.command = builder.command;
            this.dbName = builder.dbName;
            this.sessionId = builder.sessionId;
            this.sqlTemplateId = builder.sqlTemplateId;
            this.sqlText = builder.sqlText;
            this.state = builder.state;
            this.time = builder.time;
            this.trxDuration = builder.trxDuration;
            this.trxId = builder.trxId;
            this.user = builder.user;
            this.userClientAlias = builder.userClientAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionList create() {
            return builder().build();
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
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return sessionId
         */
        public Long getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sqlTemplateId
         */
        public String getSqlTemplateId() {
            return this.sqlTemplateId;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return trxDuration
         */
        public Long getTrxDuration() {
            return this.trxDuration;
        }

        /**
         * @return trxId
         */
        public String getTrxId() {
            return this.trxId;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return userClientAlias
         */
        public String getUserClientAlias() {
            return this.userClientAlias;
        }

        public static final class Builder {
            private String client; 
            private String command; 
            private String dbName; 
            private Long sessionId; 
            private String sqlTemplateId; 
            private String sqlText; 
            private String state; 
            private Long time; 
            private Long trxDuration; 
            private String trxId; 
            private String user; 
            private String userClientAlias; 

            /**
             * The IP address of the client.
             */
            public Builder client(String client) {
                this.client = client;
                return this;
            }

            /**
             * The type of the command executed in the session.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The database name.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The session ID.
             */
            public Builder sessionId(Long sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * The SQL template ID.
             * <p>
             * 
             * >  This parameter is returned only when you use a PolarDB-X 2.0 instance.
             */
            public Builder sqlTemplateId(String sqlTemplateId) {
                this.sqlTemplateId = sqlTemplateId;
                return this;
            }

            /**
             * The SQL statement executed in the session.
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * The status of the session.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The execution duration of the session. Unit: seconds.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * The duration of the transaction. Unit: seconds.
             */
            public Builder trxDuration(Long trxDuration) {
                this.trxDuration = trxDuration;
                return this;
            }

            /**
             * The ID of the transaction to which the session belongs.
             */
            public Builder trxId(String trxId) {
                this.trxId = trxId;
                return this;
            }

            /**
             * The username of the database account.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * The alias of the IP address of the client.
             */
            public Builder userClientAlias(String userClientAlias) {
                this.userClientAlias = userClientAlias;
                return this;
            }

            public SessionList build() {
                return new SessionList(this);
            } 

        } 

    }
    public static class UserStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ThreadIdList")
        private java.util.List < Long > threadIdList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("UserList")
        private java.util.List < String > userList;

        private UserStats(Builder builder) {
            this.activeCount = builder.activeCount;
            this.key = builder.key;
            this.threadIdList = builder.threadIdList;
            this.totalCount = builder.totalCount;
            this.userList = builder.userList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStats create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return threadIdList
         */
        public java.util.List < Long > getThreadIdList() {
            return this.threadIdList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userList
         */
        public java.util.List < String > getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private Long activeCount; 
            private String key; 
            private java.util.List < Long > threadIdList; 
            private Long totalCount; 
            private java.util.List < String > userList; 

            /**
             * The number of active sessions within the account.
             * <p>
             * 
             * >  If the type of the command executed in the session is Query or Execute and the session in the transaction is not terminated, the session is active.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * The database account.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The IDs of the sessions within the account.
             */
            public Builder threadIdList(java.util.List < Long > threadIdList) {
                this.threadIdList = threadIdList;
                return this;
            }

            /**
             * The total number of sessions within the account.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The database accounts to which the sessions belong.
             */
            public Builder userList(java.util.List < String > userList) {
                this.userList = userList;
                return this;
            }

            public UserStats build() {
                return new UserStats(this);
            } 

        } 

    }
    public static class SessionData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveSessionCount")
        private Long activeSessionCount;

        @com.aliyun.core.annotation.NameInMap("ClientStats")
        private java.util.List < ClientStats> clientStats;

        @com.aliyun.core.annotation.NameInMap("DbStats")
        private java.util.List < DbStats> dbStats;

        @com.aliyun.core.annotation.NameInMap("MaxActiveTime")
        private Long maxActiveTime;

        @com.aliyun.core.annotation.NameInMap("SessionList")
        private java.util.List < SessionList> sessionList;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private Long timeStamp;

        @com.aliyun.core.annotation.NameInMap("TotalSessionCount")
        private Long totalSessionCount;

        @com.aliyun.core.annotation.NameInMap("UserStats")
        private java.util.List < UserStats> userStats;

        private SessionData(Builder builder) {
            this.activeSessionCount = builder.activeSessionCount;
            this.clientStats = builder.clientStats;
            this.dbStats = builder.dbStats;
            this.maxActiveTime = builder.maxActiveTime;
            this.sessionList = builder.sessionList;
            this.timeStamp = builder.timeStamp;
            this.totalSessionCount = builder.totalSessionCount;
            this.userStats = builder.userStats;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionData create() {
            return builder().build();
        }

        /**
         * @return activeSessionCount
         */
        public Long getActiveSessionCount() {
            return this.activeSessionCount;
        }

        /**
         * @return clientStats
         */
        public java.util.List < ClientStats> getClientStats() {
            return this.clientStats;
        }

        /**
         * @return dbStats
         */
        public java.util.List < DbStats> getDbStats() {
            return this.dbStats;
        }

        /**
         * @return maxActiveTime
         */
        public Long getMaxActiveTime() {
            return this.maxActiveTime;
        }

        /**
         * @return sessionList
         */
        public java.util.List < SessionList> getSessionList() {
            return this.sessionList;
        }

        /**
         * @return timeStamp
         */
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return totalSessionCount
         */
        public Long getTotalSessionCount() {
            return this.totalSessionCount;
        }

        /**
         * @return userStats
         */
        public java.util.List < UserStats> getUserStats() {
            return this.userStats;
        }

        public static final class Builder {
            private Long activeSessionCount; 
            private java.util.List < ClientStats> clientStats; 
            private java.util.List < DbStats> dbStats; 
            private Long maxActiveTime; 
            private java.util.List < SessionList> sessionList; 
            private Long timeStamp; 
            private Long totalSessionCount; 
            private java.util.List < UserStats> userStats; 

            /**
             * The total number of active sessions.
             */
            public Builder activeSessionCount(Long activeSessionCount) {
                this.activeSessionCount = activeSessionCount;
                return this;
            }

            /**
             * The sessions that are counted by client IP address.
             */
            public Builder clientStats(java.util.List < ClientStats> clientStats) {
                this.clientStats = clientStats;
                return this;
            }

            /**
             * The sessions that are counted by database.
             */
            public Builder dbStats(java.util.List < DbStats> dbStats) {
                this.dbStats = dbStats;
                return this;
            }

            /**
             * The maximum execution duration of an active session. Unit: seconds.
             */
            public Builder maxActiveTime(Long maxActiveTime) {
                this.maxActiveTime = maxActiveTime;
                return this;
            }

            /**
             * The sessions.
             */
            public Builder sessionList(java.util.List < SessionList> sessionList) {
                this.sessionList = sessionList;
                return this;
            }

            /**
             * The time when the session was queried. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder timeStamp(Long timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The total number of sessions.
             */
            public Builder totalSessionCount(Long totalSessionCount) {
                this.totalSessionCount = totalSessionCount;
                return this;
            }

            /**
             * The sessions that are counted by database account.
             */
            public Builder userStats(java.util.List < UserStats> userStats) {
                this.userStats = userStats;
                return this;
            }

            public SessionData build() {
                return new SessionData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Complete")
        private Boolean complete;

        @com.aliyun.core.annotation.NameInMap("Fail")
        private Boolean fail;

        @com.aliyun.core.annotation.NameInMap("IsFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("ResultId")
        private String resultId;

        @com.aliyun.core.annotation.NameInMap("SessionData")
        private SessionData sessionData;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.complete = builder.complete;
            this.fail = builder.fail;
            this.isFinish = builder.isFinish;
            this.resultId = builder.resultId;
            this.sessionData = builder.sessionData;
            this.state = builder.state;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return complete
         */
        public Boolean getComplete() {
            return this.complete;
        }

        /**
         * @return fail
         */
        public Boolean getFail() {
            return this.fail;
        }

        /**
         * @return isFinish
         */
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        /**
         * @return resultId
         */
        public String getResultId() {
            return this.resultId;
        }

        /**
         * @return sessionData
         */
        public SessionData getSessionData() {
            return this.sessionData;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Boolean complete; 
            private Boolean fail; 
            private Boolean isFinish; 
            private String resultId; 
            private SessionData sessionData; 
            private String state; 
            private Long timestamp; 

            /**
             * Indicates whether the asynchronous request was complete. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder complete(Boolean complete) {
                this.complete = complete;
                return this;
            }

            /**
             * Indicates whether the asynchronous request failed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder fail(Boolean fail) {
                this.fail = fail;
                return this;
            }

            /**
             * Indicates whether the asynchronous request was complete. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * The ID of the asynchronous request.
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * The session data.
             */
            public Builder sessionData(SessionData sessionData) {
                this.sessionData = sessionData;
                return this;
            }

            /**
             * The state of the asynchronous request. Valid values:
             * <p>
             * 
             * *   **RUNNING**
             * *   **SUCCESS**
             * *   **FAIL**
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The time when the asynchronous request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
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
