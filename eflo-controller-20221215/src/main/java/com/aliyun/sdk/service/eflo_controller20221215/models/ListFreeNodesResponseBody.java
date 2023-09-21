// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFreeNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFreeNodesResponseBody</p>
 */
public class ListFreeNodesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Nodes")
    private java.util.List < Nodes> nodes;

    @NameInMap("RequestId")
    private String requestId;

    private ListFreeNodesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFreeNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodes
     */
    public java.util.List < Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < Nodes> nodes; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List < Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFreeNodesResponseBody build() {
            return new ListFreeNodesResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("HpnZone")
        private String hpnZone;

        @NameInMap("MachineType")
        private String machineType;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Sn")
        private String sn;

        @NameInMap("ZoneId")
        private String zoneId;

        private Nodes(Builder builder) {
            this.createTime = builder.createTime;
            this.expiredTime = builder.expiredTime;
            this.hpnZone = builder.hpnZone;
            this.machineType = builder.machineType;
            this.nodeId = builder.nodeId;
            this.sn = builder.sn;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return hpnZone
         */
        public String getHpnZone() {
            return this.hpnZone;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String createTime; 
            private String expiredTime; 
            private String hpnZone; 
            private String machineType; 
            private String nodeId; 
            private String sn; 
            private String zoneId; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * HpnZone.
             */
            public Builder hpnZone(String hpnZone) {
                this.hpnZone = hpnZone;
                return this;
            }

            /**
             * MachineType.
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
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
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
