// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceConsumeTimeRankResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceConsumeTimeRankResponseBody</p>
 */
public class GetInstanceConsumeTimeRankResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceConsumeTimeRank")
    private InstanceConsumeTimeRank instanceConsumeTimeRank;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceConsumeTimeRankResponseBody(Builder builder) {
        this.instanceConsumeTimeRank = builder.instanceConsumeTimeRank;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceConsumeTimeRankResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceConsumeTimeRank
     */
    public InstanceConsumeTimeRank getInstanceConsumeTimeRank() {
        return this.instanceConsumeTimeRank;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceConsumeTimeRank instanceConsumeTimeRank; 
        private String requestId; 

        /**
         * The ranking record of the running durations of instances.
         */
        public Builder instanceConsumeTimeRank(InstanceConsumeTimeRank instanceConsumeTimeRank) {
            this.instanceConsumeTimeRank = instanceConsumeTimeRank;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceConsumeTimeRankResponseBody build() {
            return new GetInstanceConsumeTimeRankResponseBody(this);
        } 

    } 

    public static class ConsumeTimeRank extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("Consumed")
        private Long consumed;

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

        private ConsumeTimeRank(Builder builder) {
            this.bizdate = builder.bizdate;
            this.consumed = builder.consumed;
            this.instanceId = builder.instanceId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.owner = builder.owner;
            this.prgType = builder.prgType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumeTimeRank create() {
            return builder().build();
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return consumed
         */
        public Long getConsumed() {
            return this.consumed;
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

        public static final class Builder {
            private Long bizdate; 
            private Long consumed; 
            private Long instanceId; 
            private Long nodeId; 
            private String nodeName; 
            private String owner; 
            private Integer prgType; 

            /**
             * The data timestamp of the instance.
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * The running duration of the instance. Unit: seconds.
             */
            public Builder consumed(Long consumed) {
                this.consumed = consumed;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the node owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The type of the node.
             */
            public Builder prgType(Integer prgType) {
                this.prgType = prgType;
                return this;
            }

            public ConsumeTimeRank build() {
                return new ConsumeTimeRank(this);
            } 

        } 

    }
    public static class InstanceConsumeTimeRank extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumeTimeRank")
        private java.util.List < ConsumeTimeRank> consumeTimeRank;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private InstanceConsumeTimeRank(Builder builder) {
            this.consumeTimeRank = builder.consumeTimeRank;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceConsumeTimeRank create() {
            return builder().build();
        }

        /**
         * @return consumeTimeRank
         */
        public java.util.List < ConsumeTimeRank> getConsumeTimeRank() {
            return this.consumeTimeRank;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List < ConsumeTimeRank> consumeTimeRank; 
            private Long updateTime; 

            /**
             * The ranking data of the running durations of instances.
             */
            public Builder consumeTimeRank(java.util.List < ConsumeTimeRank> consumeTimeRank) {
                this.consumeTimeRank = consumeTimeRank;
                return this;
            }

            /**
             * The timestamp when the ranking was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public InstanceConsumeTimeRank build() {
                return new InstanceConsumeTimeRank(this);
            } 

        } 

    }
}
