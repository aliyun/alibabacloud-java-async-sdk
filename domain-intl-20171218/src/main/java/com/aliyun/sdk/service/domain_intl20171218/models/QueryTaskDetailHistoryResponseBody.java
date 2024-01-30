// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskDetailHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskDetailHistoryResponseBody</p>
 */
public class QueryTaskDetailHistoryResponseBody extends TeaModel {
    @NameInMap("CurrentPageCursor")
    private CurrentPageCursor currentPageCursor;

    @NameInMap("NextPageCursor")
    private NextPageCursor nextPageCursor;

    @NameInMap("Objects")
    private java.util.List < Objects> objects;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PrePageCursor")
    private PrePageCursor prePageCursor;

    @NameInMap("RequestId")
    private String requestId;

    private QueryTaskDetailHistoryResponseBody(Builder builder) {
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

    public static QueryTaskDetailHistoryResponseBody create() {
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

        public QueryTaskDetailHistoryResponseBody build() {
            return new QueryTaskDetailHistoryResponseBody(this);
        } 

    } 

    public static class CurrentPageCursor extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TaskDetailNo")
        private String taskDetailNo;

        @NameInMap("TaskNo")
        private String taskNo;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        @NameInMap("TryCount")
        private Integer tryCount;

        @NameInMap("UpdateTime")
        private String updateTime;

        private CurrentPageCursor(Builder builder) {
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.errorMsg = builder.errorMsg;
            this.instanceId = builder.instanceId;
            this.taskDetailNo = builder.taskDetailNo;
            this.taskNo = builder.taskNo;
            this.taskStatus = builder.taskStatus;
            this.taskStatusCode = builder.taskStatusCode;
            this.taskType = builder.taskType;
            this.taskTypeDescription = builder.taskTypeDescription;
            this.tryCount = builder.tryCount;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentPageCursor create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return taskDetailNo
         */
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        /**
         * @return taskNo
         */
        public String getTaskNo() {
            return this.taskNo;
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

        /**
         * @return tryCount
         */
        public Integer getTryCount() {
            return this.tryCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String domainName; 
            private String errorMsg; 
            private String instanceId; 
            private String taskDetailNo; 
            private String taskNo; 
            private String taskStatus; 
            private Integer taskStatusCode; 
            private String taskType; 
            private String taskTypeDescription; 
            private Integer tryCount; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TaskDetailNo.
             */
            public Builder taskDetailNo(String taskDetailNo) {
                this.taskDetailNo = taskDetailNo;
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

            /**
             * TryCount.
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CurrentPageCursor build() {
                return new CurrentPageCursor(this);
            } 

        } 

    }
    public static class NextPageCursor extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TaskDetailNo")
        private String taskDetailNo;

        @NameInMap("TaskNo")
        private String taskNo;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        @NameInMap("TryCount")
        private Integer tryCount;

        @NameInMap("UpdateTime")
        private String updateTime;

        private NextPageCursor(Builder builder) {
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.errorMsg = builder.errorMsg;
            this.instanceId = builder.instanceId;
            this.taskDetailNo = builder.taskDetailNo;
            this.taskNo = builder.taskNo;
            this.taskStatus = builder.taskStatus;
            this.taskStatusCode = builder.taskStatusCode;
            this.taskType = builder.taskType;
            this.taskTypeDescription = builder.taskTypeDescription;
            this.tryCount = builder.tryCount;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextPageCursor create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return taskDetailNo
         */
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        /**
         * @return taskNo
         */
        public String getTaskNo() {
            return this.taskNo;
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

        /**
         * @return tryCount
         */
        public Integer getTryCount() {
            return this.tryCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String domainName; 
            private String errorMsg; 
            private String instanceId; 
            private String taskDetailNo; 
            private String taskNo; 
            private String taskStatus; 
            private Integer taskStatusCode; 
            private String taskType; 
            private String taskTypeDescription; 
            private Integer tryCount; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TaskDetailNo.
             */
            public Builder taskDetailNo(String taskDetailNo) {
                this.taskDetailNo = taskDetailNo;
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

            /**
             * TryCount.
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public NextPageCursor build() {
                return new NextPageCursor(this);
            } 

        } 

    }
    public static class Objects extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TaskDetailNo")
        private String taskDetailNo;

        @NameInMap("TaskNo")
        private String taskNo;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        @NameInMap("TryCount")
        private Integer tryCount;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Objects(Builder builder) {
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.errorMsg = builder.errorMsg;
            this.instanceId = builder.instanceId;
            this.taskDetailNo = builder.taskDetailNo;
            this.taskNo = builder.taskNo;
            this.taskStatus = builder.taskStatus;
            this.taskStatusCode = builder.taskStatusCode;
            this.taskType = builder.taskType;
            this.taskTypeDescription = builder.taskTypeDescription;
            this.tryCount = builder.tryCount;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Objects create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return taskDetailNo
         */
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        /**
         * @return taskNo
         */
        public String getTaskNo() {
            return this.taskNo;
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

        /**
         * @return tryCount
         */
        public Integer getTryCount() {
            return this.tryCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String domainName; 
            private String errorMsg; 
            private String instanceId; 
            private String taskDetailNo; 
            private String taskNo; 
            private String taskStatus; 
            private Integer taskStatusCode; 
            private String taskType; 
            private String taskTypeDescription; 
            private Integer tryCount; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TaskDetailNo.
             */
            public Builder taskDetailNo(String taskDetailNo) {
                this.taskDetailNo = taskDetailNo;
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

            /**
             * TryCount.
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Objects build() {
                return new Objects(this);
            } 

        } 

    }
    public static class PrePageCursor extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TaskDetailNo")
        private String taskDetailNo;

        @NameInMap("TaskNo")
        private String taskNo;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        @NameInMap("TryCount")
        private Integer tryCount;

        @NameInMap("UpdateTime")
        private String updateTime;

        private PrePageCursor(Builder builder) {
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.errorMsg = builder.errorMsg;
            this.instanceId = builder.instanceId;
            this.taskDetailNo = builder.taskDetailNo;
            this.taskNo = builder.taskNo;
            this.taskStatus = builder.taskStatus;
            this.taskStatusCode = builder.taskStatusCode;
            this.taskType = builder.taskType;
            this.taskTypeDescription = builder.taskTypeDescription;
            this.tryCount = builder.tryCount;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrePageCursor create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return taskDetailNo
         */
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        /**
         * @return taskNo
         */
        public String getTaskNo() {
            return this.taskNo;
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

        /**
         * @return tryCount
         */
        public Integer getTryCount() {
            return this.tryCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String domainName; 
            private String errorMsg; 
            private String instanceId; 
            private String taskDetailNo; 
            private String taskNo; 
            private String taskStatus; 
            private Integer taskStatusCode; 
            private String taskType; 
            private String taskTypeDescription; 
            private Integer tryCount; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TaskDetailNo.
             */
            public Builder taskDetailNo(String taskDetailNo) {
                this.taskDetailNo = taskDetailNo;
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

            /**
             * TryCount.
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PrePageCursor build() {
                return new PrePageCursor(this);
            } 

        } 

    }
}
