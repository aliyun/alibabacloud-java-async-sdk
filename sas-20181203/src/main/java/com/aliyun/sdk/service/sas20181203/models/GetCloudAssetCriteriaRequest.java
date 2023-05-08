// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetCriteriaRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAssetCriteriaRequest</p>
 */
public class GetCloudAssetCriteriaRequest extends Request {
    @Query
    @NameInMap("CloudAssetTypes")
    private java.util.List < CloudAssetTypes> cloudAssetTypes;

    @Query
    @NameInMap("Value")
    private String value;

    private GetCloudAssetCriteriaRequest(Builder builder) {
        super(builder);
        this.cloudAssetTypes = builder.cloudAssetTypes;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetCriteriaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAssetTypes
     */
    public java.util.List < CloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<GetCloudAssetCriteriaRequest, Builder> {
        private java.util.List < CloudAssetTypes> cloudAssetTypes; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAssetCriteriaRequest request) {
            super(request);
            this.cloudAssetTypes = request.cloudAssetTypes;
            this.value = request.value;
        } 

        /**
         * The name of the filter condition. Valid values:
         * <p>
         * 
         * *   **instanceId**: the ID of the instance
         * *   **instanceName**: the name of an instance
         * *   **internetIp**: the public IP address
         * *   **riskStatus**: the risk status
         * *   **vendorRegionId**: the region ID by service provider
         */
        public Builder cloudAssetTypes(java.util.List < CloudAssetTypes> cloudAssetTypes) {
            this.putQueryParameter("CloudAssetTypes", cloudAssetTypes);
            this.cloudAssetTypes = cloudAssetTypes;
            return this;
        }

        /**
         * The type of the filter condition. Valid values:
         * <p>
         * 
         * *   **input**: The filter condition needs to be specified.
         * *   **select**: The filter condition is an option that can be selected from the drop-down list.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public GetCloudAssetCriteriaRequest build() {
            return new GetCloudAssetCriteriaRequest(this);
        } 

    } 

    public static class CloudAssetTypes extends TeaModel {
        @NameInMap("AssetSubType")
        private Integer assetSubType;

        @NameInMap("AssetType")
        private Integer assetType;

        private CloudAssetTypes(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetTypes create() {
            return builder().build();
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

        public static final class Builder {
            private Integer assetSubType; 
            private Integer assetType; 

            /**
             * The type of the asset by source. Valid values:
             * <p>
             * 
             * *   **0**: Elastic Compute Service (ECS)
             * *   **1**: Server Load Balancer (SLB)
             * *   **3**: ApsaraDB RDS
             * *   **4**: ApsaraDB for MongoDB (MongoDB)
             * *   **5**: ApsaraDB for Redis (Redis)
             * *   **6**: Container Registry
             * *   **8**: Container Service for Kubernetes (ACK)
             * *   **9**: Virtual Private Cloud (VPC)
             * *   **11**: ActionTrail
             * *   **12**: Alibaba Cloud CDN (CDN)
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
             * *   **25**: IDaaS EIAM
             * *   **26**: PolarDB-X
             * *   **27**: Elasticsearch
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * The type of the cloud asset.
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            public CloudAssetTypes build() {
                return new CloudAssetTypes(this);
            } 

        } 

    }
}
