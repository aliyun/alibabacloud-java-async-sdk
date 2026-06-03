// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeInstancesResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Instances.
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EcsStatus")
        private String ecsStatus;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("ImageVersionName")
        private String imageVersionName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InternetEndpoint")
        private String internetEndpoint;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetEndpoint")
        private String intranetEndpoint;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Legacy")
        private Boolean legacy;

        @com.aliyun.core.annotation.NameInMap("LicenseCode")
        private String licenseCode;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Operatable")
        private Boolean operatable;

        @com.aliyun.core.annotation.NameInMap("PlanUpgradeStatus")
        private Integer planUpgradeStatus;

        @com.aliyun.core.annotation.NameInMap("PlanUpgradeable")
        private Boolean planUpgradeable;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Renewable")
        private Boolean renewable;

        @com.aliyun.core.annotation.NameInMap("SeriesCode")
        private String seriesCode;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
        private Integer upgradeStatus;

        @com.aliyun.core.annotation.NameInMap("Upgradeable")
        private Boolean upgradeable;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private Instances(Builder builder) {
            this.description = builder.description;
            this.ecsStatus = builder.ecsStatus;
            this.expireTime = builder.expireTime;
            this.imageVersionName = builder.imageVersionName;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.internetEndpoint = builder.internetEndpoint;
            this.internetIp = builder.internetIp;
            this.intranetEndpoint = builder.intranetEndpoint;
            this.intranetIp = builder.intranetIp;
            this.legacy = builder.legacy;
            this.licenseCode = builder.licenseCode;
            this.networkType = builder.networkType;
            this.operatable = builder.operatable;
            this.planUpgradeStatus = builder.planUpgradeStatus;
            this.planUpgradeable = builder.planUpgradeable;
            this.regionId = builder.regionId;
            this.renewable = builder.renewable;
            this.seriesCode = builder.seriesCode;
            this.startTime = builder.startTime;
            this.upgradeStatus = builder.upgradeStatus;
            this.upgradeable = builder.upgradeable;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsStatus
         */
        public String getEcsStatus() {
            return this.ecsStatus;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return imageVersionName
         */
        public String getImageVersionName() {
            return this.imageVersionName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return internetEndpoint
         */
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetEndpoint
         */
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return legacy
         */
        public Boolean getLegacy() {
            return this.legacy;
        }

        /**
         * @return licenseCode
         */
        public String getLicenseCode() {
            return this.licenseCode;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return operatable
         */
        public Boolean getOperatable() {
            return this.operatable;
        }

        /**
         * @return planUpgradeStatus
         */
        public Integer getPlanUpgradeStatus() {
            return this.planUpgradeStatus;
        }

        /**
         * @return planUpgradeable
         */
        public Boolean getPlanUpgradeable() {
            return this.planUpgradeable;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return renewable
         */
        public Boolean getRenewable() {
            return this.renewable;
        }

        /**
         * @return seriesCode
         */
        public String getSeriesCode() {
            return this.seriesCode;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return upgradeStatus
         */
        public Integer getUpgradeStatus() {
            return this.upgradeStatus;
        }

        /**
         * @return upgradeable
         */
        public Boolean getUpgradeable() {
            return this.upgradeable;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String description; 
            private String ecsStatus; 
            private Long expireTime; 
            private String imageVersionName; 
            private String instanceId; 
            private String instanceStatus; 
            private String internetEndpoint; 
            private String internetIp; 
            private String intranetEndpoint; 
            private String intranetIp; 
            private Boolean legacy; 
            private String licenseCode; 
            private String networkType; 
            private Boolean operatable; 
            private Integer planUpgradeStatus; 
            private Boolean planUpgradeable; 
            private String regionId; 
            private Boolean renewable; 
            private String seriesCode; 
            private Long startTime; 
            private Integer upgradeStatus; 
            private Boolean upgradeable; 
            private String vpcId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.description = model.description;
                this.ecsStatus = model.ecsStatus;
                this.expireTime = model.expireTime;
                this.imageVersionName = model.imageVersionName;
                this.instanceId = model.instanceId;
                this.instanceStatus = model.instanceStatus;
                this.internetEndpoint = model.internetEndpoint;
                this.internetIp = model.internetIp;
                this.intranetEndpoint = model.intranetEndpoint;
                this.intranetIp = model.intranetIp;
                this.legacy = model.legacy;
                this.licenseCode = model.licenseCode;
                this.networkType = model.networkType;
                this.operatable = model.operatable;
                this.planUpgradeStatus = model.planUpgradeStatus;
                this.planUpgradeable = model.planUpgradeable;
                this.regionId = model.regionId;
                this.renewable = model.renewable;
                this.seriesCode = model.seriesCode;
                this.startTime = model.startTime;
                this.upgradeStatus = model.upgradeStatus;
                this.upgradeable = model.upgradeable;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EcsStatus.
             */
            public Builder ecsStatus(String ecsStatus) {
                this.ecsStatus = ecsStatus;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * ImageVersionName.
             */
            public Builder imageVersionName(String imageVersionName) {
                this.imageVersionName = imageVersionName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * InternetEndpoint.
             */
            public Builder internetEndpoint(String internetEndpoint) {
                this.internetEndpoint = internetEndpoint;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetEndpoint.
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Legacy.
             */
            public Builder legacy(Boolean legacy) {
                this.legacy = legacy;
                return this;
            }

            /**
             * LicenseCode.
             */
            public Builder licenseCode(String licenseCode) {
                this.licenseCode = licenseCode;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Operatable.
             */
            public Builder operatable(Boolean operatable) {
                this.operatable = operatable;
                return this;
            }

            /**
             * PlanUpgradeStatus.
             */
            public Builder planUpgradeStatus(Integer planUpgradeStatus) {
                this.planUpgradeStatus = planUpgradeStatus;
                return this;
            }

            /**
             * PlanUpgradeable.
             */
            public Builder planUpgradeable(Boolean planUpgradeable) {
                this.planUpgradeable = planUpgradeable;
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
             * Renewable.
             */
            public Builder renewable(Boolean renewable) {
                this.renewable = renewable;
                return this;
            }

            /**
             * SeriesCode.
             */
            public Builder seriesCode(String seriesCode) {
                this.seriesCode = seriesCode;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UpgradeStatus.
             */
            public Builder upgradeStatus(Integer upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            /**
             * Upgradeable.
             */
            public Builder upgradeable(Boolean upgradeable) {
                this.upgradeable = upgradeable;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
