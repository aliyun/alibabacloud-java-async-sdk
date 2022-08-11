// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceConsumeTimeRankResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceConsumeTimeRankResponseBody</p>
 */
public class GetInstanceConsumeTimeRankResponseBody extends TeaModel {
    @NameInMap("InstanceConsumeTimeRank")
    private InstanceConsumeTimeRank instanceConsumeTimeRank;

    @NameInMap("RequestId")
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
         * InstanceConsumeTimeRank.
         */
        public Builder instanceConsumeTimeRank(InstanceConsumeTimeRank instanceConsumeTimeRank) {
            this.instanceConsumeTimeRank = instanceConsumeTimeRank;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Bizdate")
        private Long bizdate;

        @NameInMap("Consumed")
        private Long consumed;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("PrgType")
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
             * Bizdate.
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * Consumed.
             */
            public Builder consumed(Long consumed) {
                this.consumed = consumed;
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
             * PrgType.
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
        @NameInMap("ConsumeTimeRank")
        private java.util.List < ConsumeTimeRank> consumeTimeRank;

        @NameInMap("UpdateTime")
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
             * ConsumeTimeRank.
             */
            public Builder consumeTimeRank(java.util.List < ConsumeTimeRank> consumeTimeRank) {
                this.consumeTimeRank = consumeTimeRank;
                return this;
            }

            /**
             * UpdateTime.
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
