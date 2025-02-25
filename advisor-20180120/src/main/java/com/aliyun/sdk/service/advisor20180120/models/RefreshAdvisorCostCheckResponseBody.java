// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link RefreshAdvisorCostCheckResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshAdvisorCostCheckResponseBody</p>
 */
public class RefreshAdvisorCostCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RefreshAdvisorCostCheckResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAdvisorCostCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RefreshAdvisorCostCheckResponseBody build() {
            return new RefreshAdvisorCostCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefreshAdvisorCostCheckResponseBody} extends {@link TeaModel}
     *
     * <p>RefreshAdvisorCostCheckResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandId")
        private String commandId;

        @com.aliyun.core.annotation.NameInMap("ManagerTaskId")
        private Long managerTaskId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private Data(Builder builder) {
            this.commandId = builder.commandId;
            this.managerTaskId = builder.managerTaskId;
            this.success = builder.success;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commandId
         */
        public String getCommandId() {
            return this.commandId;
        }

        /**
         * @return managerTaskId
         */
        public Long getManagerTaskId() {
            return this.managerTaskId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String commandId; 
            private Long managerTaskId; 
            private Boolean success; 
            private Long taskId; 

            /**
             * CommandId.
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * ManagerTaskId.
             */
            public Builder managerTaskId(Long managerTaskId) {
                this.managerTaskId = managerTaskId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
