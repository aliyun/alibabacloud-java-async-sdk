// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskInfoHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskInfoHistoryResponseBody</p>
 */
public class QueryTaskInfoHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageCursor")
    private CurrentPageCursor currentPageCursor;

    @com.aliyun.core.annotation.NameInMap("NextPageCursor")
    private NextPageCursor nextPageCursor;

    @com.aliyun.core.annotation.NameInMap("Objects")
    private java.util.List < Objects> objects;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrePageCursor")
    private PrePageCursor prePageCursor;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryTaskInfoHistoryResponseBody(Builder builder) {
        this.currentPageCursor = builder.currentPageCursor;
        this.nextPageCursor = builder.nextPageCursor;
        this.objects = builder.objects;
        this.pageSize = builder.pageSize;
        this.prePageCursor = builder.prePageCursor;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskInfoHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageCursor
     */
    public CurrentPageCursor getCurrentPageCursor() {
        return this.currentPageCursor;
    }

    /**
     * @return nextPageCursor
     */
    public NextPageCursor getNextPageCursor() {
        return this.nextPageCursor;
    }

    /**
     * @return objects
     */
    public java.util.List < Objects> getObjects() {
        return this.objects;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prePageCursor
     */
    public PrePageCursor getPrePageCursor() {
        return this.prePageCursor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CurrentPageCursor currentPageCursor; 
        private NextPageCursor nextPageCursor; 
        private java.util.List < Objects> objects; 
        private Integer pageSize; 
        private PrePageCursor prePageCursor; 
        private String requestId; 

        /**
         * CurrentPageCursor.
         */
        public Builder currentPageCursor(CurrentPageCursor currentPageCursor) {
            this.currentPageCursor = currentPageCursor;
            return this;
        }

        /**
         * NextPageCursor.
         */
        public Builder nextPageCursor(NextPageCursor nextPageCursor) {
            this.nextPageCursor = nextPageCursor;
            return this;
        }

        /**
         * Objects.
         */
        public Builder objects(java.util.List < Objects> objects) {
            this.objects = objects;
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
         * PrePageCursor.
         */
        public Builder prePageCursor(PrePageCursor prePageCursor) {
            this.prePageCursor = prePageCursor;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryTaskInfoHistoryResponseBody build() {
            return new QueryTaskInfoHistoryResponseBody(this);
        } 

    } 

    public static class CurrentPageCursor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clientip")
        private String clientip;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeLong")
        private Long createTimeLong;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

        @com.aliyun.core.annotation.NameInMap("TaskNum")
        private Integer taskNum;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        private CurrentPageCursor(Builder builder) {
            this.clientip = builder.clientip;
            this.createTime = builder.createTime;
            this.createTimeLong = builder.createTimeLong;
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

        public static CurrentPageCursor create() {
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
         * @return createTimeLong
         */
        public Long getCreateTimeLong() {
            return this.createTimeLong;
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
            private Long createTimeLong; 
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
             * CreateTimeLong.
             */
            public Builder createTimeLong(Long createTimeLong) {
                this.createTimeLong = createTimeLong;
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

            public CurrentPageCursor build() {
                return new CurrentPageCursor(this);
            } 

        } 

    }
    public static class NextPageCursor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clientip")
        private String clientip;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeLong")
        private Long createTimeLong;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

        @com.aliyun.core.annotation.NameInMap("TaskNum")
        private Integer taskNum;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        private NextPageCursor(Builder builder) {
            this.clientip = builder.clientip;
            this.createTime = builder.createTime;
            this.createTimeLong = builder.createTimeLong;
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

        public static NextPageCursor create() {
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
         * @return createTimeLong
         */
        public Long getCreateTimeLong() {
            return this.createTimeLong;
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
            private Long createTimeLong; 
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
             * CreateTimeLong.
             */
            public Builder createTimeLong(Long createTimeLong) {
                this.createTimeLong = createTimeLong;
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

            public NextPageCursor build() {
                return new NextPageCursor(this);
            } 

        } 

    }
    public static class Objects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clientip")
        private String clientip;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeLong")
        private Long createTimeLong;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

        @com.aliyun.core.annotation.NameInMap("TaskNum")
        private Integer taskNum;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        private Objects(Builder builder) {
            this.clientip = builder.clientip;
            this.createTime = builder.createTime;
            this.createTimeLong = builder.createTimeLong;
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

        public static Objects create() {
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
         * @return createTimeLong
         */
        public Long getCreateTimeLong() {
            return this.createTimeLong;
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
            private Long createTimeLong; 
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
             * CreateTimeLong.
             */
            public Builder createTimeLong(Long createTimeLong) {
                this.createTimeLong = createTimeLong;
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

            public Objects build() {
                return new Objects(this);
            } 

        } 

    }
    public static class PrePageCursor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clientip")
        private String clientip;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeLong")
        private Long createTimeLong;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

        @com.aliyun.core.annotation.NameInMap("TaskNum")
        private Integer taskNum;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        private PrePageCursor(Builder builder) {
            this.clientip = builder.clientip;
            this.createTime = builder.createTime;
            this.createTimeLong = builder.createTimeLong;
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

        public static PrePageCursor create() {
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
         * @return createTimeLong
         */
        public Long getCreateTimeLong() {
            return this.createTimeLong;
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
            private Long createTimeLong; 
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
             * CreateTimeLong.
             */
            public Builder createTimeLong(Long createTimeLong) {
                this.createTimeLong = createTimeLong;
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

            public PrePageCursor build() {
                return new PrePageCursor(this);
            } 

        } 

    }
}
