// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSecurityGroupConfigurationResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
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
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
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
        private String DBInstanceName; 
        private Items items; 
        private String requestId; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The information about the ECS security group.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>87BDAE8C-ACB0-4A26-BBCC-7D1DD31D630D</p>
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
        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
        private String securityGroupName;

        private EcsSecurityGroupRelation(Builder builder) {
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsSecurityGroupRelation create() {
            return builder().build();
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public static final class Builder {
            private String networkType; 
            private String regionId; 
            private String securityGroupId; 
            private String securityGroupName; 

            /**
             * <p>The network type of the ECS security group. Valid values:</p>
             * <ul>
             * <li><strong>Classic</strong></li>
             * <li><strong>VPC</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the ECS security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxxxxxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The security group name.</p>
             * 
             * <strong>example:</strong>
             * <p>security-group-emraccess</p>
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
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
