// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Details about the ECS security groups.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSecurityGroupConfigurationResponseBody build() {
            return new DescribeSecurityGroupConfigurationResponseBody(this);
        } 

    } 

    public static class RdsEcsSecurityGroupRel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        private RdsEcsSecurityGroupRel(Builder builder) {
            this.netType = builder.netType;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsEcsSecurityGroupRel create() {
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
             * The network type of the ECS security group. Valid values:
             * <p>
             * 
             * *   **vpc**
             * *   **classic**
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * The region ID of the ECS security group.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the ECS security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public RdsEcsSecurityGroupRel build() {
                return new RdsEcsSecurityGroupRel(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RdsEcsSecurityGroupRel")
        private java.util.List < RdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel;

        private Items(Builder builder) {
            this.rdsEcsSecurityGroupRel = builder.rdsEcsSecurityGroupRel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return rdsEcsSecurityGroupRel
         */
        public java.util.List < RdsEcsSecurityGroupRel> getRdsEcsSecurityGroupRel() {
            return this.rdsEcsSecurityGroupRel;
        }

        public static final class Builder {
            private java.util.List < RdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel; 

            /**
             * RdsEcsSecurityGroupRel.
             */
            public Builder rdsEcsSecurityGroupRel(java.util.List < RdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel) {
                this.rdsEcsSecurityGroupRel = rdsEcsSecurityGroupRel;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
