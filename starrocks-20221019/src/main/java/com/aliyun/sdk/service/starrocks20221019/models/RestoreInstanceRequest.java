// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link RestoreInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestoreInstanceRequest</p>
 */
public class RestoreInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdminPassword")
    private String adminPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BackupTaskId")
    private String backupTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitches")
    private java.util.List<VSwitches> vSwitches;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private RestoreInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.adminPassword = builder.adminPassword;
        this.autoRenew = builder.autoRenew;
        this.backupTaskId = builder.backupTaskId;
        this.duration = builder.duration;
        this.instanceName = builder.instanceName;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.vSwitches = builder.vSwitches;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return adminPassword
     */
    public String getAdminPassword() {
        return this.adminPassword;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return backupTaskId
     */
    public String getBackupTaskId() {
        return this.backupTaskId;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vSwitches
     */
    public java.util.List<VSwitches> getVSwitches() {
        return this.vSwitches;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<RestoreInstanceRequest, Builder> {
        private String regionId; 
        private String adminPassword; 
        private Boolean autoRenew; 
        private String backupTaskId; 
        private Integer duration; 
        private String instanceName; 
        private String payType; 
        private String pricingCycle; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private java.util.List<VSwitches> vSwitches; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(RestoreInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.adminPassword = request.adminPassword;
            this.autoRenew = request.autoRenew;
            this.backupTaskId = request.backupTaskId;
            this.duration = request.duration;
            this.instanceName = request.instanceName;
            this.payType = request.payType;
            this.pricingCycle = request.pricingCycle;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.vSwitches = request.vSwitches;
            this.vpcId = request.vpcId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AdminPassword.
         */
        public Builder adminPassword(String adminPassword) {
            this.putBodyParameter("AdminPassword", adminPassword);
            this.adminPassword = adminPassword;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * BackupTaskId.
         */
        public Builder backupTaskId(String backupTaskId) {
            this.putBodyParameter("BackupTaskId", backupTaskId);
            this.backupTaskId = backupTaskId;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putBodyParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * VSwitches.
         */
        public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
            this.putBodyParameter("VSwitches", vSwitches);
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * <p>vpc ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1fll2mci6d7pw8m****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public RestoreInstanceRequest build() {
            return new RestoreInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link RestoreInstanceRequest} extends {@link TeaModel}
     *
     * <p>RestoreInstanceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link RestoreInstanceRequest} extends {@link TeaModel}
     *
     * <p>RestoreInstanceRequest</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VswId")
        private String vswId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VSwitches(Builder builder) {
            this.vswId = builder.vswId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vswId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.vswId = model.vswId;
                this.zoneId = model.zoneId;
            } 

            /**
             * VswId.
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
