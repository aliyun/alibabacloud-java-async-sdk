// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSecurityGroupConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupConfigurationResponseBody</p>
 */
public class DescribeSecurityGroupConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSecurityGroupConfigurationResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        /**
         * <p>The list of security groups.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>981C0D6A-D9DD-466C-92DA-F29DF755****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSecurityGroupConfigurationResponseBody build() {
            return new DescribeSecurityGroupConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityGroupConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupConfigurationResponseBody</p>
     */
    public static class EcsSecurityGroupRelation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        private EcsSecurityGroupRelation(Builder builder) {
            this.netType = builder.netType;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsSecurityGroupRelation create() {
            return builder().build();
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private String netType; 
            private String regionId; 
            private String securityGroupId; 

            /**
             * <p>The network type of the security group. Valid values:</p>
             * <ul>
             * <li><strong>classic</strong>: the classic network.</li>
             * <li><strong>vpc</strong>: the virtual private cloud (VPC).</li>
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
             * <p>The ID of the region where the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp14p9y07ns3gwq****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public EcsSecurityGroupRelation build() {
                return new EcsSecurityGroupRelation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityGroupConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupConfigurationResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsSecurityGroupRelation")
        private java.util.List < EcsSecurityGroupRelation> ecsSecurityGroupRelation;

        private Items(Builder builder) {
            this.ecsSecurityGroupRelation = builder.ecsSecurityGroupRelation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return ecsSecurityGroupRelation
         */
        public java.util.List < EcsSecurityGroupRelation> getEcsSecurityGroupRelation() {
            return this.ecsSecurityGroupRelation;
        }

        public static final class Builder {
            private java.util.List < EcsSecurityGroupRelation> ecsSecurityGroupRelation; 

            /**
             * EcsSecurityGroupRelation.
             */
            public Builder ecsSecurityGroupRelation(java.util.List < EcsSecurityGroupRelation> ecsSecurityGroupRelation) {
                this.ecsSecurityGroupRelation = ecsSecurityGroupRelation;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
