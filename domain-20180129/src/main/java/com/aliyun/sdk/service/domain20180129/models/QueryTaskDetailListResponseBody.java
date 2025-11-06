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
 * {@link QueryTaskDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskDetailListResponseBody</p>
 */
public class QueryTaskDetailListResponseBody extends TeaModel {
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

    private QueryTaskDetailListResponseBody(Builder builder) {
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

    public static QueryTaskDetailListResponseBody create() {
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

        private Builder(QueryTaskDetailListResponseBody model) {
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
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * <p>The tasks.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates whether the current page is preceded by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A2320E4-D870-49C9-A6DC-test</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryTaskDetailListResponseBody build() {
            return new QueryTaskDetailListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTaskDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskDetailListResponseBody</p>
     */
    public static class TaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TaskDetailNo")
        private String taskDetailNo;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

        @com.aliyun.core.annotation.NameInMap("TaskResult")
        private String taskResult;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskStatusCode")
        private Integer taskStatusCode;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TaskTypeDescription")
        private String taskTypeDescription;

        @com.aliyun.core.annotation.NameInMap("TryCount")
        private Integer tryCount;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private TaskDetail(Builder builder) {
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.errorMsg = builder.errorMsg;
            this.failReason = builder.failReason;
            this.instanceId = builder.instanceId;
            this.taskDetailNo = builder.taskDetailNo;
            this.taskNo = builder.taskNo;
            this.taskResult = builder.taskResult;
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

        public static TaskDetail create() {
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
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
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
            private String failReason; 
            private String instanceId; 
            private String taskDetailNo; 
            private String taskNo; 
            private String taskResult; 
            private String taskStatus; 
            private Integer taskStatusCode; 
            private String taskType; 
            private String taskTypeDescription; 
            private Integer tryCount; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(TaskDetail model) {
                this.createTime = model.createTime;
                this.domainName = model.domainName;
                this.errorMsg = model.errorMsg;
                this.failReason = model.failReason;
                this.instanceId = model.instanceId;
                this.taskDetailNo = model.taskDetailNo;
                this.taskNo = model.taskNo;
                this.taskResult = model.taskResult;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeDescription = model.taskTypeDescription;
                this.tryCount = model.tryCount;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-25 20:46:57</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The error message returned when the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The operation is successful.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The cause of a domain name task failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Purchase record exists for the domain name in Aliyun</p>
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * <p>The instance ID of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>S20179H1BBI9test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the task details.</p>
             * 
             * <strong>example:</strong>
             * <p>75addb07-28a3-450e-b5ec-test</p>
             */
            public Builder taskDetailNo(String taskDetailNo) {
                this.taskDetailNo = taskDetailNo;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>60d6e201-8ee5-47ab-8fdc-test</p>
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * <p>The result of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder taskResult(String taskResult) {
                this.taskResult = taskResult;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>WAITING_EXECUTE</strong>: To be executed</li>
             * <li><strong>EXECUTING</strong>: being executed</li>
             * <li><strong>EXECUTE_SUCCESS</strong>: successful</li>
             * <li><strong>EXECUTE_FAILURE</strong>: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXECUTE_SUCCESS</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The status code of the task. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: waiting for execution</li>
             * <li><strong>1</strong>: being executed</li>
             * <li><strong>2</strong>: successful</li>
             * <li><strong>3</strong>: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder taskStatusCode(Integer taskStatusCode) {
                this.taskStatusCode = taskStatusCode;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>CHG_HOLDER</strong>: The task is run to modify the domain name registrant.</li>
             * <li><strong>CHG_DNS</strong>: The task is run to change the Domain Name System (DNS) servers.</li>
             * <li><strong>SET_WHOIS_PROTECT</strong>: The task is run to configure privacy protection for the domain name.</li>
             * <li><strong>UPDATE_ADMIN_CONTACT</strong>: The task is run to modify the information about the administrator of the domain name.</li>
             * <li><strong>UPDATE_BILLING_CONTACT</strong>: The task is run to modify the information about the payer for the domain name.</li>
             * <li><strong>UPDATE_TECH_CONTACT</strong>: The task is run to modify the information about the technical support for the domain name.</li>
             * <li><strong>SET_UPDATE_PROHIBITED</strong>: The task is run to configure the security lock for the domain name.</li>
             * <li><strong>SET_TRANSFER_PROHIBITED</strong>: The task is run to configure the transfer lock for the domain name.</li>
             * <li><strong>ORDER_ACTIVATE</strong>: The task is run to create a registration order for the domain name.</li>
             * <li><strong>ORDER_RENEW</strong>: The task is run to create a renewal order for the domain name.</li>
             * <li><strong>ORDER_REDEEM</strong>: The task is run to create a redemption order for the domain name.</li>
             * <li><strong>CREATE_DNSHOST</strong>: The task is run to create a DNS server for the domain name.</li>
             * <li><strong>UPDATE_DNSHOST</strong>: The task is run to update the information about a DNS server for the domain name.</li>
             * <li><strong>SYNC_DNSHOST</strong>: The task is run to synchronize a DNS server for the domain name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ORDER_RENEW</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The description of the task type.</p>
             */
            public Builder taskTypeDescription(String taskTypeDescription) {
                this.taskTypeDescription = taskTypeDescription;
                return this;
            }

            /**
             * <p>The number of times the task was retried.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            /**
             * <p>The last time when the task was run.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-25 20:47:01</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TaskDetail build() {
                return new TaskDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTaskDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskDetailListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskDetail")
        private java.util.List<TaskDetail> taskDetail;

        private Data(Builder builder) {
            this.taskDetail = builder.taskDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskDetail
         */
        public java.util.List<TaskDetail> getTaskDetail() {
            return this.taskDetail;
        }

        public static final class Builder {
            private java.util.List<TaskDetail> taskDetail; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.taskDetail = model.taskDetail;
            } 

            /**
             * TaskDetail.
             */
            public Builder taskDetail(java.util.List<TaskDetail> taskDetail) {
                this.taskDetail = taskDetail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
