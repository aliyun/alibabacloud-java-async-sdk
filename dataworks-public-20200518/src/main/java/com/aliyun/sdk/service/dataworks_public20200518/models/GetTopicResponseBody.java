// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicResponseBody</p>
 */
public class GetTopicResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTopicResponseBody build() {
            return new GetTopicResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AddTime")
        private Long addTime;

        @NameInMap("AlertTime")
        private Long alertTime;

        @NameInMap("Assigner")
        private String assigner;

        @NameInMap("BaselineBuffer")
        private Long baselineBuffer;

        @NameInMap("BaselineId")
        private Long baselineId;

        @NameInMap("BaselineInGroupId")
        private Integer baselineInGroupId;

        @NameInMap("BaselineName")
        private String baselineName;

        @NameInMap("BaselineStatus")
        private String baselineStatus;

        @NameInMap("Buffer")
        private Long buffer;

        @NameInMap("DealTime")
        private Long dealTime;

        @NameInMap("DealUser")
        private String dealUser;

        @NameInMap("FixTime")
        private Long fixTime;

        @NameInMap("HappenTime")
        private Long happenTime;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("NextAlertTime")
        private Long nextAlertTime;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("TopicId")
        private Long topicId;

        @NameInMap("TopicName")
        private String topicName;

        @NameInMap("TopicStatus")
        private String topicStatus;

        @NameInMap("TopicType")
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
             * AddTime.
             */
            public Builder addTime(Long addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * AlertTime.
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * Assigner.
             */
            public Builder assigner(String assigner) {
                this.assigner = assigner;
                return this;
            }

            /**
             * BaselineBuffer.
             */
            public Builder baselineBuffer(Long baselineBuffer) {
                this.baselineBuffer = baselineBuffer;
                return this;
            }

            /**
             * BaselineId.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * BaselineInGroupId.
             */
            public Builder baselineInGroupId(Integer baselineInGroupId) {
                this.baselineInGroupId = baselineInGroupId;
                return this;
            }

            /**
             * BaselineName.
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * BaselineStatus.
             */
            public Builder baselineStatus(String baselineStatus) {
                this.baselineStatus = baselineStatus;
                return this;
            }

            /**
             * Buffer.
             */
            public Builder buffer(Long buffer) {
                this.buffer = buffer;
                return this;
            }

            /**
             * DealTime.
             */
            public Builder dealTime(Long dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * DealUser.
             */
            public Builder dealUser(String dealUser) {
                this.dealUser = dealUser;
                return this;
            }

            /**
             * FixTime.
             */
            public Builder fixTime(Long fixTime) {
                this.fixTime = fixTime;
                return this;
            }

            /**
             * HappenTime.
             */
            public Builder happenTime(Long happenTime) {
                this.happenTime = happenTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NextAlertTime.
             */
            public Builder nextAlertTime(Long nextAlertTime) {
                this.nextAlertTime = nextAlertTime;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
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
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * TopicStatus.
             */
            public Builder topicStatus(String topicStatus) {
                this.topicStatus = topicStatus;
                return this;
            }

            /**
             * TopicType.
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
