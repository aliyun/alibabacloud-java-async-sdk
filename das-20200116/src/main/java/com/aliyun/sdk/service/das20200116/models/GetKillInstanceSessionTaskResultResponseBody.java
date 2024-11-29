// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetKillInstanceSessionTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetKillInstanceSessionTaskResultResponseBody</p>
 */
public class GetKillInstanceSessionTaskResultResponseBody extends TeaModel {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
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
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
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

        public GetKillInstanceSessionTaskResultResponseBody build() {
            return new GetKillInstanceSessionTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKillInstanceSessionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetKillInstanceSessionTaskResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("Db")
        private String db;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Info")
        private String info;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("User")
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
             * <p>Indicates whether the session is active.</p>
             * <blockquote>
             * <p>If the type of the command is Query or Execute and the session in the transaction is not terminated, the session is active.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The type of the command executed in the session.</p>
             * 
             * <strong>example:</strong>
             * <p>Sleep</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>dbTest</p>
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The IP address and port number of the host that initiated the session.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.XX.XX:23428</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8357518</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The SQL statement executed in the session.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT sleep(60)</p>
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The description of the session when the session was terminated.</p>
             * <ul>
             * <li><strong>SESSION_KILLED</strong>: The session is terminated.</li>
             * <li><strong>SESSION_EXPIRED</strong>: The session has expired.</li>
             * <li><strong>SESSION_NO_PERMISSION</strong>: The account used to terminate the session has insufficient permissions.</li>
             * <li><strong>SESSION_ACCOUNT_ERROR</strong>: The account or password used to terminate the session is invalid.</li>
             * <li><strong>SESSION_IGNORED_USER</strong>: The session of the account does not need to be terminated.</li>
             * <li><strong>SESSION_INTERNAL_USER_OR_COMMAND</strong>: The session is a session initiated by or a command run by an Alibaba Cloud O&amp;M account.</li>
             * <li><strong>SESSION_KILL_TASK_TIMEOUT</strong>: Timeout occurs when the session is terminated.</li>
             * <li><strong>SESSION_OTHER_ERROR</strong>: Other errors occurred.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SESSION_KILLED</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The status of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>Sending data</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The ID of the subtask that terminates the session.</p>
             * 
             * <strong>example:</strong>
             * <p>task_d9e94107-6116-4ac3-b874-81466aff****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The execution duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The account of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
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
    /**
     * 
     * {@link GetKillInstanceSessionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetKillInstanceSessionTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IgnoredUserSessionCount")
        private Long ignoredUserSessionCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KillFailCount")
        private Long killFailCount;

        @com.aliyun.core.annotation.NameInMap("KillSuccessCount")
        private Long killSuccessCount;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List < Long > sessions;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private String taskState;

        @com.aliyun.core.annotation.NameInMap("UserId")
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
             * <p>The number of ignored sessions, including sessions of the accounts that are specified by IgnoredUsers, sessions of internal O&amp;M accounts of Alibaba Cloud, and <strong>Binlog Dump</strong> sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder ignoredUserSessionCount(Long ignoredUserSessionCount) {
                this.ignoredUserSessionCount = ignoredUserSessionCount;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze1jdv45i7l6****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number of sessions that failed to be terminated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder killFailCount(Long killFailCount) {
                this.killFailCount = killFailCount;
                return this;
            }

            /**
             * <p>The number of sessions that were terminated.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder killSuccessCount(Long killSuccessCount) {
                this.killSuccessCount = killSuccessCount;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * <blockquote>
             * <p> This parameter is returned only if the instance is a PolarDB for MySQL cluster.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pi-bp1h12rv501cv****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The details of the task that terminated sessions.</p>
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The session IDs.</p>
             * <blockquote>
             * <p> If all sessions are terminated, the IDs of all sessions on the instance or node are returned.</p>
             * </blockquote>
             */
            public Builder sessions(java.util.List < Long > sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f77d535b45405bd462b21caa3ee8****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The state of the task that terminates sessions.</p>
             * <ul>
             * <li><strong>RUNNING</strong>: The task is in progress.</li>
             * <li><strong>SUCCESS</strong>: The task is successful.</li>
             * <li><strong>FAILURE</strong>: The task failed.</li>
             * <li><strong>ERROR</strong>: Other errors occur.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>164882191396****</p>
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
