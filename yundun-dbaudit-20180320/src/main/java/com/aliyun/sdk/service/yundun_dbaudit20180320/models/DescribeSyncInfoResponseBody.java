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
 * {@link DescribeSyncInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncInfoResponseBody</p>
 */
public class DescribeSyncInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceInfo")
    private InstanceInfo instanceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSyncInfoResponseBody(Builder builder) {
        this.instanceInfo = builder.instanceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceInfo
     */
    public InstanceInfo getInstanceInfo() {
        return this.instanceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceInfo instanceInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSyncInfoResponseBody model) {
            this.instanceInfo = model.instanceInfo;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceInfo.
         */
        public Builder instanceInfo(InstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSyncInfoResponseBody build() {
            return new DescribeSyncInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSyncInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncInfoResponseBody</p>
     */
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private Integer accessType;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("CustomName")
        private String customName;

        @com.aliyun.core.annotation.NameInMap("EcsEip")
        private String ecsEip;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("EcsInternetIp")
        private String ecsInternetIp;

        @com.aliyun.core.annotation.NameInMap("EcsIntranetIp")
        private String ecsIntranetIp;

        @com.aliyun.core.annotation.NameInMap("EcsNetworkType")
        private String ecsNetworkType;

        @com.aliyun.core.annotation.NameInMap("EcsStatus")
        private String ecsStatus;

        @com.aliyun.core.annotation.NameInMap("EcsUuid")
        private String ecsUuid;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("ImageVersionName")
        private String imageVersionName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PlanCode")
        private String planCode;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanUpgradeStatus")
        private Integer planUpgradeStatus;

        @com.aliyun.core.annotation.NameInMap("PlanUpgradeable")
        private String planUpgradeable;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("PublicAccessControl")
        private Integer publicAccessControl;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("Renewable")
        private Boolean renewable;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
        private Integer upgradeStatus;

        @com.aliyun.core.annotation.NameInMap("VendorCode")
        private String vendorCode;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneNo")
        private String zoneNo;

        private InstanceInfo(Builder builder) {
            this.accessType = builder.accessType;
            this.aliuid = builder.aliuid;
            this.customName = builder.customName;
            this.ecsEip = builder.ecsEip;
            this.ecsInstanceId = builder.ecsInstanceId;
            this.ecsInternetIp = builder.ecsInternetIp;
            this.ecsIntranetIp = builder.ecsIntranetIp;
            this.ecsNetworkType = builder.ecsNetworkType;
            this.ecsStatus = builder.ecsStatus;
            this.ecsUuid = builder.ecsUuid;
            this.expireTime = builder.expireTime;
            this.imageVersionName = builder.imageVersionName;
            this.instanceId = builder.instanceId;
            this.planCode = builder.planCode;
            this.planName = builder.planName;
            this.planUpgradeStatus = builder.planUpgradeStatus;
            this.planUpgradeable = builder.planUpgradeable;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.publicAccessControl = builder.publicAccessControl;
            this.regionName = builder.regionName;
            this.regionNo = builder.regionNo;
            this.renewable = builder.renewable;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.upgradeStatus = builder.upgradeStatus;
            this.vendorCode = builder.vendorCode;
            this.vswitchId = builder.vswitchId;
            this.zoneNo = builder.zoneNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public Integer getAccessType() {
            return this.accessType;
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return customName
         */
        public String getCustomName() {
            return this.customName;
        }

        /**
         * @return ecsEip
         */
        public String getEcsEip() {
            return this.ecsEip;
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return ecsInternetIp
         */
        public String getEcsInternetIp() {
            return this.ecsInternetIp;
        }

        /**
         * @return ecsIntranetIp
         */
        public String getEcsIntranetIp() {
            return this.ecsIntranetIp;
        }

        /**
         * @return ecsNetworkType
         */
        public String getEcsNetworkType() {
            return this.ecsNetworkType;
        }

        /**
         * @return ecsStatus
         */
        public String getEcsStatus() {
            return this.ecsStatus;
        }

        /**
         * @return ecsUuid
         */
        public String getEcsUuid() {
            return this.ecsUuid;
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
         * @return planCode
         */
        public String getPlanCode() {
            return this.planCode;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
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
        public String getPlanUpgradeable() {
            return this.planUpgradeable;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return publicAccessControl
         */
        public Integer getPublicAccessControl() {
            return this.publicAccessControl;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return renewable
         */
        public Boolean getRenewable() {
            return this.renewable;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return upgradeStatus
         */
        public Integer getUpgradeStatus() {
            return this.upgradeStatus;
        }

        /**
         * @return vendorCode
         */
        public String getVendorCode() {
            return this.vendorCode;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneNo
         */
        public String getZoneNo() {
            return this.zoneNo;
        }

        public static final class Builder {
            private Integer accessType; 
            private Long aliuid; 
            private String customName; 
            private String ecsEip; 
            private String ecsInstanceId; 
            private String ecsInternetIp; 
            private String ecsIntranetIp; 
            private String ecsNetworkType; 
            private String ecsStatus; 
            private String ecsUuid; 
            private Long expireTime; 
            private String imageVersionName; 
            private String instanceId; 
            private String planCode; 
            private String planName; 
            private Integer planUpgradeStatus; 
            private String planUpgradeable; 
            private String productCode; 
            private String productName; 
            private Integer publicAccessControl; 
            private String regionName; 
            private String regionNo; 
            private Boolean renewable; 
            private Long startTime; 
            private Integer status; 
            private Integer upgradeStatus; 
            private String vendorCode; 
            private String vswitchId; 
            private String zoneNo; 

            private Builder() {
            } 

            private Builder(InstanceInfo model) {
                this.accessType = model.accessType;
                this.aliuid = model.aliuid;
                this.customName = model.customName;
                this.ecsEip = model.ecsEip;
                this.ecsInstanceId = model.ecsInstanceId;
                this.ecsInternetIp = model.ecsInternetIp;
                this.ecsIntranetIp = model.ecsIntranetIp;
                this.ecsNetworkType = model.ecsNetworkType;
                this.ecsStatus = model.ecsStatus;
                this.ecsUuid = model.ecsUuid;
                this.expireTime = model.expireTime;
                this.imageVersionName = model.imageVersionName;
                this.instanceId = model.instanceId;
                this.planCode = model.planCode;
                this.planName = model.planName;
                this.planUpgradeStatus = model.planUpgradeStatus;
                this.planUpgradeable = model.planUpgradeable;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.publicAccessControl = model.publicAccessControl;
                this.regionName = model.regionName;
                this.regionNo = model.regionNo;
                this.renewable = model.renewable;
                this.startTime = model.startTime;
                this.status = model.status;
                this.upgradeStatus = model.upgradeStatus;
                this.vendorCode = model.vendorCode;
                this.vswitchId = model.vswitchId;
                this.zoneNo = model.zoneNo;
            } 

            /**
             * AccessType.
             */
            public Builder accessType(Integer accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * Aliuid.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * CustomName.
             */
            public Builder customName(String customName) {
                this.customName = customName;
                return this;
            }

            /**
             * EcsEip.
             */
            public Builder ecsEip(String ecsEip) {
                this.ecsEip = ecsEip;
                return this;
            }

            /**
             * EcsInstanceId.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * EcsInternetIp.
             */
            public Builder ecsInternetIp(String ecsInternetIp) {
                this.ecsInternetIp = ecsInternetIp;
                return this;
            }

            /**
             * EcsIntranetIp.
             */
            public Builder ecsIntranetIp(String ecsIntranetIp) {
                this.ecsIntranetIp = ecsIntranetIp;
                return this;
            }

            /**
             * EcsNetworkType.
             */
            public Builder ecsNetworkType(String ecsNetworkType) {
                this.ecsNetworkType = ecsNetworkType;
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
             * EcsUuid.
             */
            public Builder ecsUuid(String ecsUuid) {
                this.ecsUuid = ecsUuid;
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
             * PlanCode.
             */
            public Builder planCode(String planCode) {
                this.planCode = planCode;
                return this;
            }

            /**
             * PlanName.
             */
            public Builder planName(String planName) {
                this.planName = planName;
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
            public Builder planUpgradeable(String planUpgradeable) {
                this.planUpgradeable = planUpgradeable;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
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
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
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
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
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
             * VendorCode.
             */
            public Builder vendorCode(String vendorCode) {
                this.vendorCode = vendorCode;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * ZoneNo.
             */
            public Builder zoneNo(String zoneNo) {
                this.zoneNo = zoneNo;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
}
