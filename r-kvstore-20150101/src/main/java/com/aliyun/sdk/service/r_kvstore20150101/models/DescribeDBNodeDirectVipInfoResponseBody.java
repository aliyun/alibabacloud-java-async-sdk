// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeDBNodeDirectVipInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBNodeDirectVipInfoResponseBody</p>
 */
public class DescribeDBNodeDirectVipInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DirectVipInfo")
    private DirectVipInfo directVipInfo;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBNodeDirectVipInfoResponseBody(Builder builder) {
        this.directVipInfo = builder.directVipInfo;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBNodeDirectVipInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directVipInfo
     */
    public DirectVipInfo getDirectVipInfo() {
        return this.directVipInfo;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DirectVipInfo directVipInfo; 
        private String instanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBNodeDirectVipInfoResponseBody model) {
            this.directVipInfo = model.directVipInfo;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The VIP information of shards in the cluster instance.</p>
         */
        public Builder directVipInfo(DirectVipInfo directVipInfo) {
            this.directVipInfo = directVipInfo;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBNodeDirectVipInfoResponseBody build() {
            return new DescribeDBNodeDirectVipInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBNodeDirectVipInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBNodeDirectVipInfoResponseBody</p>
     */
    public static class VipInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Vip")
        private String vip;

        private VipInfo(Builder builder) {
            this.netType = builder.netType;
            this.nodeId = builder.nodeId;
            this.port = builder.port;
            this.vip = builder.vip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VipInfo create() {
            return builder().build();
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return vip
         */
        public String getVip() {
            return this.vip;
        }

        public static final class Builder {
            private String netType; 
            private String nodeId; 
            private String port; 
            private String vip; 

            private Builder() {
            } 

            private Builder(VipInfo model) {
                this.netType = model.netType;
                this.nodeId = model.nodeId;
                this.port = model.port;
                this.vip = model.vip;
            } 

            /**
             * <p>The network type of the security group. Valid values:</p>
             * <ul>
             * <li><strong>vpc</strong>: Virtual Private Cloud (VPC)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The shard ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-8vb3679b04551444-db-2</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The port number. Valid values: <strong>1024</strong> to <strong>65535</strong>. Default value: <strong>6379</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>6379</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The VIP of the shard.</p>
             * 
             * <strong>example:</strong>
             * <p>100.115.61.8</p>
             */
            public Builder vip(String vip) {
                this.vip = vip;
                return this;
            }

            public VipInfo build() {
                return new VipInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBNodeDirectVipInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBNodeDirectVipInfoResponseBody</p>
     */
    public static class DirectVipInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VipInfo")
        private java.util.List<VipInfo> vipInfo;

        private DirectVipInfo(Builder builder) {
            this.vipInfo = builder.vipInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectVipInfo create() {
            return builder().build();
        }

        /**
         * @return vipInfo
         */
        public java.util.List<VipInfo> getVipInfo() {
            return this.vipInfo;
        }

        public static final class Builder {
            private java.util.List<VipInfo> vipInfo; 

            private Builder() {
            } 

            private Builder(DirectVipInfo model) {
                this.vipInfo = model.vipInfo;
            } 

            /**
             * VipInfo.
             */
            public Builder vipInfo(java.util.List<VipInfo> vipInfo) {
                this.vipInfo = vipInfo;
                return this;
            }

            public DirectVipInfo build() {
                return new DirectVipInfo(this);
            } 

        } 

    }
}
