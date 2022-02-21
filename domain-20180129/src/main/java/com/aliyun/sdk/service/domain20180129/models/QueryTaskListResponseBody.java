// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskListResponseBody</p>
 */
public class QueryTaskListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private Data data;

    @NameInMap("NextPage")
    private Boolean nextPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PrePage")
    private Boolean prePage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
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

    public static class TaskInfo extends TeaModel {
        @NameInMap("Clientip")
        private String clientip;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("TaskCancelStatus")
        private String taskCancelStatus;

        @NameInMap("TaskCancelStatusCode")
        private Integer taskCancelStatusCode;

        @NameInMap("TaskNo")
        private String taskNo;

        @NameInMap("TaskNum")
        private Integer taskNum;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        private TaskInfo(Builder builder) {
            this.clientip = builder.clientip;
            this.createTime = builder.createTime;
            this.taskCancelStatus = builder.taskCancelStatus;
            this.taskCancelStatusCode = builder.taskCancelStatusCode;
            this.taskNo = builder.taskNo;
            this.taskNum = builder.taskNum;
            this.taskStatus = builder.taskStatus;
            this.taskStatusCode = builder.taskStatusCode;
            this.taskType = builder.taskType;
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
         * @return taskTypeDescription
         */
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public static final class Builder {
            private String clientip; 
            private String createTime; 
            private String taskCancelStatus; 
            private Integer taskCancelStatusCode; 
            private String taskNo; 
            private Integer taskNum; 
            private String taskStatus; 
            private Integer taskStatusCode; 
            private String taskType; 
            private String taskTypeDescription; 

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
    public static class Data extends TeaModel {
        @NameInMap("TaskInfo")
        private java.util.List < TaskInfo> taskInfo;

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
        public java.util.List < TaskInfo> getTaskInfo() {
            return this.taskInfo;
        }

        public static final class Builder {
            private java.util.List < TaskInfo> taskInfo; 

            /**
             * TaskInfo.
             */
            public Builder taskInfo(java.util.List < TaskInfo> taskInfo) {
                this.taskInfo = taskInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
