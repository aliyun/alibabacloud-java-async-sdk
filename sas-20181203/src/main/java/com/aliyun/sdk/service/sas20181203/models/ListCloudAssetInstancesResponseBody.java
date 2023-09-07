// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudAssetInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAssetInstancesResponseBody</p>
 */
public class ListCloudAssetInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListCloudAssetInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAssetInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the cloud assets.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCloudAssetInstancesResponseBody build() {
            return new ListCloudAssetInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("AssetSubType")
        private String assetSubType;

        @NameInMap("AssetSubTypeName")
        private String assetSubTypeName;

        @NameInMap("AssetType")
        private Integer assetType;

        @NameInMap("AssetTypeName")
        private String assetTypeName;

        @NameInMap("CreatedTime")
        private Long createdTime;

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
        public String getAssetSubType() {
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
            private String assetSubType; 
            private String assetSubTypeName; 
            private Integer assetType; 
            private String assetTypeName; 
            private Long createdTime; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String regionId; 
            private String riskStatus; 
            private String securityInfo; 
            private Integer vendor; 

            /**
             * Indicates whether alerts are generated for the cloud asset. Valid values:
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
             * The subtype of the cloud service. The subtype of the cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: ECS
             * 
             *     *   **0**: instance
             *     *   **1**: disk (storage)
             *     *   **2**: security group
             * 
             * *   **1**: SLB
             * 
             *     *   **0**: SLB
             *     *   **1**: Application Load Balancer (ALB)
             * 
             * *   **3**: ApsaraDB RDS
             * 
             *     *   **0**: instance
             * 
             * *   **4**: ApsaraDB for MongoDB
             * 
             *     *   **0**: instance
             * 
             * *   **5**: ApsaraDB for Redis
             * 
             *     *   **0**: instance
             * 
             * *   **6**: Container Registry
             * 
             *     *   **1**: Enterprise Edition
             *     *   **2**: Personal Edition
             * 
             * *   **8**: ACK
             * 
             *     *   **0**: cluster
             * 
             * *   **9**: VPC
             * 
             *     *   **0**: NAT gateway
             *     *   **1**: EIP
             *     *   **2**: VPN
             *     *   **3**: FLOW_LOG
             * 
             * *   **11**: ActionTrail
             * 
             *     *   **0**: trail
             * 
             * *   **12**: Alibaba Cloud CDN
             * 
             *     *   **0**: instance
             * 
             * *   **13**: Certificate Management Service (formerly SSL Certificates Service)
             * 
             *     *   **0**: certificate
             * 
             * *   **14**: Apsara Devops
             * 
             *     *   **0**: organization
             * 
             * *   **16**: Anti-DDoS
             * 
             *     *   **0**: instance
             * 
             * *   **17**: WAF
             * 
             *     *   **0**: domain name
             * 
             * *   **18**: OSS
             * 
             *     *   **0**: bucket
             * 
             * *   **19**: PolarDB
             * 
             *     *   **0**: cluster
             * 
             * *   **20**: ApsaraDB RDS for PostgreSQL
             * 
             *     *   **0**: instance
             * 
             * *   **21**: MSE
             * 
             *     *   **0**: cluster
             * 
             * *   **22**: NAS
             * 
             *     *   **0**: file system
             * 
             * *   **23**: DSC
             * 
             *     *   **0**: instance
             * 
             * *   **24**: EIP
             * 
             *     *   **0**: Anycast EIP
             * 
             * *   **25**: IDaaS EIAM
             * 
             *     *   **0**: instance
             * 
             * *   **26**: PolarDB-X
             * 
             *     *   **0**: instance
             * 
             * *   **27**: Elasticsearch
             * 
             *     *   **0**: instance
             */
            public Builder assetSubType(String assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * The subtype name of the cloud asset.
             */
            public Builder assetSubTypeName(String assetSubTypeName) {
                this.assetSubTypeName = assetSubTypeName;
                return this;
            }

            /**
             * The type of the cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: Elastic Compute Service (ECS)
             * *   **1**: Server Load Balancer (SLB)
             * *   **3**: ApsaraDB RDS
             * *   **4**: ApsaraDB for MongoDB
             * *   **5**: ApsaraDB for Redis
             * *   **6**: Container Registry
             * *   **8**: Container Service for Kubernetes (ACK)
             * *   **9**: Virtual Private Cloud (VPC)
             * *   **11**: ActionTrail
             * *   **12**: Alibaba Cloud CDN
             * *   **13**: Certificate Management Service (formerly SSL Certificates Service)
             * *   **14**: Apsara Devops
             * *   **16**: Anti-DDoS
             * *   **17**: Web Application Firewall (WAF)
             * *   **18**: Object Storage Service (OSS)
             * *   **19**: PolarDB
             * *   **20**: ApsaraDB RDS for PostgreSQL
             * *   **21**: Microservices Engine (MSE)
             * *   **22**: Apsara File Storage NAS (NAS)
             * *   **23**: Data Security Center (DSC)
             * *   **24**: Elastic IP Address (EIP)
             * *   **25**: Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM)
             * *   **26**: PolarDB-X
             * *   **27**: Elasticsearch
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * The type name of the cloud asset.
             */
            public Builder assetTypeName(String assetTypeName) {
                this.assetTypeName = assetTypeName;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
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
             * The public IP address of the cloud asset.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The ID of the region to which the cloud asset belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether risks are detected on the cloud asset. Valid values:
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
             * The service provider (SP) of the cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: a cloud asset provided by Alibaba Cloud
             * *   **1**: a third-party cloud asset
             * *   **2**: a cloud asset in a data center
             * *   **3**, **4**, **5**, and **7**: other cloud asset
             * *   **8**: a lightweight cloud asset
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
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of cloud assets.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
