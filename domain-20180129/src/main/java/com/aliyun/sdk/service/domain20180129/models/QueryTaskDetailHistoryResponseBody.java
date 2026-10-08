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
 * {@link QueryTaskDetailHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskDetailHistoryResponseBody</p>
 */
public class QueryTaskDetailHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageCursor")
    private CurrentPageCursor currentPageCursor;

    @com.aliyun.core.annotation.NameInMap("NextPageCursor")
    private NextPageCursor nextPageCursor;

    @com.aliyun.core.annotation.NameInMap("Objects")
    private java.util.List<Objects> objects;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrePageCursor")
    private PrePageCursor prePageCursor;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Objects> getObjects() {
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
        private java.util.List<Objects> objects; 
        private Integer pageSize; 
        private PrePageCursor prePageCursor; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryTaskDetailHistoryResponseBody model) {
            this.currentPageCursor = model.currentPageCursor;
            this.nextPageCursor = model.nextPageCursor;
            this.objects = model.objects;
            this.pageSize = model.pageSize;
            this.prePageCursor = model.prePageCursor;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Current page cursor.</p>
         */
        public Builder currentPageCursor(CurrentPageCursor currentPageCursor) {
            this.currentPageCursor = currentPageCursor;
            return this;
        }

        /**
         * <p>Cursor for the next page.</p>
         */
        public Builder nextPageCursor(NextPageCursor nextPageCursor) {
            this.nextPageCursor = nextPageCursor;
            return this;
        }

        /**
         * <p>Task detail information.</p>
         */
        public Builder objects(java.util.List<Objects> objects) {
            this.objects = objects;
            return this;
        }

        /**
         * <p>Paging size.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Cursor for the previous page.</p>
         */
        public Builder prePageCursor(PrePageCursor prePageCursor) {
            this.prePageCursor = prePageCursor;
            return this;
        }

        /**
         * <p>Unique Request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>548CAE74-88F8-402F-8C12-97E747389C51</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryTaskDetailHistoryResponseBody build() {
            return new QueryTaskDetailHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTaskDetailHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskDetailHistoryResponseBody</p>
     */
    public static class CurrentPageCursor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TaskDetailNo")
        private String taskDetailNo;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

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

            private Builder() {
            } 

            private Builder(CurrentPageCursor model) {
                this.createTime = model.createTime;
                this.domainName = model.domainName;
                this.errorMsg = model.errorMsg;
                this.instanceId = model.instanceId;
                this.taskDetailNo = model.taskDetailNo;
                this.taskNo = model.taskNo;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeDescription = model.taskTypeDescription;
                this.tryCount = model.tryCount;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Job Creation Time.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Result of task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>执行成功</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Domain instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S1234456789</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Task detail ID.</p>
             * 
             * <strong>example:</strong>
             * <p>75addb07-28a3-450e-b5ec-2342</p>
             */
            public Builder taskDetailNo(String taskDetailNo) {
                this.taskDetailNo = taskDetailNo;
                return this;
            }

            /**
             * <p>Job number.</p>
             * 
             * <strong>example:</strong>
             * <p>75addb07-28a3-450e-b5ec-test</p>
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * <p>Task Status. Valid values:  </p>
             * <ul>
             * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution.  </li>
             * <li><strong>EXECUTING</strong>: Executing.  </li>
             * <li><strong>EXECUTE_SUCCESS</strong>: Execution succeeded.  </li>
             * <li><strong>EXECUTE_FAILURE</strong>: Execution failed.</li>
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
             * <p>Job Status code. Valid values:  </p>
             * <ul>
             * <li><strong>0</strong>: Waiting to execute.  </li>
             * <li><strong>1</strong>: Executing.  </li>
             * <li><strong>2</strong>: Succeeded.  </li>
             * <li><strong>3</strong>: Failed.</li>
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
             * <p>Task Type. Valid values:  </p>
             * <ul>
             * <li><strong>CHG_HOLDER</strong>: Modify registrant information.  </li>
             * <li><strong>CHG_DNS</strong>: Modify DNS.  </li>
             * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection.  </li>
             * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrative contact information.  </li>
             * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information.  </li>
             * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information.  </li>
             * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock.  </li>
             * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock.  </li>
             * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order.  </li>
             * <li><strong>ORDER_RENEW</strong>: Create a renewal order.  </li>
             * <li><strong>ORDER_REDEEM</strong>: Create a redemption order.  </li>
             * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host.  </li>
             * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host.  </li>
             * <li><strong>SYNC_DNSHOST</strong>: Synchronize a DNS host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHG_DNS</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>Description of the task type.</p>
             * 
             * <strong>example:</strong>
             * <p>修改DNS</p>
             */
            public Builder taskTypeDescription(String taskTypeDescription) {
                this.taskTypeDescription = taskTypeDescription;
                return this;
            }

            /**
             * <p>Retry Count of job details.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            /**
             * <p>The most recent task execution time.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30 00:00:00</p>
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
    /**
     * 
     * {@link QueryTaskDetailHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskDetailHistoryResponseBody</p>
     */
    public static class NextPageCursor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TaskDetailNo")
        private String taskDetailNo;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

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

            private Builder() {
            } 

            private Builder(NextPageCursor model) {
                this.createTime = model.createTime;
                this.domainName = model.domainName;
                this.errorMsg = model.errorMsg;
                this.instanceId = model.instanceId;
                this.taskDetailNo = model.taskDetailNo;
                this.taskNo = model.taskNo;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeDescription = model.taskTypeDescription;
                this.tryCount = model.tryCount;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Creation time of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Result of task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>域名有禁止更新锁</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Domain name instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S1234567890</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Task detail number.</p>
             * 
             * <strong>example:</strong>
             * <p>75addb07-28a3-450e-b5ec-2424</p>
             */
            public Builder taskDetailNo(String taskDetailNo) {
                this.taskDetailNo = taskDetailNo;
                return this;
            }

            /**
             * <p>Job number.</p>
             * 
             * <strong>example:</strong>
             * <p>75addb07-28a3-450e-b5ec-test</p>
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * <p>Task Status. Valid values:</p>
             * <ul>
             * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution.</li>
             * <li><strong>EXECUTING</strong>: Executing.</li>
             * <li><strong>EXECUTE_SUCCESS</strong>: Succeeded.</li>
             * <li><strong>EXECUTE_FAILURE</strong>: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXECUTE_FAILURE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Task status code. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Waiting for execution.</li>
             * <li><strong>1</strong>: Executing.</li>
             * <li><strong>2</strong>: Succeeded.</li>
             * <li><strong>3</strong>: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder taskStatusCode(Integer taskStatusCode) {
                this.taskStatusCode = taskStatusCode;
                return this;
            }

            /**
             * <p>Task Type. Valid values:</p>
             * <ul>
             * <li><strong>CHG_HOLDER</strong>: Modify registrant information.</li>
             * <li><strong>CHG_DNS</strong>: Modify DNS.</li>
             * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection.</li>
             * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrator contact information.</li>
             * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information.</li>
             * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information.</li>
             * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable Edit Lock.</li>
             * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable transfer lock.</li>
             * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order.</li>
             * <li><strong>ORDER_RENEW</strong>: Create a renewal order.</li>
             * <li><strong>ORDER_REDEEM</strong>: Create a redemption order.</li>
             * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host.</li>
             * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host.</li>
             * <li><strong>SYNC_DNSHOST</strong>: Synchronize a DNS host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHG_DNS</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>Task Type Description.</p>
             * 
             * <strong>example:</strong>
             * <p>修改DNS</p>
             */
            public Builder taskTypeDescription(String taskTypeDescription) {
                this.taskTypeDescription = taskTypeDescription;
                return this;
            }

            /**
             * <p>Number of retries for the task details.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            /**
             * <p>The most recent running time of the job details.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30 00:00:00</p>
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
    /**
     * 
     * {@link QueryTaskDetailHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskDetailHistoryResponseBody</p>
     */
    public static class Objects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TaskDetailNo")
        private String taskDetailNo;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

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

            private Builder() {
            } 

            private Builder(Objects model) {
                this.createTime = model.createTime;
                this.domainName = model.domainName;
                this.errorMsg = model.errorMsg;
                this.instanceId = model.instanceId;
                this.taskDetailNo = model.taskDetailNo;
                this.taskNo = model.taskNo;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeDescription = model.taskTypeDescription;
                this.tryCount = model.tryCount;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30 00:00:00</p>
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
             * <p>The result of the job execution.</p>
             * 
             * <strong>example:</strong>
             * <p>域名有禁止更新锁</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The instance ID of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>S123456789</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Task detail number.</p>
             * 
             * <strong>example:</strong>
             * <p>75addb07-28a3-450e-b5ec-4234</p>
             */
            public Builder taskDetailNo(String taskDetailNo) {
                this.taskDetailNo = taskDetailNo;
                return this;
            }

            /**
             * <p>The job number.</p>
             * 
             * <strong>example:</strong>
             * <p>75addb07-28a3-450e-b5ec-test</p>
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * <p>Task Status. Valid values:  </p>
             * <ul>
             * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution.  </li>
             * <li><strong>EXECUTING</strong>: Executing.  </li>
             * <li><strong>EXECUTE_SUCCESS</strong>: Execution succeeded.  </li>
             * <li><strong>EXECUTE_FAILURE</strong>: Execution failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXECUTE_FAILURE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The job status code. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Waiting for execution.</li>
             * <li><strong>1</strong>: Executing.</li>
             * <li><strong>2</strong>: Succeeded.</li>
             * <li><strong>3</strong>: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder taskStatusCode(Integer taskStatusCode) {
                this.taskStatusCode = taskStatusCode;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>CHG_HOLDER</strong>: Modify registrant information.</li>
             * <li><strong>CHG_DNS</strong>: Modify DNS settings.</li>
             * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection.</li>
             * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Update administrative contact information.</li>
             * <li><strong>UPDATE_BILLING_CONTACT</strong>: Update billing contact information.</li>
             * <li><strong>UPDATE_TECH_CONTACT</strong>: Update technical contact information.</li>
             * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable the Edit Lock for the domain name.</li>
             * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable the transfer lock for the domain name.</li>
             * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order.</li>
             * <li><strong>ORDER_RENEW</strong>: Create a renewal order.</li>
             * <li><strong>ORDER_REDEEM</strong>: Create a redemption order.</li>
             * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host.</li>
             * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host.</li>
             * <li><strong>SYNC_DNSHOST</strong>: Synchronize a DNS host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHG_DNS</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>Task Type description.</p>
             * 
             * <strong>example:</strong>
             * <p>修改DNS</p>
             */
            public Builder taskTypeDescription(String taskTypeDescription) {
                this.taskTypeDescription = taskTypeDescription;
                return this;
            }

            /**
             * <p>Number of retries for the task detail.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            /**
             * <p>The running time of the most recent job execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30 00:00:00</p>
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
    /**
     * 
     * {@link QueryTaskDetailHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskDetailHistoryResponseBody</p>
     */
    public static class PrePageCursor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TaskDetailNo")
        private String taskDetailNo;

        @com.aliyun.core.annotation.NameInMap("TaskNo")
        private String taskNo;

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

            private Builder() {
            } 

            private Builder(PrePageCursor model) {
                this.createTime = model.createTime;
                this.domainName = model.domainName;
                this.errorMsg = model.errorMsg;
                this.instanceId = model.instanceId;
                this.taskDetailNo = model.taskDetailNo;
                this.taskNo = model.taskNo;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeDescription = model.taskTypeDescription;
                this.tryCount = model.tryCount;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Task creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Result of task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>域名有禁止更新锁</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Domain instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S123456789</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Task detail number.</p>
             * 
             * <strong>example:</strong>
             * <p>75addb07-28a3-450e-b5ec-123</p>
             */
            public Builder taskDetailNo(String taskDetailNo) {
                this.taskDetailNo = taskDetailNo;
                return this;
            }

            /**
             * <p>Task number.</p>
             * 
             * <strong>example:</strong>
             * <p>75addb07-28a3-450e-b5ec-test</p>
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * <p>Task Status. Valid values:</p>
             * <ul>
             * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution.</li>
             * <li><strong>EXECUTING</strong>: Executing.</li>
             * <li><strong>EXECUTE_SUCCESS</strong>: Execution succeeded.</li>
             * <li><strong>EXECUTE_FAILURE</strong>: Execution failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXECUTE_FAILURE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Task status code. Valid values:  </p>
             * <ul>
             * <li><strong>0</strong>: Waiting for execution.  </li>
             * <li><strong>1</strong>: Executing.  </li>
             * <li><strong>2</strong>: Execution succeeded.  </li>
             * <li><strong>3</strong>: Execution failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder taskStatusCode(Integer taskStatusCode) {
                this.taskStatusCode = taskStatusCode;
                return this;
            }

            /**
             * <p>Task Type. Valid values:</p>
             * <ul>
             * <li><strong>CHG_HOLDER</strong>: Modify registrant information.</li>
             * <li><strong>CHG_DNS</strong>: Modify DNS.</li>
             * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection.</li>
             * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrative contact information.</li>
             * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information.</li>
             * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information.</li>
             * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock.</li>
             * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock.</li>
             * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order.</li>
             * <li><strong>ORDER_RENEW</strong>: Create a renewal order.</li>
             * <li><strong>ORDER_REDEEM</strong>: Create a redemption order.</li>
             * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host.</li>
             * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host.</li>
             * <li><strong>SYNC_DNSHOST</strong>: Synchronize a DNS host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHG_DNS</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>Description of the task type.</p>
             * 
             * <strong>example:</strong>
             * <p>修改DNS</p>
             */
            public Builder taskTypeDescription(String taskTypeDescription) {
                this.taskTypeDescription = taskTypeDescription;
                return this;
            }

            /**
             * <p>Number of retries for the task detail.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            /**
             * <p>The most recent running time of the task details.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30 00:00:00</p>
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
