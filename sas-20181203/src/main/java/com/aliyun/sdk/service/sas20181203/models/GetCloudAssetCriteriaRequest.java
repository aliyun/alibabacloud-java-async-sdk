// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetCriteriaRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAssetCriteriaRequest</p>
 */
public class GetCloudAssetCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetTypes")
    private java.util.List < CloudAssetTypes> cloudAssetTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
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
         * The types of cloud assets.
         */
        public Builder cloudAssetTypes(java.util.List < CloudAssetTypes> cloudAssetTypes) {
            this.putQueryParameter("CloudAssetTypes", cloudAssetTypes);
            this.cloudAssetTypes = cloudAssetTypes;
            return this;
        }

        /**
         * The keyword for fuzzy search when you query the asset.
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
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
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
             * The subtype of the cloud service or asset. Valid values:
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
             * *   **4**: MongoDB
             * 
             *     *   **0**: instance
             * 
             * *   **5**: Redis
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
             *     *   **1**: Elastic IP address (EIP)
             *     *   **2**: VPN
             *     *   **3**: VPC Flow Logs
             * 
             * *   **11**: ActionTrail
             * 
             *     *   **0**: trail
             * 
             * *   **12**: CDN
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
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * The type of the asset. Valid values:
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
