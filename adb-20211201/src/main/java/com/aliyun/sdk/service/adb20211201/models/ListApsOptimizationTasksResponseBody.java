// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListApsOptimizationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListApsOptimizationTasksResponseBody</p>
 */
public class ListApsOptimizationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApsOptimizationTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApsOptimizationTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApsOptimizationTasksResponseBody build() {
            return new ListApsOptimizationTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApsOptimizationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListApsOptimizationTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeUnit")
        private String computeUnit;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private String strategyType;

        @com.aliyun.core.annotation.NameInMap("TaskDesc")
        private String taskDesc;

        @com.aliyun.core.annotation.NameInMap("TaskDuration")
        private Long taskDuration;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskMessage")
        private String taskMessage;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private Items(Builder builder) {
            this.computeUnit = builder.computeUnit;
            this.createdTime = builder.createdTime;
            this.DBClusterId = builder.DBClusterId;
            this.modifiedTime = builder.modifiedTime;
            this.strategyType = builder.strategyType;
            this.taskDesc = builder.taskDesc;
            this.taskDuration = builder.taskDuration;
            this.taskId = builder.taskId;
            this.taskMessage = builder.taskMessage;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return computeUnit
         */
        public String getComputeUnit() {
            return this.computeUnit;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        /**
         * @return taskDesc
         */
        public String getTaskDesc() {
            return this.taskDesc;
        }

        /**
         * @return taskDuration
         */
        public Long getTaskDuration() {
            return this.taskDuration;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskMessage
         */
        public String getTaskMessage() {
            return this.taskMessage;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String computeUnit; 
            private String createdTime; 
            private String DBClusterId; 
            private String modifiedTime; 
            private String strategyType; 
            private String taskDesc; 
            private Long taskDuration; 
            private String taskId; 
            private String taskMessage; 
            private String taskStatus; 

            /**
             * ComputeUnit.
             */
            public Builder computeUnit(String computeUnit) {
                this.computeUnit = computeUnit;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * StrategyType.
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * TaskDesc.
             */
            public Builder taskDesc(String taskDesc) {
                this.taskDesc = taskDesc;
                return this;
            }

            /**
             * TaskDuration.
             */
            public Builder taskDuration(Long taskDuration) {
                this.taskDuration = taskDuration;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskMessage.
             */
            public Builder taskMessage(String taskMessage) {
                this.taskMessage = taskMessage;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
