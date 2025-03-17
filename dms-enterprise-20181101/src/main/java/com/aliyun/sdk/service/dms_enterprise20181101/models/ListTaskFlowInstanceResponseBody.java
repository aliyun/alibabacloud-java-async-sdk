// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListTaskFlowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowInstanceResponseBody</p>
 */
public class ListTaskFlowInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DAGInstanceList")
    private DAGInstanceList DAGInstanceList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTaskFlowInstanceResponseBody(Builder builder) {
        this.DAGInstanceList = builder.DAGInstanceList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DAGInstanceList
     */
    public DAGInstanceList getDAGInstanceList() {
        return this.DAGInstanceList;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DAGInstanceList DAGInstanceList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTaskFlowInstanceResponseBody model) {
            this.DAGInstanceList = model.DAGInstanceList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the execution records returned.</p>
         */
        public Builder DAGInstanceList(DAGInstanceList DAGInstanceList) {
            this.DAGInstanceList = DAGInstanceList;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8CFF2295-8249-5287-B888-DBD4F0D76CB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of execution records returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTaskFlowInstanceResponseBody build() {
            return new ListTaskFlowInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskFlowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowInstanceResponseBody</p>
     */
    public static class DAGInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessTime")
        private String businessTime;

        @com.aliyun.core.annotation.NameInMap("DagId")
        private String dagId;

        @com.aliyun.core.annotation.NameInMap("DagName")
        private String dagName;

        @com.aliyun.core.annotation.NameInMap("DagVersion")
        private String dagVersion;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("HistoryDagId")
        private Long historyDagId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private Integer triggerType;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private DAGInstance(Builder builder) {
            this.businessTime = builder.businessTime;
            this.dagId = builder.dagId;
            this.dagName = builder.dagName;
            this.dagVersion = builder.dagVersion;
            this.endTime = builder.endTime;
            this.historyDagId = builder.historyDagId;
            this.id = builder.id;
            this.message = builder.message;
            this.ownerName = builder.ownerName;
            this.status = builder.status;
            this.triggerType = builder.triggerType;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DAGInstance create() {
            return builder().build();
        }

        /**
         * @return businessTime
         */
        public String getBusinessTime() {
            return this.businessTime;
        }

        /**
         * @return dagId
         */
        public String getDagId() {
            return this.dagId;
        }

        /**
         * @return dagName
         */
        public String getDagName() {
            return this.dagName;
        }

        /**
         * @return dagVersion
         */
        public String getDagVersion() {
            return this.dagVersion;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return historyDagId
         */
        public Long getHistoryDagId() {
            return this.historyDagId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return triggerType
         */
        public Integer getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String businessTime; 
            private String dagId; 
            private String dagName; 
            private String dagVersion; 
            private String endTime; 
            private Long historyDagId; 
            private Long id; 
            private String message; 
            private String ownerName; 
            private Integer status; 
            private Integer triggerType; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(DAGInstance model) {
                this.businessTime = model.businessTime;
                this.dagId = model.dagId;
                this.dagName = model.dagName;
                this.dagVersion = model.dagVersion;
                this.endTime = model.endTime;
                this.historyDagId = model.historyDagId;
                this.id = model.id;
                this.message = model.message;
                this.ownerName = model.ownerName;
                this.status = model.status;
                this.triggerType = model.triggerType;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The business time of the task flow. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-10 14:37:26</p>
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * <p>The ID of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>7***</p>
             */
            public Builder dagId(String dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The name of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>Spark_SQL_test</p>
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * <p>The version of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder dagVersion(String dagVersion) {
                this.dagVersion = dagVersion;
                return this;
            }

            /**
             * <p>The time when the execution of the task flow was complete. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-11 14:38:57</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the previously published version of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>2****</p>
             */
            public Builder historyDagId(Long historyDagId) {
                this.historyDagId = historyDagId;
                return this;
            }

            /**
             * <p>The ID of the execution record.</p>
             * 
             * <strong>example:</strong>
             * <p>9234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the task flow owner.</p>
             * 
             * <strong>example:</strong>
             * <p>test_name</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The status of the task flow. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The task flow is waiting to be scheduled.</li>
             * <li><strong>1</strong>: The task flow is being executed.</li>
             * <li><strong>2</strong>: The task flow is paused.</li>
             * <li><strong>3</strong>: The task flow failed.</li>
             * <li><strong>4</strong>: The task flow is executed.</li>
             * <li><strong>5</strong>: The task flow is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The mode in which the task flow is triggered. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The task flow is automatically triggered based on periodic scheduling.</li>
             * <li><strong>1</strong>: The task flow is manually triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder triggerType(Integer triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The time when the execution of the task flow was start. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-11 14:35:57</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public DAGInstance build() {
                return new DAGInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTaskFlowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowInstanceResponseBody</p>
     */
    public static class DAGInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DAGInstance")
        private java.util.List<DAGInstance> DAGInstance;

        private DAGInstanceList(Builder builder) {
            this.DAGInstance = builder.DAGInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DAGInstanceList create() {
            return builder().build();
        }

        /**
         * @return DAGInstance
         */
        public java.util.List<DAGInstance> getDAGInstance() {
            return this.DAGInstance;
        }

        public static final class Builder {
            private java.util.List<DAGInstance> DAGInstance; 

            private Builder() {
            } 

            private Builder(DAGInstanceList model) {
                this.DAGInstance = model.DAGInstance;
            } 

            /**
             * DAGInstance.
             */
            public Builder DAGInstance(java.util.List<DAGInstance> DAGInstance) {
                this.DAGInstance = DAGInstance;
                return this;
            }

            public DAGInstanceList build() {
                return new DAGInstanceList(this);
            } 

        } 

    }
}
