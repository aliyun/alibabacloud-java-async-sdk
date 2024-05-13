// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The information about the execution records returned.
         */
        public Builder DAGInstanceList(DAGInstanceList DAGInstanceList) {
            this.DAGInstanceList = DAGInstanceList;
            return this;
        }

        /**
         * The error code returned if the request fails.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request fails.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**: The request is successful.
         * *   **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of execution records returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTaskFlowInstanceResponseBody build() {
            return new ListTaskFlowInstanceResponseBody(this);
        } 

    } 

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

            /**
             * The business time of the task flow. The time is displayed in the yyyy-MM-DD HH:mm:ss format.
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * The ID of the task flow.
             */
            public Builder dagId(String dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * The name of the task flow.
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * The version of the task flow.
             */
            public Builder dagVersion(String dagVersion) {
                this.dagVersion = dagVersion;
                return this;
            }

            /**
             * The time when the execution of the task flow was complete. The time is displayed in the yyyy-MM-DD HH:mm:ss format.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The ID of the previously published version of the task flow.
             */
            public Builder historyDagId(Long historyDagId) {
                this.historyDagId = historyDagId;
                return this;
            }

            /**
             * The ID of the execution record.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The description of the task.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The name of the task flow owner.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * The status of the task flow. Valid values:
             * <p>
             * 
             * *   **0**: The task flow is waiting to be scheduled.
             * *   **1**: The task flow is being executed.
             * *   **2**: The task flow is paused.
             * *   **3**: The task flow failed.
             * *   **4**: The task flow is executed.
             * *   **5**: The task flow is complete.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The mode in which the task flow is triggered. Valid values:
             * <p>
             * 
             * *   **0**: The task flow is automatically triggered based on periodic scheduling.
             * *   **1**: The task flow is manually triggered.
             */
            public Builder triggerType(Integer triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * The time when the execution of the task flow was start. The time is displayed in the yyyy-MM-DD HH:mm:ss format.
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
    public static class DAGInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DAGInstance")
        private java.util.List < DAGInstance> DAGInstance;

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
        public java.util.List < DAGInstance> getDAGInstance() {
            return this.DAGInstance;
        }

        public static final class Builder {
            private java.util.List < DAGInstance> DAGInstance; 

            /**
             * DAGInstance.
             */
            public Builder DAGInstance(java.util.List < DAGInstance> DAGInstance) {
                this.DAGInstance = DAGInstance;
                return this;
            }

            public DAGInstanceList build() {
                return new DAGInstanceList(this);
            } 

        } 

    }
}
