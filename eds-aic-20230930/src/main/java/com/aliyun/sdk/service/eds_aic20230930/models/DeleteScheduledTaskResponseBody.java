// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DeleteScheduledTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteScheduledTaskResponseBody</p>
 */
public class DeleteScheduledTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DeleteScheduledTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScheduledTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DeleteScheduledTaskResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Tasks.
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DeleteScheduledTaskResponseBody build() {
            return new DeleteScheduledTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteScheduledTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteScheduledTaskResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScheduledId")
        private String scheduledId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Tasks(Builder builder) {
            this.scheduledId = builder.scheduledId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return scheduledId
         */
        public String getScheduledId() {
            return this.scheduledId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String scheduledId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.scheduledId = model.scheduledId;
                this.success = model.success;
            } 

            /**
             * ScheduledId.
             */
            public Builder scheduledId(String scheduledId) {
                this.scheduledId = scheduledId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
