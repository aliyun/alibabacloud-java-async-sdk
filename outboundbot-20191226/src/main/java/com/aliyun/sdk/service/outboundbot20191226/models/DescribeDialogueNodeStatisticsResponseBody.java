// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeDialogueNodeStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDialogueNodeStatisticsResponseBody</p>
 */
public class DescribeDialogueNodeStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("HangUpDialogueNodes")
    private java.util.List<HangUpDialogueNodes> hangUpDialogueNodes;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NoAnswerDialogueNodes")
    private java.util.List<NoAnswerDialogueNodes> noAnswerDialogueNodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCompleted")
    private Integer totalCompleted;

    private DescribeDialogueNodeStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.groupId = builder.groupId;
        this.hangUpDialogueNodes = builder.hangUpDialogueNodes;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.noAnswerDialogueNodes = builder.noAnswerDialogueNodes;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCompleted = builder.totalCompleted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDialogueNodeStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return hangUpDialogueNodes
     */
    public java.util.List<HangUpDialogueNodes> getHangUpDialogueNodes() {
        return this.hangUpDialogueNodes;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return noAnswerDialogueNodes
     */
    public java.util.List<NoAnswerDialogueNodes> getNoAnswerDialogueNodes() {
        return this.noAnswerDialogueNodes;
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
     * @return totalCompleted
     */
    public Integer getTotalCompleted() {
        return this.totalCompleted;
    }

    public static final class Builder {
        private String code; 
        private String groupId; 
        private java.util.List<HangUpDialogueNodes> hangUpDialogueNodes; 
        private Integer httpStatusCode; 
        private String instanceId; 
        private String message; 
        private java.util.List<NoAnswerDialogueNodes> noAnswerDialogueNodes; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCompleted; 

        private Builder() {
        } 

        private Builder(DescribeDialogueNodeStatisticsResponseBody model) {
            this.code = model.code;
            this.groupId = model.groupId;
            this.hangUpDialogueNodes = model.hangUpDialogueNodes;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
            this.message = model.message;
            this.noAnswerDialogueNodes = model.noAnswerDialogueNodes;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCompleted = model.totalCompleted;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * HangUpDialogueNodes.
         */
        public Builder hangUpDialogueNodes(java.util.List<HangUpDialogueNodes> hangUpDialogueNodes) {
            this.hangUpDialogueNodes = hangUpDialogueNodes;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NoAnswerDialogueNodes.
         */
        public Builder noAnswerDialogueNodes(java.util.List<NoAnswerDialogueNodes> noAnswerDialogueNodes) {
            this.noAnswerDialogueNodes = noAnswerDialogueNodes;
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

        /**
         * TotalCompleted.
         */
        public Builder totalCompleted(Integer totalCompleted) {
            this.totalCompleted = totalCompleted;
            return this;
        }

        public DescribeDialogueNodeStatisticsResponseBody build() {
            return new DescribeDialogueNodeStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDialogueNodeStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDialogueNodeStatisticsResponseBody</p>
     */
    public static class HangUpDialogueNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HangUpNum")
        private Integer hangUpNum;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("RateDisplay")
        private String rateDisplay;

        private HangUpDialogueNodes(Builder builder) {
            this.hangUpNum = builder.hangUpNum;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.rateDisplay = builder.rateDisplay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HangUpDialogueNodes create() {
            return builder().build();
        }

        /**
         * @return hangUpNum
         */
        public Integer getHangUpNum() {
            return this.hangUpNum;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return rateDisplay
         */
        public String getRateDisplay() {
            return this.rateDisplay;
        }

        public static final class Builder {
            private Integer hangUpNum; 
            private String nodeId; 
            private String nodeName; 
            private String rateDisplay; 

            private Builder() {
            } 

            private Builder(HangUpDialogueNodes model) {
                this.hangUpNum = model.hangUpNum;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.rateDisplay = model.rateDisplay;
            } 

            /**
             * HangUpNum.
             */
            public Builder hangUpNum(Integer hangUpNum) {
                this.hangUpNum = hangUpNum;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
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
             * RateDisplay.
             */
            public Builder rateDisplay(String rateDisplay) {
                this.rateDisplay = rateDisplay;
                return this;
            }

            public HangUpDialogueNodes build() {
                return new HangUpDialogueNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDialogueNodeStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDialogueNodeStatisticsResponseBody</p>
     */
    public static class NoAnswerDialogueNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("HangUpNum")
        private Integer hangUpNum;

        @com.aliyun.core.annotation.NameInMap("HitNum")
        private Integer hitNum;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NoAnswerNum")
        private Integer noAnswerNum;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private NoAnswerDialogueNodes(Builder builder) {
            this.groupId = builder.groupId;
            this.hangUpNum = builder.hangUpNum;
            this.hitNum = builder.hitNum;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.noAnswerNum = builder.noAnswerNum;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoAnswerDialogueNodes create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return hangUpNum
         */
        public Integer getHangUpNum() {
            return this.hangUpNum;
        }

        /**
         * @return hitNum
         */
        public Integer getHitNum() {
            return this.hitNum;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return noAnswerNum
         */
        public Integer getNoAnswerNum() {
            return this.noAnswerNum;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String groupId; 
            private Integer hangUpNum; 
            private Integer hitNum; 
            private String id; 
            private String instanceId; 
            private Integer noAnswerNum; 
            private String nodeId; 
            private String nodeName; 

            private Builder() {
            } 

            private Builder(NoAnswerDialogueNodes model) {
                this.groupId = model.groupId;
                this.hangUpNum = model.hangUpNum;
                this.hitNum = model.hitNum;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.noAnswerNum = model.noAnswerNum;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
            } 

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * HangUpNum.
             */
            public Builder hangUpNum(Integer hangUpNum) {
                this.hangUpNum = hangUpNum;
                return this;
            }

            /**
             * HitNum.
             */
            public Builder hitNum(Integer hitNum) {
                this.hitNum = hitNum;
                return this;
            }

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NoAnswerNum.
             */
            public Builder noAnswerNum(Integer noAnswerNum) {
                this.noAnswerNum = noAnswerNum;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
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

            public NoAnswerDialogueNodes build() {
                return new NoAnswerDialogueNodes(this);
            } 

        } 

    }
}
