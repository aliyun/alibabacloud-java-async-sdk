// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKillInstanceSessionTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetKillInstanceSessionTaskResultResponseBody</p>
 */
public class GetKillInstanceSessionTaskResultResponseBody extends TeaModel {
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

    private GetKillInstanceSessionTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKillInstanceSessionTaskResultResponseBody create() {
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
         * >  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.
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

        public GetKillInstanceSessionTaskResultResponseBody build() {
            return new GetKillInstanceSessionTaskResultResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("Command")
        private String command;

        @NameInMap("Db")
        private String db;

        @NameInMap("Host")
        private String host;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Info")
        private String info;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("State")
        private String state;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Time")
        private Long time;

        @NameInMap("User")
        private String user;

        private Result(Builder builder) {
            this.active = builder.active;
            this.command = builder.command;
            this.db = builder.db;
            this.host = builder.host;
            this.id = builder.id;
            this.info = builder.info;
            this.reason = builder.reason;
            this.state = builder.state;
            this.taskId = builder.taskId;
            this.time = builder.time;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return db
         */
        public String getDb() {
            return this.db;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Boolean active; 
            private String command; 
            private String db; 
            private String host; 
            private Long id; 
            private String info; 
            private String reason; 
            private String state; 
            private String taskId; 
            private Long time; 
            private String user; 

            /**
             * Indicates whether the session is active.
             * <p>
             * 
             * > If the type of the command is Query or Execute and the session in the transaction is not terminated, the session is active.
             */
            public Builder active(Boolean active) {
                this.active = active;
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
             * The name of the database.
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * The IP address and port number of the host that initiated the session.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The session ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The SQL statement executed in the session.
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * The description of the session when the session was terminated.
             * <p>
             * 
             * *   **SESSION_KILLED**: The session is terminated.
             * *   **SESSION_EXPIRED**: The session has expired.
             * *   **SESSION_NO_PERMISSION**: The account used to terminate the session has insufficient permissions.
             * *   **SESSION_ACCOUNT_ERROR**: The account or password used to terminate the session is invalid.
             * *   **SESSION_IGNORED_USER**: The session of the account does not need to be terminated.
             * *   **SESSION_INTERNAL_USER_OR_COMMAND**: The session is a session initiated by or a command run by an Alibaba Cloud O\&M account.
             * *   **SESSION_KILL_TASK_TIMEOUT**: Timeout occurs when the session is terminated.
             * *   **SESSION_OTHER_ERROR**: Other errors occurred.
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
             * The ID of the subtask that terminates the session.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The execution duration. Unit: seconds.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * The account of the database.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("IgnoredUserSessionCount")
        private Long ignoredUserSessionCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("KillFailCount")
        private Long killFailCount;

        @NameInMap("KillSuccessCount")
        private Long killSuccessCount;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("Sessions")
        private java.util.List < Long > sessions;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskState")
        private String taskState;

        @NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.ignoredUserSessionCount = builder.ignoredUserSessionCount;
            this.instanceId = builder.instanceId;
            this.killFailCount = builder.killFailCount;
            this.killSuccessCount = builder.killSuccessCount;
            this.nodeId = builder.nodeId;
            this.result = builder.result;
            this.sessions = builder.sessions;
            this.taskId = builder.taskId;
            this.taskState = builder.taskState;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ignoredUserSessionCount
         */
        public Long getIgnoredUserSessionCount() {
            return this.ignoredUserSessionCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return killFailCount
         */
        public Long getKillFailCount() {
            return this.killFailCount;
        }

        /**
         * @return killSuccessCount
         */
        public Long getKillSuccessCount() {
            return this.killSuccessCount;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return sessions
         */
        public java.util.List < Long > getSessions() {
            return this.sessions;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskState
         */
        public String getTaskState() {
            return this.taskState;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long ignoredUserSessionCount; 
            private String instanceId; 
            private Long killFailCount; 
            private Long killSuccessCount; 
            private String nodeId; 
            private java.util.List < Result> result; 
            private java.util.List < Long > sessions; 
            private String taskId; 
            private String taskState; 
            private String userId; 

            /**
             * The number of ignored sessions, including sessions of the accounts that are specified by IgnoredUsers, sessions of internal O\&M accounts of Alibaba Cloud, and **Binlog Dump** sessions.
             */
            public Builder ignoredUserSessionCount(Long ignoredUserSessionCount) {
                this.ignoredUserSessionCount = ignoredUserSessionCount;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The number of sessions that failed to be terminated.
             */
            public Builder killFailCount(Long killFailCount) {
                this.killFailCount = killFailCount;
                return this;
            }

            /**
             * The number of sessions that were terminated.
             */
            public Builder killSuccessCount(Long killSuccessCount) {
                this.killSuccessCount = killSuccessCount;
                return this;
            }

            /**
             * The node ID.
             * <p>
             * 
             * >  This parameter is returned only if the instance is a PolarDB for MySQL cluster.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The details of the task that terminated sessions.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The session IDs.
             * <p>
             * 
             * >  If all sessions are terminated, the IDs of all sessions on the instance or node are returned.
             */
            public Builder sessions(java.util.List < Long > sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The state of the task that terminates sessions.
             * <p>
             * 
             * *   **RUNNING**: The task is in progress.
             * *   **SUCCESS**: The task is successful.
             * *   **FAILURE**: The task failed.
             * *   **ERROR**: Other errors occur.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
