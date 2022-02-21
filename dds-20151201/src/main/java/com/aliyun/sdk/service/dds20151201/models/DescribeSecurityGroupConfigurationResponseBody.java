// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityGroupConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupConfigurationResponseBody</p>
 */
public class DescribeSecurityGroupConfigurationResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("NetType")
        private String netType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecurityGroupId")
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
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityGroupId.
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
        @NameInMap("RdsEcsSecurityGroupRel")
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
