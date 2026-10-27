// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTasksResponseBody</p>
 */
public class DescribeTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeTasksResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeTasksResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of result items.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D6045D78-C119-5A17-9DEA-0F810394E008</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeTasksResponseBody build() {
            return new DescribeTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ProgressInfo")
        private String progressInfo;

        @com.aliyun.core.annotation.NameInMap("ScaleOutToken")
        private String scaleOutToken;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskAction")
        private String taskAction;

        @com.aliyun.core.annotation.NameInMap("TaskErrorCode")
        private String taskErrorCode;

        @com.aliyun.core.annotation.NameInMap("TaskErrorMessage")
        private String taskErrorMessage;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Items(Builder builder) {
            this.beginTime = builder.beginTime;
            this.DBName = builder.DBName;
            this.finishTime = builder.finishTime;
            this.progress = builder.progress;
            this.progressInfo = builder.progressInfo;
            this.scaleOutToken = builder.scaleOutToken;
            this.status = builder.status;
            this.taskAction = builder.taskAction;
            this.taskErrorCode = builder.taskErrorCode;
            this.taskErrorMessage = builder.taskErrorMessage;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return progressInfo
         */
        public String getProgressInfo() {
            return this.progressInfo;
        }

        /**
         * @return scaleOutToken
         */
        public String getScaleOutToken() {
            return this.scaleOutToken;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskAction
         */
        public String getTaskAction() {
            return this.taskAction;
        }

        /**
         * @return taskErrorCode
         */
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        /**
         * @return taskErrorMessage
         */
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String beginTime; 
            private String DBName; 
            private String finishTime; 
            private String progress; 
            private String progressInfo; 
            private String scaleOutToken; 
            private String status; 
            private String taskAction; 
            private String taskErrorCode; 
            private String taskErrorMessage; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.beginTime = model.beginTime;
                this.DBName = model.DBName;
                this.finishTime = model.finishTime;
                this.progress = model.progress;
                this.progressInfo = model.progressInfo;
                this.scaleOutToken = model.scaleOutToken;
                this.status = model.status;
                this.taskAction = model.taskAction;
                this.taskErrorCode = model.taskErrorCode;
                this.taskErrorMessage = model.taskErrorMessage;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The start time of the task. The format is yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-20T19:40:00Z</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The name of the database associated with the task. This field is usually empty.</p>
             * 
             * <strong>example:</strong>
             * <p>DBName</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The end time of the task. The format is yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-20T20:00:00Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The task progress, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The detailed progress of the task. This field is usually empty.</p>
             * 
             * <strong>example:</strong>
             * <p>ProgressInfo</p>
             */
            public Builder progressInfo(String progressInfo) {
                this.progressInfo = progressInfo;
                return this;
            }

            /**
             * <p>The scale-out token. If the task is a scale-out task, this field returns a scale-out ID, which is a unique backend key.</p>
             * 
             * <strong>example:</strong>
             * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
             */
            public Builder scaleOutToken(String scaleOutToken) {
                this.scaleOutToken = scaleOutToken;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>RUNNING</strong>: The task is running.</li>
             * <li><strong>FAILED</strong>: The task failed and was interrupted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task action. This is a unique key for the backend task type.</p>
             * 
             * <strong>example:</strong>
             * <p>multi_scale_out</p>
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * <p>The error code of the failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>TaskErrorCode</p>
             */
            public Builder taskErrorCode(String taskErrorCode) {
                this.taskErrorCode = taskErrorCode;
                return this;
            }

            /**
             * <p>The error message of the failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>TaskErrorMessage</p>
             */
            public Builder taskErrorMessage(String taskErrorMessage) {
                this.taskErrorMessage = taskErrorMessage;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20089398</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
