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
 * {@link GetBaselineKeyPathResponseBody} extends {@link TeaModel}
 *
 * <p>GetBaselineKeyPathResponseBody</p>
 */
public class GetBaselineKeyPathResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    private GetBaselineKeyPathResponseBody(Builder builder) {
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

    public static GetBaselineKeyPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The information about the key path.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>1031203110005</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The timestamp when the event was found.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The unique ID of the call. After an error occurs, you can troubleshoot the problem based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBaselineKeyPathResponseBody build() {
            return new GetBaselineKeyPathResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBaselineKeyPathResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineKeyPathResponseBody</p>
     */
    public static class Runs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbsTime")
        private Long absTime;

        @com.aliyun.core.annotation.NameInMap("BeginCast")
        private Long beginCast;

        @com.aliyun.core.annotation.NameInMap("BeginRunningTime")
        private Long beginRunningTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitResTime")
        private Long beginWaitResTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitTimeTime")
        private Long beginWaitTimeTime;

        @com.aliyun.core.annotation.NameInMap("EndCast")
        private Long endCast;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Runs(Builder builder) {
            this.absTime = builder.absTime;
            this.beginCast = builder.beginCast;
            this.beginRunningTime = builder.beginRunningTime;
            this.beginWaitResTime = builder.beginWaitResTime;
            this.beginWaitTimeTime = builder.beginWaitTimeTime;
            this.endCast = builder.endCast;
            this.finishTime = builder.finishTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runs create() {
            return builder().build();
        }

        /**
         * @return absTime
         */
        public Long getAbsTime() {
            return this.absTime;
        }

        /**
         * @return beginCast
         */
        public Long getBeginCast() {
            return this.beginCast;
        }

        /**
         * @return beginRunningTime
         */
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        /**
         * @return beginWaitResTime
         */
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        /**
         * @return beginWaitTimeTime
         */
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long absTime; 
            private Long beginCast; 
            private Long beginRunningTime; 
            private Long beginWaitResTime; 
            private Long beginWaitTimeTime; 
            private Long endCast; 
            private Long finishTime; 
            private String status; 

            /**
             * <p>The timestamp obtained by adding the predicted time when the instance started to run to the historical average running duration of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531402000</p>
             */
            public Builder absTime(Long absTime) {
                this.absTime = absTime;
                return this;
            }

            /**
             * <p>The timestamp of the predicted time when the instance started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531686000</p>
             */
            public Builder beginCast(Long beginCast) {
                this.beginCast = beginCast;
                return this;
            }

            /**
             * <p>The timestamp of the actual time when the instance started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531401000</p>
             */
            public Builder beginRunningTime(Long beginRunningTime) {
                this.beginRunningTime = beginRunningTime;
                return this;
            }

            /**
             * <p>The timestamp when the instance started to wait for resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531401000</p>
             */
            public Builder beginWaitResTime(Long beginWaitResTime) {
                this.beginWaitResTime = beginWaitResTime;
                return this;
            }

            /**
             * <p>The timestamp when the instance started to wait for the scheduling time.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531400000</p>
             */
            public Builder beginWaitTimeTime(Long beginWaitTimeTime) {
                this.beginWaitTimeTime = beginWaitTimeTime;
                return this;
            }

            /**
             * <p>The timestamp of the predicted time when the instance finished running.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531687000</p>
             */
            public Builder endCast(Long endCast) {
                this.endCast = endCast;
                return this;
            }

            /**
             * <p>The timestamp of the actual time when the instance finished running.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531401000</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values: NOT_RUN, WAIT_TIME, WAIT_RESOURCE, RUNNING, CHECKING, CHECKING_CONDITION, FAILURE, and SUCCESS. The value NOT_RUN indicates that the instance is not run. The value WAIT_TIME indicates that the instance is waiting to be run. The value WAIT_RESOURCE indicates that the instance is waiting for resources. The value RUNNING indicates that the instance is running. The value CHECKING indicates that data quality is being checked for the instance. The value CHECKING_CONDITION indicates that branch conditions are being checked for the instance. The value FAILURE indicates that the instance fails to run. The value SUCCESS indicates that the instance is run.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Runs build() {
                return new Runs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBaselineKeyPathResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineKeyPathResponseBody</p>
     */
    public static class Topics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddTime")
        private Long addTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private Topics(Builder builder) {
            this.addTime = builder.addTime;
            this.instanceId = builder.instanceId;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topics create() {
            return builder().build();
        }

        /**
         * @return addTime
         */
        public Long getAddTime() {
            return this.addTime;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Long addTime; 
            private Long instanceId; 
            private Long topicId; 
            private String topicName; 

            /**
             * <p>The timestamp when the event was found.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531401000</p>
             */
            public Builder addTime(Long addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Topics build() {
                return new Topics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBaselineKeyPathResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineKeyPathResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("InGroupId")
        private Integer inGroupId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("PrgType")
        private Integer prgType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Runs")
        private java.util.List<Runs> runs;

        @com.aliyun.core.annotation.NameInMap("Topics")
        private java.util.List<Topics> topics;

        private Data(Builder builder) {
            this.bizdate = builder.bizdate;
            this.inGroupId = builder.inGroupId;
            this.instanceId = builder.instanceId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.owner = builder.owner;
            this.prgType = builder.prgType;
            this.projectId = builder.projectId;
            this.runs = builder.runs;
            this.topics = builder.topics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return inGroupId
         */
        public Integer getInGroupId() {
            return this.inGroupId;
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
         * @return prgType
         */
        public Integer getPrgType() {
            return this.prgType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return runs
         */
        public java.util.List<Runs> getRuns() {
            return this.runs;
        }

        /**
         * @return topics
         */
        public java.util.List<Topics> getTopics() {
            return this.topics;
        }

        public static final class Builder {
            private Long bizdate; 
            private Integer inGroupId; 
            private Long instanceId; 
            private Long nodeId; 
            private String nodeName; 
            private String owner; 
            private Integer prgType; 
            private Long projectId; 
            private java.util.List<Runs> runs; 
            private java.util.List<Topics> topics; 

            /**
             * <p>The data timestamp of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The ID of the scheduling cycle of the instance. Valid values: 1 to 288.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inGroupId(Integer inGroupId) {
                this.inGroupId = inGroupId;
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
             * <p>The node ID.</p>
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
             * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>9527952****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The type of the node. Valid values: 23, 10, 6, and 99. The value 23 indicates that the node is a Data Integration node. The value 10 indicates that the node is a MaxCompute SQL node. The value 6 indicates that the node is a Shell node. The value 99 indicates that the node is a zero load node.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder prgType(Integer prgType) {
                this.prgType = prgType;
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
             * <p>The running records of the instance.</p>
             */
            public Builder runs(java.util.List<Runs> runs) {
                this.runs = runs;
                return this;
            }

            /**
             * <p>The information about the events that are associated with the instance.</p>
             */
            public Builder topics(java.util.List<Topics> topics) {
                this.topics = topics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
