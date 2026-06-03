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
 * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAttributeResponseBody</p>
 */
public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceAttribute")
    private InstanceAttribute instanceAttribute;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceAttributeResponseBody(Builder builder) {
        this.instanceAttribute = builder.instanceAttribute;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceAttribute
     */
    public InstanceAttribute getInstanceAttribute() {
        return this.instanceAttribute;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceAttribute instanceAttribute; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceAttributeResponseBody model) {
            this.instanceAttribute = model.instanceAttribute;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceAttribute.
         */
        public Builder instanceAttribute(InstanceAttribute instanceAttribute) {
            this.instanceAttribute = instanceAttribute;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceAttributeResponseBody build() {
            return new DescribeInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class InstanceAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private Integer accessType;

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

        @com.aliyun.core.annotation.NameInMap("PrivateWhiteList")
        private java.util.List<String> privateWhiteList;

        @com.aliyun.core.annotation.NameInMap("PublicAccessControl")
        private Integer publicAccessControl;

        @com.aliyun.core.annotation.NameInMap("PublicWhiteList")
        private java.util.List<String> publicWhiteList;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Renewable")
        private Boolean renewable;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

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

        private InstanceAttribute(Builder builder) {
            this.accessType = builder.accessType;
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
            this.licenseCode = builder.licenseCode;
            this.networkType = builder.networkType;
            this.operatable = builder.operatable;
            this.planUpgradeStatus = builder.planUpgradeStatus;
            this.planUpgradeable = builder.planUpgradeable;
            this.privateWhiteList = builder.privateWhiteList;
            this.publicAccessControl = builder.publicAccessControl;
            this.publicWhiteList = builder.publicWhiteList;
            this.regionId = builder.regionId;
            this.renewable = builder.renewable;
            this.securityGroupIds = builder.securityGroupIds;
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

        public static InstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public Integer getAccessType() {
            return this.accessType;
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
         * @return privateWhiteList
         */
        public java.util.List<String> getPrivateWhiteList() {
            return this.privateWhiteList;
        }

        /**
         * @return publicAccessControl
         */
        public Integer getPublicAccessControl() {
            return this.publicAccessControl;
        }

        /**
         * @return publicWhiteList
         */
        public java.util.List<String> getPublicWhiteList() {
            return this.publicWhiteList;
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
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
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
            private Integer accessType; 
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
            private String licenseCode; 
            private String networkType; 
            private Boolean operatable; 
            private Integer planUpgradeStatus; 
            private Boolean planUpgradeable; 
            private java.util.List<String> privateWhiteList; 
            private Integer publicAccessControl; 
            private java.util.List<String> publicWhiteList; 
            private String regionId; 
            private Boolean renewable; 
            private java.util.List<String> securityGroupIds; 
            private String seriesCode; 
            private Long startTime; 
            private Integer upgradeStatus; 
            private Boolean upgradeable; 
            private String vpcId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(InstanceAttribute model) {
                this.accessType = model.accessType;
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
                this.licenseCode = model.licenseCode;
                this.networkType = model.networkType;
                this.operatable = model.operatable;
                this.planUpgradeStatus = model.planUpgradeStatus;
                this.planUpgradeable = model.planUpgradeable;
                this.privateWhiteList = model.privateWhiteList;
                this.publicAccessControl = model.publicAccessControl;
                this.publicWhiteList = model.publicWhiteList;
                this.regionId = model.regionId;
                this.renewable = model.renewable;
                this.securityGroupIds = model.securityGroupIds;
                this.seriesCode = model.seriesCode;
                this.startTime = model.startTime;
                this.upgradeStatus = model.upgradeStatus;
                this.upgradeable = model.upgradeable;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * AccessType.
             */
            public Builder accessType(Integer accessType) {
                this.accessType = accessType;
                return this;
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
             * PrivateWhiteList.
             */
            public Builder privateWhiteList(java.util.List<String> privateWhiteList) {
                this.privateWhiteList = privateWhiteList;
                return this;
            }

            /**
             * PublicAccessControl.
             */
            public Builder publicAccessControl(Integer publicAccessControl) {
                this.publicAccessControl = publicAccessControl;
                return this;
            }

            /**
             * PublicWhiteList.
             */
            public Builder publicWhiteList(java.util.List<String> publicWhiteList) {
                this.publicWhiteList = publicWhiteList;
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
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
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

            public InstanceAttribute build() {
                return new InstanceAttribute(this);
            } 

        } 

    }
}
