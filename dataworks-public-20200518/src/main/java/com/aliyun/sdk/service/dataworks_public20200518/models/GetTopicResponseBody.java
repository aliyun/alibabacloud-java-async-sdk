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
 * {@link GetTopicResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicResponseBody</p>
 */
public class GetTopicResponseBody extends TeaModel {
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

    private GetTopicResponseBody(Builder builder) {
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

    public static GetTopicResponseBody create() {
        return builder().build();
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

        /**
         * <p>The details of the event.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFGH-IJKLMNOPQ</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTopicResponseBody build() {
            return new GetTopicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTopicResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddTime")
        private Long addTime;

        @com.aliyun.core.annotation.NameInMap("AlertTime")
        private Long alertTime;

        @com.aliyun.core.annotation.NameInMap("Assigner")
        private String assigner;

        @com.aliyun.core.annotation.NameInMap("BaselineBuffer")
        private Long baselineBuffer;

        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BaselineInGroupId")
        private Integer baselineInGroupId;

        @com.aliyun.core.annotation.NameInMap("BaselineName")
        private String baselineName;

        @com.aliyun.core.annotation.NameInMap("BaselineStatus")
        private String baselineStatus;

        @com.aliyun.core.annotation.NameInMap("Buffer")
        private Long buffer;

        @com.aliyun.core.annotation.NameInMap("DealTime")
        private Long dealTime;

        @com.aliyun.core.annotation.NameInMap("DealUser")
        private String dealUser;

        @com.aliyun.core.annotation.NameInMap("FixTime")
        private Long fixTime;

        @com.aliyun.core.annotation.NameInMap("HappenTime")
        private Long happenTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("NextAlertTime")
        private Long nextAlertTime;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("TopicStatus")
        private String topicStatus;

        @com.aliyun.core.annotation.NameInMap("TopicType")
        private String topicType;

        private Data(Builder builder) {
            this.addTime = builder.addTime;
            this.alertTime = builder.alertTime;
            this.assigner = builder.assigner;
            this.baselineBuffer = builder.baselineBuffer;
            this.baselineId = builder.baselineId;
            this.baselineInGroupId = builder.baselineInGroupId;
            this.baselineName = builder.baselineName;
            this.baselineStatus = builder.baselineStatus;
            this.buffer = builder.buffer;
            this.dealTime = builder.dealTime;
            this.dealUser = builder.dealUser;
            this.fixTime = builder.fixTime;
            this.happenTime = builder.happenTime;
            this.instanceId = builder.instanceId;
            this.nextAlertTime = builder.nextAlertTime;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
            this.topicStatus = builder.topicStatus;
            this.topicType = builder.topicType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return addTime
         */
        public Long getAddTime() {
            return this.addTime;
        }

        /**
         * @return alertTime
         */
        public Long getAlertTime() {
            return this.alertTime;
        }

        /**
         * @return assigner
         */
        public String getAssigner() {
            return this.assigner;
        }

        /**
         * @return baselineBuffer
         */
        public Long getBaselineBuffer() {
            return this.baselineBuffer;
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return baselineInGroupId
         */
        public Integer getBaselineInGroupId() {
            return this.baselineInGroupId;
        }

        /**
         * @return baselineName
         */
        public String getBaselineName() {
            return this.baselineName;
        }

        /**
         * @return baselineStatus
         */
        public String getBaselineStatus() {
            return this.baselineStatus;
        }

        /**
         * @return buffer
         */
        public Long getBuffer() {
            return this.buffer;
        }

        /**
         * @return dealTime
         */
        public Long getDealTime() {
            return this.dealTime;
        }

        /**
         * @return dealUser
         */
        public String getDealUser() {
            return this.dealUser;
        }

        /**
         * @return fixTime
         */
        public Long getFixTime() {
            return this.fixTime;
        }

        /**
         * @return happenTime
         */
        public Long getHappenTime() {
            return this.happenTime;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nextAlertTime
         */
        public Long getNextAlertTime() {
            return this.nextAlertTime;
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

        /**
         * @return topicStatus
         */
        public String getTopicStatus() {
            return this.topicStatus;
        }

        /**
         * @return topicType
         */
        public String getTopicType() {
            return this.topicType;
        }

        public static final class Builder {
            private Long addTime; 
            private Long alertTime; 
            private String assigner; 
            private Long baselineBuffer; 
            private Long baselineId; 
            private Integer baselineInGroupId; 
            private String baselineName; 
            private String baselineStatus; 
            private Long buffer; 
            private Long dealTime; 
            private String dealUser; 
            private Long fixTime; 
            private Long happenTime; 
            private Long instanceId; 
            private Long nextAlertTime; 
            private Long nodeId; 
            private String nodeName; 
            private String owner; 
            private Long projectId; 
            private Long topicId; 
            private String topicName; 
            private String topicStatus; 
            private String topicType; 

            /**
             * <p>The timestamp when the event was found.</p>
             * 
             * <strong>example:</strong>
             * <p>1553524393000</p>
             */
            public Builder addTime(Long addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * <p>The timestamp when the first alert was reported.</p>
             * 
             * <strong>example:</strong>
             * <p>1553524393000</p>
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the alert recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>952795****</p>
             */
            public Builder assigner(String assigner) {
                this.assigner = assigner;
                return this;
            }

            /**
             * <p>The margin of the worst baseline instance. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder baselineBuffer(Long baselineBuffer) {
                this.baselineBuffer = baselineBuffer;
                return this;
            }

            /**
             * <p>The ID of the baseline to which the worst baseline instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The ID of the cycle of the worst baseline instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder baselineInGroupId(Integer baselineInGroupId) {
                this.baselineInGroupId = baselineInGroupId;
                return this;
            }

            /**
             * <p>The name of the baseline to which the worst baseline instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Baseline name</p>
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes are run before the alert duration begins. The value DANGROUS indicates that nodes are still running after the alert duration ends but the committed completion time does not arrive. The value OVER indicates that nodes are still running after the committed completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>SAFE</p>
             */
            public Builder baselineStatus(String baselineStatus) {
                this.baselineStatus = baselineStatus;
                return this;
            }

            /**
             * <p>The margin of the event. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder buffer(Long buffer) {
                this.buffer = buffer;
                return this;
            }

            /**
             * <p>The timestamp when the event was last processed.</p>
             * 
             * <strong>example:</strong>
             * <p>1553524393000</p>
             */
            public Builder dealTime(Long dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the user who last processed the event.</p>
             * 
             * <strong>example:</strong>
             * <p>952795****</p>
             */
            public Builder dealUser(String dealUser) {
                this.dealUser = dealUser;
                return this;
            }

            /**
             * <p>The timestamp when the event was processed.</p>
             * 
             * <strong>example:</strong>
             * <p>1553524393000</p>
             */
            public Builder fixTime(Long fixTime) {
                this.fixTime = fixTime;
                return this;
            }

            /**
             * <p>The timestamp when the event occurred. A time difference may exist between the time when the event occurred and the time when the event was found.</p>
             * 
             * <strong>example:</strong>
             * <p>1553524393000</p>
             */
            public Builder happenTime(Long happenTime) {
                this.happenTime = happenTime;
                return this;
            }

            /**
             * <p>The ID of the instance that triggered the event.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The timestamp when the system reports the next alert.</p>
             * 
             * <strong>example:</strong>
             * <p>1553524393000</p>
             */
            public Builder nextAlertTime(Long nextAlertTime) {
                this.nextAlertTime = nextAlertTime;
                return this;
            }

            /**
             * <p>The ID of the node that triggered the event.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node that triggered the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Node name</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the event owner.</p>
             * 
             * <strong>example:</strong>
             * <p>952795****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the node that triggered the event belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
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
             * <p>1234 error</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * <p>The status of the event. Valid values: IGNORE, NEW, FIXING, and RECOVER.</p>
             * 
             * <strong>example:</strong>
             * <p>FIXING</p>
             */
            public Builder topicStatus(String topicStatus) {
                this.topicStatus = topicStatus;
                return this;
            }

            /**
             * <p>The type of the event. Valid values: SLOW and ERROR. The value SLOW indicates that the duration of the task is significantly longer than the average duration of the task in previous cycles. The value ERROR indicates that the task fails to run.</p>
             * 
             * <strong>example:</strong>
             * <p>ERROR</p>
             */
            public Builder topicType(String topicType) {
                this.topicType = topicType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
