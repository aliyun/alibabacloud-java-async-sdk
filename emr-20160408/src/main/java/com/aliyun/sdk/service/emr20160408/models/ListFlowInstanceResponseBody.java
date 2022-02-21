// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowInstanceResponseBody</p>
 */
public class ListFlowInstanceResponseBody extends TeaModel {
    @NameInMap("FlowInstances")
    private FlowInstances flowInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListFlowInstanceResponseBody(Builder builder) {
        this.flowInstances = builder.flowInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowInstances
     */
    public FlowInstances getFlowInstances() {
        return this.flowInstances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private FlowInstances flowInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * FlowInstances.
         */
        public Builder flowInstances(FlowInstances flowInstances) {
            this.flowInstances = flowInstances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListFlowInstanceResponseBody build() {
            return new ListFlowInstanceResponseBody(this);
        } 

    } 

    public static class FlowInstance extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowName")
        private String flowName;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("HasNodeFailed")
        private Boolean hasNodeFailed;

        @NameInMap("Id")
        private String id;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ScheduleTime")
        private Long scheduleTime;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private FlowInstance(Builder builder) {
            this.clusterId = builder.clusterId;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hasNodeFailed = builder.hasNodeFailed;
            this.id = builder.id;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowInstance create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hasNodeFailed
         */
        public Boolean getHasNodeFailed() {
            return this.hasNodeFailed;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return scheduleTime
         */
        public Long getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private Long duration; 
            private Long endTime; 
            private String flowId; 
            private String flowName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Boolean hasNodeFailed; 
            private String id; 
            private String owner; 
            private String projectId; 
            private Long scheduleTime; 
            private Long startTime; 
            private String status; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HasNodeFailed.
             */
            public Builder hasNodeFailed(Boolean hasNodeFailed) {
                this.hasNodeFailed = hasNodeFailed;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ScheduleTime.
             */
            public Builder scheduleTime(Long scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FlowInstance build() {
                return new FlowInstance(this);
            } 

        } 

    }
    public static class FlowInstances extends TeaModel {
        @NameInMap("FlowInstance")
        private java.util.List < FlowInstance> flowInstance;

        private FlowInstances(Builder builder) {
            this.flowInstance = builder.flowInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowInstances create() {
            return builder().build();
        }

        /**
         * @return flowInstance
         */
        public java.util.List < FlowInstance> getFlowInstance() {
            return this.flowInstance;
        }

        public static final class Builder {
            private java.util.List < FlowInstance> flowInstance; 

            /**
             * FlowInstance.
             */
            public Builder flowInstance(java.util.List < FlowInstance> flowInstance) {
                this.flowInstance = flowInstance;
                return this;
            }

            public FlowInstances build() {
                return new FlowInstances(this);
            } 

        } 

    }
}
