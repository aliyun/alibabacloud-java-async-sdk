// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetBaselineStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetBaselineStatusResponseBody</p>
 */
public class GetBaselineStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBaselineStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBaselineStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetBaselineStatusResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the baseline instance.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1031203110005</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The unique ID of the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBaselineStatusResponseBody build() {
            return new GetBaselineStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBaselineStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineStatusResponseBody</p>
     */
    public static class BlockInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndCast")
        private Long endCast;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private BlockInstance(Builder builder) {
            this.endCast = builder.endCast;
            this.finishTime = builder.finishTime;
            this.instanceId = builder.instanceId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockInstance create() {
            return builder().build();
        }

        /**
         * @return endCast
         */
        public Long getEndCast() {
            return this.endCast;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
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
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long endCast; 
            private Long finishTime; 
            private Long instanceId; 
            private Long nodeId; 
            private String nodeName; 
            private String owner; 
            private Long projectId; 
            private String status; 

            private Builder() {
            } 

            private Builder(BlockInstance model) {
                this.endCast = model.endCast;
                this.finishTime = model.finishTime;
                this.instanceId = model.instanceId;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.status = model.status;
            } 

            /**
             * <p>The estimated completion timestamp of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder endCast(Long endCast) {
                this.endCast = endCast;
                return this;
            }

            /**
             * <p>The actual completion timestamp of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>NodeName</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>9527952795****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values: NOT_RUN, WAIT_TIME, WAIT_RESOURCE, RUNNING, CHECKING, CHECKING_CONDITION, FAILURE, and SUCCESS.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BlockInstance build() {
                return new BlockInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBaselineStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineStatusResponseBody</p>
     */
    public static class LastInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndCast")
        private Long endCast;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private LastInstance(Builder builder) {
            this.endCast = builder.endCast;
            this.finishTime = builder.finishTime;
            this.instanceId = builder.instanceId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastInstance create() {
            return builder().build();
        }

        /**
         * @return endCast
         */
        public Long getEndCast() {
            return this.endCast;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
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
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long endCast; 
            private Long finishTime; 
            private Long instanceId; 
            private Long nodeId; 
            private String nodeName; 
            private String owner; 
            private Long projectId; 
            private String status; 

            private Builder() {
            } 

            private Builder(LastInstance model) {
                this.endCast = model.endCast;
                this.finishTime = model.finishTime;
                this.instanceId = model.instanceId;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.status = model.status;
            } 

            /**
             * <p>The estimated completion timestamp of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder endCast(Long endCast) {
                this.endCast = endCast;
                return this;
            }

            /**
             * <p>The actual completion timestamp of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Node name</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>9527952795****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values: NOT_RUN, WAIT_TIME, WAIT_RESOURCE, RUNNING, CHECKING, CHECKING_CONDITION, FAILURE, and SUCCESS.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LastInstance build() {
                return new LastInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBaselineStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BaselineName")
        private String baselineName;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("BlockInstance")
        private BlockInstance blockInstance;

        @com.aliyun.core.annotation.NameInMap("Buffer")
        private Float buffer;

        @com.aliyun.core.annotation.NameInMap("EndCast")
        private Long endCast;

        @com.aliyun.core.annotation.NameInMap("ExpTime")
        private Long expTime;

        @com.aliyun.core.annotation.NameInMap("FinishStatus")
        private String finishStatus;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("InGroupId")
        private Integer inGroupId;

        @com.aliyun.core.annotation.NameInMap("LastInstance")
        private LastInstance lastInstance;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SlaTime")
        private Long slaTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.baselineId = builder.baselineId;
            this.baselineName = builder.baselineName;
            this.bizdate = builder.bizdate;
            this.blockInstance = builder.blockInstance;
            this.buffer = builder.buffer;
            this.endCast = builder.endCast;
            this.expTime = builder.expTime;
            this.finishStatus = builder.finishStatus;
            this.finishTime = builder.finishTime;
            this.inGroupId = builder.inGroupId;
            this.lastInstance = builder.lastInstance;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.slaTime = builder.slaTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return baselineName
         */
        public String getBaselineName() {
            return this.baselineName;
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return blockInstance
         */
        public BlockInstance getBlockInstance() {
            return this.blockInstance;
        }

        /**
         * @return buffer
         */
        public Float getBuffer() {
            return this.buffer;
        }

        /**
         * @return endCast
         */
        public Long getEndCast() {
            return this.endCast;
        }

        /**
         * @return expTime
         */
        public Long getExpTime() {
            return this.expTime;
        }

        /**
         * @return finishStatus
         */
        public String getFinishStatus() {
            return this.finishStatus;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return inGroupId
         */
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        /**
         * @return lastInstance
         */
        public LastInstance getLastInstance() {
            return this.lastInstance;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return slaTime
         */
        public Long getSlaTime() {
            return this.slaTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long baselineId; 
            private String baselineName; 
            private Long bizdate; 
            private BlockInstance blockInstance; 
            private Float buffer; 
            private Long endCast; 
            private Long expTime; 
            private String finishStatus; 
            private Long finishTime; 
            private Integer inGroupId; 
            private LastInstance lastInstance; 
            private String owner; 
            private Integer priority; 
            private Long projectId; 
            private Long slaTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baselineId = model.baselineId;
                this.baselineName = model.baselineName;
                this.bizdate = model.bizdate;
                this.blockInstance = model.blockInstance;
                this.buffer = model.buffer;
                this.endCast = model.endCast;
                this.expTime = model.expTime;
                this.finishStatus = model.finishStatus;
                this.finishTime = model.finishTime;
                this.inGroupId = model.inGroupId;
                this.lastInstance = model.lastInstance;
                this.owner = model.owner;
                this.priority = model.priority;
                this.projectId = model.projectId;
                this.slaTime = model.slaTime;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The name of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Baseline name</p>
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * <p>The business date timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The information about the critical instance.</p>
             */
            public Builder blockInstance(BlockInstance blockInstance) {
                this.blockInstance = blockInstance;
                return this;
            }

            /**
             * <p>The buffer time of the baseline instance, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder buffer(Float buffer) {
                this.buffer = buffer;
                return this;
            }

            /**
             * <p>The estimated completion timestamp of the baseline instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder endCast(Long endCast) {
                this.endCast = endCast;
                return this;
            }

            /**
             * <p>The warning timestamp of the baseline instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder expTime(Long expTime) {
                this.expTime = expTime;
                return this;
            }

            /**
             * <p>Indicates whether the baseline instance is completed. Valid values: UNFINISH and FINISH.</p>
             * 
             * <strong>example:</strong>
             * <p>UNFINISH</p>
             */
            public Builder finishStatus(String finishStatus) {
                this.finishStatus = finishStatus;
                return this;
            }

            /**
             * <p>The completion timestamp of the baseline instance. This parameter is returned only when FinishStatus is FINISH.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The cycle number of the baseline instance. The value is 1 for daily baselines. The value ranges from [1,24\] for hourly baselines.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inGroupId(Integer inGroupId) {
                this.inGroupId = inGroupId;
                return this;
            }

            /**
             * <p>The information about the latest instance.</p>
             */
            public Builder lastInstance(LastInstance lastInstance) {
                this.lastInstance = lastInstance;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the baseline owner. Multiple owners are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>9527952795****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The priority of the baseline. Valid values: 1, 2, 5, 7, and 8.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the baseline belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The committed completion timestamp of the baseline instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder slaTime(Long slaTime) {
                this.slaTime = slaTime;
                return this;
            }

            /**
             * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGROUS (warning), and OVER (exceeded).</p>
             * 
             * <strong>example:</strong>
             * <p>SAFE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
