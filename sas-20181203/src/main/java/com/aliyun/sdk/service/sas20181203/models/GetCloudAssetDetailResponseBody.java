// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudAssetDetailResponseBody</p>
 */
public class GetCloudAssetDetailResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    private GetCloudAssetDetailResponseBody(Builder builder) {
        this.count = builder.count;
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < Instances> instances; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
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

        public GetCloudAssetDetailResponseBody build() {
            return new GetCloudAssetDetailResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("AssetSubType")
        private Integer assetSubType;

        @NameInMap("AssetSubTypeName")
        private String assetSubTypeName;

        @NameInMap("AssetType")
        private Integer assetType;

        @NameInMap("AssetTypeName")
        private String assetTypeName;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("DetailLink")
        private String detailLink;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RiskStatus")
        private String riskStatus;

        @NameInMap("SecurityInfo")
        private String securityInfo;

        @NameInMap("Vendor")
        private Integer vendor;

        private Instances(Builder builder) {
            this.alarmStatus = builder.alarmStatus;
            this.assetSubType = builder.assetSubType;
            this.assetSubTypeName = builder.assetSubTypeName;
            this.assetType = builder.assetType;
            this.assetTypeName = builder.assetTypeName;
            this.createdTime = builder.createdTime;
            this.detailLink = builder.detailLink;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.regionId = builder.regionId;
            this.riskStatus = builder.riskStatus;
            this.securityInfo = builder.securityInfo;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return assetSubType
         */
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        /**
         * @return assetSubTypeName
         */
        public String getAssetSubTypeName() {
            return this.assetSubTypeName;
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return assetTypeName
         */
        public String getAssetTypeName() {
            return this.assetTypeName;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return detailLink
         */
        public String getDetailLink() {
            return this.detailLink;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return securityInfo
         */
        public String getSecurityInfo() {
            return this.securityInfo;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String alarmStatus; 
            private Integer assetSubType; 
            private String assetSubTypeName; 
            private Integer assetType; 
            private String assetTypeName; 
            private Long createdTime; 
            private String detailLink; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String regionId; 
            private String riskStatus; 
            private String securityInfo; 
            private Integer vendor; 

            /**
             * AlarmStatus.
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * AssetSubType.
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * AssetSubTypeName.
             */
            public Builder assetSubTypeName(String assetSubTypeName) {
                this.assetSubTypeName = assetSubTypeName;
                return this;
            }

            /**
             * AssetType.
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * AssetTypeName.
             */
            public Builder assetTypeName(String assetTypeName) {
                this.assetTypeName = assetTypeName;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DetailLink.
             */
            public Builder detailLink(String detailLink) {
                this.detailLink = detailLink;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RiskStatus.
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * SecurityInfo.
             */
            public Builder securityInfo(String securityInfo) {
                this.securityInfo = securityInfo;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
