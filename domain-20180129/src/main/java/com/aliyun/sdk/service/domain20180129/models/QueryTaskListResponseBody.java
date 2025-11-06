// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskListResponseBody</p>
 */
public class QueryTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("NextPage")
    private Boolean nextPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrePage")
    private Boolean prePage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryTaskListResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.nextPage = builder.nextPage;
        this.pageSize = builder.pageSize;
        this.prePage = builder.prePage;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return nextPage
     */
    public Boolean getNextPage() {
        return this.nextPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prePage
     */
    public Boolean getPrePage() {
        return this.prePage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private Data data; 
        private Boolean nextPage; 
        private Integer pageSize; 
        private Boolean prePage; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        private Builder() {
        } 

        private Builder(QueryTaskListResponseBody model) {
            this.currentPageNum = model.currentPageNum;
            this.data = model.data;
            this.nextPage = model.nextPage;
            this.pageSize = model.pageSize;
            this.prePage = model.prePage;
            this.requestId = model.requestId;
            this.totalItemNum = model.totalItemNum;
            this.totalPageNum = model.totalPageNum;
        } 

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
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
         * NextPage.
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
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
         * PrePage.
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
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
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryTaskListResponseBody build() {
            return new QueryTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskListResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clientip")
        private String clientip;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("TaskBizType")
        private String taskBizType;

        @com.aliyun.core.annotation.NameInMap("TaskCancelStatus")
        private String taskCancelStatus;

        @com.aliyun.core.annotation.NameInMap("TaskCancelStatusCode")
        private Integer taskCancelStatusCode;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

        @com.aliyun.core.annotation.NameInMap("TaskNum")
        private Integer taskNum;

        @com.aliyun.core.annotation.NameInMap("TaskResult")
        private String taskResult;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TaskTypeCode")
        private Integer taskTypeCode;

        @com.aliyun.core.annotation.NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        private TaskInfo(Builder builder) {
            this.clientip = builder.clientip;
            this.createTime = builder.createTime;
            this.taskBizType = builder.taskBizType;
            this.taskCancelStatus = builder.taskCancelStatus;
            this.taskCancelStatusCode = builder.taskCancelStatusCode;
            this.taskNo = builder.taskNo;
            this.taskNum = builder.taskNum;
            this.taskResult = builder.taskResult;
            this.taskStatus = builder.taskStatus;
            this.taskStatusCode = builder.taskStatusCode;
            this.taskType = builder.taskType;
            this.taskTypeCode = builder.taskTypeCode;
            this.taskTypeDescription = builder.taskTypeDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return clientip
         */
        public String getClientip() {
            return this.clientip;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return taskBizType
         */
        public String getTaskBizType() {
            return this.taskBizType;
        }

        /**
         * @return taskCancelStatus
         */
        public String getTaskCancelStatus() {
            return this.taskCancelStatus;
        }

        /**
         * @return taskCancelStatusCode
         */
        public Integer getTaskCancelStatusCode() {
            return this.taskCancelStatusCode;
        }

        /**
         * @return taskNo
         */
        public String getTaskNo() {
            return this.taskNo;
        }

        /**
         * @return taskNum
         */
        public Integer getTaskNum() {
            return this.taskNum;
        }

        /**
         * @return taskResult
         */
        public String getTaskResult() {
            return this.taskResult;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskStatusCode
         */
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return taskTypeCode
         */
        public Integer getTaskTypeCode() {
            return this.taskTypeCode;
        }

        /**
         * @return taskTypeDescription
         */
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public static final class Builder {
            private String clientip; 
            private String createTime; 
            private String taskBizType; 
            private String taskCancelStatus; 
            private Integer taskCancelStatusCode; 
            private String taskNo; 
            private Integer taskNum; 
            private String taskResult; 
            private String taskStatus; 
            private Integer taskStatusCode; 
            private String taskType; 
            private Integer taskTypeCode; 
            private String taskTypeDescription; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.clientip = model.clientip;
                this.createTime = model.createTime;
                this.taskBizType = model.taskBizType;
                this.taskCancelStatus = model.taskCancelStatus;
                this.taskCancelStatusCode = model.taskCancelStatusCode;
                this.taskNo = model.taskNo;
                this.taskNum = model.taskNum;
                this.taskResult = model.taskResult;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeCode = model.taskTypeCode;
                this.taskTypeDescription = model.taskTypeDescription;
            } 

            /**
             * Clientip.
             */
            public Builder clientip(String clientip) {
                this.clientip = clientip;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * TaskBizType.
             */
            public Builder taskBizType(String taskBizType) {
                this.taskBizType = taskBizType;
                return this;
            }

            /**
             * TaskCancelStatus.
             */
            public Builder taskCancelStatus(String taskCancelStatus) {
                this.taskCancelStatus = taskCancelStatus;
                return this;
            }

            /**
             * TaskCancelStatusCode.
             */
            public Builder taskCancelStatusCode(Integer taskCancelStatusCode) {
                this.taskCancelStatusCode = taskCancelStatusCode;
                return this;
            }

            /**
             * TaskNo.
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * TaskNum.
             */
            public Builder taskNum(Integer taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            /**
             * TaskResult.
             */
            public Builder taskResult(String taskResult) {
                this.taskResult = taskResult;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TaskStatusCode.
             */
            public Builder taskStatusCode(Integer taskStatusCode) {
                this.taskStatusCode = taskStatusCode;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * TaskTypeCode.
             */
            public Builder taskTypeCode(Integer taskTypeCode) {
                this.taskTypeCode = taskTypeCode;
                return this;
            }

            /**
             * TaskTypeDescription.
             */
            public Builder taskTypeDescription(String taskTypeDescription) {
                this.taskTypeDescription = taskTypeDescription;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskInfo")
        private java.util.List<TaskInfo> taskInfo;

        private Data(Builder builder) {
            this.taskInfo = builder.taskInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskInfo
         */
        public java.util.List<TaskInfo> getTaskInfo() {
            return this.taskInfo;
        }

        public static final class Builder {
            private java.util.List<TaskInfo> taskInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.taskInfo = model.taskInfo;
            } 

            /**
             * TaskInfo.
             */
            public Builder taskInfo(java.util.List<TaskInfo> taskInfo) {
                this.taskInfo = taskInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
