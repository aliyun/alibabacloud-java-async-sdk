// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudAssetDetailResponseBody</p>
 */
public class GetCloudAssetDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The number of instances in the list of cloud assets returned.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * An array that consists of the details of the cloud assets.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetSubTypeName")
        private String assetSubTypeName;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("AssetTypeName")
        private String assetTypeName;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("DetailLink")
        private String detailLink;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskStatus")
        private String riskStatus;

        @com.aliyun.core.annotation.NameInMap("SecurityInfo")
        private String securityInfo;

        @com.aliyun.core.annotation.NameInMap("Vendor")
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
             * Indicates whether alerts are generated for the current cloud asset. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * The subtype of the cloud asset.
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * The name of the cloud asset subtype.
             */
            public Builder assetSubTypeName(String assetSubTypeName) {
                this.assetSubTypeName = assetSubTypeName;
                return this;
            }

            /**
             * The type of the cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: ECS.
             * *   **1**: SLB.
             * *   **3**: ApsaraDB RDS.
             * *   **4**: ApsaraDB for MongoDB.
             * *   **5**: ApsaraDB for Redis.
             * *   **6**: Container Registry.
             * *   **8**: Container Service for Kubernetes.
             * *   **9**: VPC.
             * *   **11**: ActionTrail.
             * *   **12**: CDN.
             * *   **13**: Certificate Management Service.
             * *   **14**: Apsara Devops.
             * *   **15**: RAM.
             * *   **16**: Anti-DDoS.
             * *   **17**: WAF.
             * *   **18**: OSS.
             * *   **19**: PolarDB.
             * *   **20**: ApsaraDB RDS for PostgreSQL.
             * *   **21**: MSE.
             * *   **22**: NAS.
             * *   **23**: DSC.
             * *   **24**: EIP.
             * *   **25**: IDaaS-EIAM.
             * *   **26**: PolarDB-X.
             * *   **27**: Elasticsearch.
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * The name of the cloud asset type.
             */
            public Builder assetTypeName(String assetTypeName) {
                this.assetTypeName = assetTypeName;
                return this;
            }

            /**
             * The time when the instance was created. The value is a timestamp.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The detailed address of the cloud asset.
             */
            public Builder detailLink(String detailLink) {
                this.detailLink = detailLink;
                return this;
            }

            /**
             * The instance ID of the cloud asset.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name of the cloud asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the instance.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The region in which the cloud asset resides.
             * <p>
             * 
             * > For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether risks are detected on the current cloud asset. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * The security information about the cloud asset.
             */
            public Builder securityInfo(String securityInfo) {
                this.securityInfo = securityInfo;
                return this;
            }

            /**
             * The service provider of the cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: Alibaba Cloud.
             * *   **1**: service provider that is unrecognized.
             * *   **2**: data center.
             * *   **3**, **4**, **5**, and **7**: third-party service provider.
             * *   **8**: simple application server.
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
