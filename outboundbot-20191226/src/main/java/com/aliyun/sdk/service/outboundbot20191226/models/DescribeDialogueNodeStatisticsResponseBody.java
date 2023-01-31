// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDialogueNodeStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDialogueNodeStatisticsResponseBody</p>
 */
public class DescribeDialogueNodeStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Message")
    private String message;

    @NameInMap("NoAnswerDialogueNodes")
    private java.util.List < NoAnswerDialogueNodes> noAnswerDialogueNodes;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCompleted")
    private Integer totalCompleted;

    private DescribeDialogueNodeStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.groupId = builder.groupId;
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
    public java.util.List < NoAnswerDialogueNodes> getNoAnswerDialogueNodes() {
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
        private Integer httpStatusCode; 
        private String instanceId; 
        private String message; 
        private java.util.List < NoAnswerDialogueNodes> noAnswerDialogueNodes; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCompleted; 

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
        public Builder noAnswerDialogueNodes(java.util.List < NoAnswerDialogueNodes> noAnswerDialogueNodes) {
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

    public static class NoAnswerDialogueNodes extends TeaModel {
        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("HangUpNum")
        private Integer hangUpNum;

        @NameInMap("HitNum")
        private Integer hitNum;

        @NameInMap("Id")
        private String id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NoAnswerNum")
        private Integer noAnswerNum;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeName")
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
             * id
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
