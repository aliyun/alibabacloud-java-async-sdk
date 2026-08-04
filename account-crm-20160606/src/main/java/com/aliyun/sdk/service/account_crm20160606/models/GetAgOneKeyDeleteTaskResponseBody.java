// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link GetAgOneKeyDeleteTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgOneKeyDeleteTaskResponseBody</p>
 */
public class GetAgOneKeyDeleteTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskDto")
    private TaskDto taskDto;

    private GetAgOneKeyDeleteTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskDto = builder.taskDto;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgOneKeyDeleteTaskResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskDto
     */
    public TaskDto getTaskDto() {
        return this.taskDto;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TaskDto taskDto; 

        private Builder() {
        } 

        private Builder(GetAgOneKeyDeleteTaskResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskDto = model.taskDto;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TaskDto.
         */
        public Builder taskDto(TaskDto taskDto) {
            this.taskDto = taskDto;
            return this;
        }

        public GetAgOneKeyDeleteTaskResponseBody build() {
            return new GetAgOneKeyDeleteTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgOneKeyDeleteTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgOneKeyDeleteTaskResponseBody</p>
     */
    public static class TaskDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeleteStatus")
        private String deleteStatus;

        @com.aliyun.core.annotation.NameInMap("ExistQuietPeriod")
        private Boolean existQuietPeriod;

        @com.aliyun.core.annotation.NameInMap("QuietPeriodEndTime")
        private String quietPeriodEndTime;

        private TaskDto(Builder builder) {
            this.deleteStatus = builder.deleteStatus;
            this.existQuietPeriod = builder.existQuietPeriod;
            this.quietPeriodEndTime = builder.quietPeriodEndTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDto create() {
            return builder().build();
        }

        /**
         * @return deleteStatus
         */
        public String getDeleteStatus() {
            return this.deleteStatus;
        }

        /**
         * @return existQuietPeriod
         */
        public Boolean getExistQuietPeriod() {
            return this.existQuietPeriod;
        }

        /**
         * @return quietPeriodEndTime
         */
        public String getQuietPeriodEndTime() {
            return this.quietPeriodEndTime;
        }

        public static final class Builder {
            private String deleteStatus; 
            private Boolean existQuietPeriod; 
            private String quietPeriodEndTime; 

            private Builder() {
            } 

            private Builder(TaskDto model) {
                this.deleteStatus = model.deleteStatus;
                this.existQuietPeriod = model.existQuietPeriod;
                this.quietPeriodEndTime = model.quietPeriodEndTime;
            } 

            /**
             * DeleteStatus.
             */
            public Builder deleteStatus(String deleteStatus) {
                this.deleteStatus = deleteStatus;
                return this;
            }

            /**
             * ExistQuietPeriod.
             */
            public Builder existQuietPeriod(Boolean existQuietPeriod) {
                this.existQuietPeriod = existQuietPeriod;
                return this;
            }

            /**
             * QuietPeriodEndTime.
             */
            public Builder quietPeriodEndTime(String quietPeriodEndTime) {
                this.quietPeriodEndTime = quietPeriodEndTime;
                return this;
            }

            public TaskDto build() {
                return new TaskDto(this);
            } 

        } 

    }
}
