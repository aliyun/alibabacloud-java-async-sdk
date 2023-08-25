// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KillProcessListResponseBody} extends {@link TeaModel}
 *
 * <p>KillProcessListResponseBody</p>
 */
public class KillProcessListResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private KillProcessListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KillProcessListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public KillProcessListResponseBody build() {
            return new KillProcessListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("Command")
        private String command;

        @NameInMap("Database")
        private String database;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ExecuteTime")
        private String executeTime;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("SessionId")
        private Long sessionId;

        @NameInMap("SqlText")
        private String sqlText;

        @NameInMap("Status")
        private String status;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("User")
        private String user;

        private Data(Builder builder) {
            this.clientIp = builder.clientIp;
            this.command = builder.command;
            this.database = builder.database;
            this.errorMessage = builder.errorMessage;
            this.executeTime = builder.executeTime;
            this.serverIp = builder.serverIp;
            this.sessionId = builder.sessionId;
            this.sqlText = builder.sqlText;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return sessionId
         */
        public Long getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String clientIp; 
            private String command; 
            private String database; 
            private String errorMessage; 
            private String executeTime; 
            private String serverIp; 
            private Long sessionId; 
            private String sqlText; 
            private String status; 
            private String tenantId; 
            private String user; 

            /**
             * The client IP address.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The start command for the container of the application.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The error message.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Execution time (UTC+8). If it is left empty, it means to execute immediately.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The IP address of the server.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * The ID of the session.
             */
            public Builder sessionId(Long sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * The SQL statement.
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * The status of the task.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The database username.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
