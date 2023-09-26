// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAssetDetailRequest</p>
 */
public class GetCloudAssetDetailRequest extends Request {
    @Query
    @NameInMap("AssetSubType")
    private Integer assetSubType;

    @Query
    @NameInMap("AssetType")
    private Integer assetType;

    @Query
    @NameInMap("CloudAssetInstances")
    private java.util.List < CloudAssetInstances> cloudAssetInstances;

    @Query
    @NameInMap("Vendor")
    private Integer vendor;

    private GetCloudAssetDetailRequest(Builder builder) {
        super(builder);
        this.assetSubType = builder.assetSubType;
        this.assetType = builder.assetType;
        this.cloudAssetInstances = builder.cloudAssetInstances;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetSubType
     */
    public Integer getAssetSubType() {
        return this.assetSubType;
    }

    /**
     * @return assetType
     */
    public Integer getAssetType() {
        return this.assetType;
    }

    /**
     * @return cloudAssetInstances
     */
    public java.util.List < CloudAssetInstances> getCloudAssetInstances() {
        return this.cloudAssetInstances;
    }

    /**
     * @return vendor
     */
    public Integer getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<GetCloudAssetDetailRequest, Builder> {
        private Integer assetSubType; 
        private Integer assetType; 
        private java.util.List < CloudAssetInstances> cloudAssetInstances; 
        private Integer vendor; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAssetDetailRequest request) {
            super(request);
            this.assetSubType = request.assetSubType;
            this.assetType = request.assetType;
            this.cloudAssetInstances = request.cloudAssetInstances;
            this.vendor = request.vendor;
        } 

        /**
         * The subtype of the cloud service.
         */
        public Builder assetSubType(Integer assetSubType) {
            this.putQueryParameter("AssetSubType", assetSubType);
            this.assetSubType = assetSubType;
            return this;
        }

        /**
         * The type of the cloud asset. Valid values:
         * <p>
         * 
         * *   **0**: Elastic Compute Service (ECS).
         * *   **1**: Server Load Balancer (SLB).
         * *   **3**: ApsaraDB RDS.
         * *   **4**: ApsaraDB for MongoDB.
         * *   **5**: ApsaraDB for Redis.
         * *   **6**: Container Registry.
         * *   **8**: Container Service for Kubernetes.
         * *   **9**: Virtual Private Cloud (VPC).
         * *   **11**: ActionTrail.
         * *   **12**: Alibaba Cloud CDN (CDN).
         * *   **13**: Certificate Management Service.
         * *   **14**: Apsara Devops.
         * *   **15**: Resource Access Management (RAM).
         * *   **16**: Anti-DDoS.
         * *   **17**: Web Application Firewall (WAF).
         * *   **18**: Object Storage Service (OSS).
         * *   **19**: PolarDB.
         * *   **20**: ApsaraDB RDS for PostgreSQL.
         * *   **21**: Microservices Engine (MSE).
         * *   **22**: Apsara File Storage NAS (NAS).
         * *   **23**: Data Security Center (DSC).
         * *   **24**: Elastic IP Address (EIP).
         * *   **25**: Identity as a Service (IDaaS)-Employee Identity and Access Management (EIAM).
         * *   **26**: PolarDB-X.
         * *   **27**: Elasticsearch.
         */
        public Builder assetType(Integer assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * The details of the assets.
         */
        public Builder cloudAssetInstances(java.util.List < CloudAssetInstances> cloudAssetInstances) {
            this.putQueryParameter("CloudAssetInstances", cloudAssetInstances);
            this.cloudAssetInstances = cloudAssetInstances;
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
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public GetCloudAssetDetailRequest build() {
            return new GetCloudAssetDetailRequest(this);
        } 

    } 

    public static class CloudAssetInstances extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        private CloudAssetInstances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetInstances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 

            /**
             * The instance ID of the cloud asset.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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

            public CloudAssetInstances build() {
                return new CloudAssetInstances(this);
            } 

        } 

    }
}
