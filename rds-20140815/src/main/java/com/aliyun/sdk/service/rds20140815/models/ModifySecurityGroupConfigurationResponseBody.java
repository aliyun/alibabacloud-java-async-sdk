// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySecurityGroupConfigurationResponseBody</p>
 */
public class ModifySecurityGroupConfigurationResponseBody extends TeaModel {
    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private ModifySecurityGroupConfigurationResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityGroupConfigurationResponseBody create() {
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
         * The ID of the instance.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * An array that consists of ECS security groups.
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

        public ModifySecurityGroupConfigurationResponseBody build() {
            return new ModifySecurityGroupConfigurationResponseBody(this);
        } 

    } 

    public static class EcsSecurityGroupRelation extends TeaModel {
        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        private EcsSecurityGroupRelation(Builder builder) {
            this.networkType = builder.networkType;
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

        public static final class Builder {
            private String networkType; 
            private String regionId; 
            private String securityGroupId; 

            /**
             * The network type of an ECS security group. Valid values:
             * <p>
             * 
             * *   **Classic**
             * *   **VPC**
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The ID of the region.
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

            public EcsSecurityGroupRelation build() {
                return new EcsSecurityGroupRelation(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("EcsSecurityGroupRelation")
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
