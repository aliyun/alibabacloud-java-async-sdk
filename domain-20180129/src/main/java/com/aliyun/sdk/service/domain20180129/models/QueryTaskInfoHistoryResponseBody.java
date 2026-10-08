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
    private java.util.List<Objects> objects;

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

        private Builder(QueryTaskInfoHistoryResponseBody model) {
            this.currentPageCursor = model.currentPageCursor;
            this.nextPageCursor = model.nextPageCursor;
            this.objects = model.objects;
            this.pageSize = model.pageSize;
            this.prePageCursor = model.prePageCursor;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Cursor for the current page.</p>
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
         * <p>Job information.</p>
         */
        public Builder objects(java.util.List<Objects> objects) {
            this.objects = objects;
            return this;
        }

        /**
         * <p>Page size.</p>
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
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>EB3FCCBA-CA1F-4D31-9F34-test</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryTaskInfoHistoryResponseBody build() {
            return new QueryTaskInfoHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTaskInfoHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskInfoHistoryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CurrentPageCursor model) {
                this.clientip = model.clientip;
                this.createTime = model.createTime;
                this.createTimeLong = model.createTimeLong;
                this.taskNo = model.taskNo;
                this.taskNum = model.taskNum;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeDescription = model.taskTypeDescription;
            } 

            /**
             * <p>User IP address when the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder clientip(String clientip) {
                this.clientip = clientip;
                return this;
            }

            /**
             * <p>Job creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-01 17:22:51</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Job creation UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1509528171000</p>
             */
            public Builder createTimeLong(Long createTimeLong) {
                this.createTimeLong = createTimeLong;
                return this;
            }

            /**
             * <p>Job number.</p>
             * 
             * <strong>example:</strong>
             * <p>aa634d3f-927e-4d17-9d2c-test</p>
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * <p>Number of domain names included in the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskNum(Integer taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            /**
             * <p>Task Status. Valid values:</p>
             * <ul>
             * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution;</li>
             * <li><strong>EXECUTING</strong>: Executing;</li>
             * <li><strong>COMPLETE</strong>: Execution completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Job status code. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Waiting for execution  </li>
             * <li><strong>2</strong>: Executing  </li>
             * <li><strong>3</strong>: Execution completed</li>
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
             * <p>Job type. Valid values:  </p>
             * <ul>
             * <li><strong>CHG_HOLDER</strong>: Modify registrant information  </li>
             * <li><strong>CHG_DNS</strong>: Modify DNS  </li>
             * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection  </li>
             * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrator contact information  </li>
             * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information  </li>
             * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information  </li>
             * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock  </li>
             * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock  </li>
             * <li><strong>ORDER_ACTIVATE</strong>: Create registration order  </li>
             * <li><strong>ORDER_RENEW</strong>: Create renewal order  </li>
             * <li><strong>ORDER_REDEEM</strong>: Create redemption order  </li>
             * <li><strong>CREATE_DNSHOST</strong>: Create DNS host  </li>
             * <li><strong>UPDATE_DNSHOST</strong>: Update DNS host  </li>
             * <li><strong>UPDATE_REGISTRANT_CONTACT</strong>: Modify registrant contact  </li>
             * <li><strong>DELETE_DOMAIN</strong>: Delete domain name  </li>
             * <li><strong>SYNC_DNSHOST</strong>: Synchronize DNS host</li>
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

            public CurrentPageCursor build() {
                return new CurrentPageCursor(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTaskInfoHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskInfoHistoryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NextPageCursor model) {
                this.clientip = model.clientip;
                this.createTime = model.createTime;
                this.createTimeLong = model.createTimeLong;
                this.taskNo = model.taskNo;
                this.taskNum = model.taskNum;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeDescription = model.taskTypeDescription;
            } 

            /**
             * <p>User IP address when the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder clientip(String clientip) {
                this.clientip = clientip;
                return this;
            }

            /**
             * <p>Creation Time of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-10-27 13:07:07</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Creation Time of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1509080827000</p>
             */
            public Builder createTimeLong(Long createTimeLong) {
                this.createTimeLong = createTimeLong;
                return this;
            }

            /**
             * <p>Job number.</p>
             * 
             * <strong>example:</strong>
             * <p>8f112aa1-98be-48c3-82f8-test</p>
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * <p>Number of domain names included in the job.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder taskNum(Integer taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            /**
             * <p>Task Status. Valid values:  </p>
             * <ul>
             * <li><strong>WAITING_EXECUTE</strong>: Waiting to execute;  </li>
             * <li><strong>EXECUTING</strong>: Executing;  </li>
             * <li><strong>COMPLETE</strong>: Execution completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Job status code. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Waiting to execute;  </li>
             * <li><strong>2</strong>: Executing;  </li>
             * <li><strong>3</strong>: Execution completed.</li>
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
             * <p>Task Type. Valid values:  </p>
             * <ul>
             * <li><strong>CHG_HOLDER</strong>: Modify registrant information;  </li>
             * <li><strong>CHG_DNS</strong>: Modify DNS;  </li>
             * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection;  </li>
             * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrative contact information;  </li>
             * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information;  </li>
             * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information;  </li>
             * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name Edit Lock;  </li>
             * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock;  </li>
             * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order;  </li>
             * <li><strong>ORDER_RENEW</strong>: Create a renewal order;  </li>
             * <li><strong>ORDER_REDEEM</strong>: Create a redemption order;  </li>
             * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host;  </li>
             * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host;  </li>
             * <li><strong>UPDATE_REGISTRANT_CONTACT</strong>: Modify registrant contact information;  </li>
             * <li><strong>DELETE_DOMAIN</strong>: Delete a domain name;  </li>
             * <li><strong>SYNC_DNSHOST</strong>: Synchronize DNS host.</li>
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
             * <p>Task type description.</p>
             * 
             * <strong>example:</strong>
             * <p>修改DNS</p>
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
    /**
     * 
     * {@link QueryTaskInfoHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskInfoHistoryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Objects model) {
                this.clientip = model.clientip;
                this.createTime = model.createTime;
                this.createTimeLong = model.createTimeLong;
                this.taskNo = model.taskNo;
                this.taskNum = model.taskNum;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeDescription = model.taskTypeDescription;
            } 

            /**
             * <p>User IP address when submitting the task.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder clientip(String clientip) {
                this.clientip = clientip;
                return this;
            }

            /**
             * <p>Task creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-01 17:22:51</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Task creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1509528171000</p>
             */
            public Builder createTimeLong(Long createTimeLong) {
                this.createTimeLong = createTimeLong;
                return this;
            }

            /**
             * <p>Job number.</p>
             * 
             * <strong>example:</strong>
             * <p>aa634d3f-927e-4d17-9d2c-test</p>
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * <p>Number of domain names included in the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskNum(Integer taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            /**
             * <p>Task status. Valid values:</p>
             * <ul>
             * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution;</li>
             * <li><strong>EXECUTING</strong>: Executing;</li>
             * <li><strong>COMPLETE</strong>: Execution completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Task status code. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Waiting for execution;</li>
             * <li><strong>2</strong>: Executing;</li>
             * <li><strong>3</strong>: Execution completed.</li>
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
             * <li><strong>CHG_HOLDER</strong>: Modify owner information;</li>
             * <li><strong>CHG_DNS</strong>: Modify DNS;</li>
             * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection;</li>
             * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrative contact information;</li>
             * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information;</li>
             * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information;</li>
             * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock;</li>
             * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock;</li>
             * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order;</li>
             * <li><strong>ORDER_RENEW</strong>: Create a renewal order;</li>
             * <li><strong>ORDER_REDEEM</strong>: Create a redemption order;</li>
             * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host;</li>
             * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host;</li>
             * <li><strong>UPDATE_REGISTRANT_CONTACT</strong>: Modify registrant contact information;</li>
             * <li><strong>DELETE_DOMAIN</strong>: Delete a domain name;</li>
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
             * <p>Task type description.</p>
             * 
             * <strong>example:</strong>
             * <p>修改DNS</p>
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
    /**
     * 
     * {@link QueryTaskInfoHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskInfoHistoryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PrePageCursor model) {
                this.clientip = model.clientip;
                this.createTime = model.createTime;
                this.createTimeLong = model.createTimeLong;
                this.taskNo = model.taskNo;
                this.taskNum = model.taskNum;
                this.taskStatus = model.taskStatus;
                this.taskStatusCode = model.taskStatusCode;
                this.taskType = model.taskType;
                this.taskTypeDescription = model.taskTypeDescription;
            } 

            /**
             * <p>User IP address when submitting the job.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder clientip(String clientip) {
                this.clientip = clientip;
                return this;
            }

            /**
             * <p>Job creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-01 17:19:47</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Job creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1509527987000</p>
             */
            public Builder createTimeLong(Long createTimeLong) {
                this.createTimeLong = createTimeLong;
                return this;
            }

            /**
             * <p>Task number.</p>
             * 
             * <strong>example:</strong>
             * <p>f9baa3d5-33b9-4c81-8847-test</p>
             */
            public Builder taskNo(String taskNo) {
                this.taskNo = taskNo;
                return this;
            }

            /**
             * <p>Number of domain names included in the job.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder taskNum(Integer taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            /**
             * <p>Task Status. Valid values:  </p>
             * <ul>
             * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution;  </li>
             * <li><strong>EXECUTING</strong>: Executing;  </li>
             * <li><strong>COMPLETE</strong>: Execution completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Task status code. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Waiting for execution;  </li>
             * <li><strong>2</strong>: Executing;  </li>
             * <li><strong>3</strong>: Execution completed.</li>
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
             * <p>Task Type. Valid values:  </p>
             * <ul>
             * <li><strong>CHG_HOLDER</strong>: Modify registrant information;  </li>
             * <li><strong>CHG_DNS</strong>: Modify DNS;  </li>
             * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection;  </li>
             * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Update administrative contact;  </li>
             * <li><strong>UPDATE_BILLING_CONTACT</strong>: Update billing contact;  </li>
             * <li><strong>UPDATE_TECH_CONTACT</strong>: Update technical contact;  </li>
             * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock;  </li>
             * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock;  </li>
             * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order;  </li>
             * <li><strong>ORDER_RENEW</strong>: Create a renewal order;  </li>
             * <li><strong>ORDER_REDEEM</strong>: Create a redemption order;  </li>
             * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host;  </li>
             * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host;  </li>
             * <li><strong>UPDATE_REGISTRANT_CONTACT</strong>: Update registrant contact;  </li>
             * <li><strong>DELETE_DOMAIN</strong>: Delete a domain name;  </li>
             * <li><strong>SYNC_DNSHOST</strong>: Synchronize DNS host.</li>
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
             * <p>Task type description.</p>
             * 
             * <strong>example:</strong>
             * <p>修改DNS</p>
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
