// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshAssetsRequest} extends {@link RequestModel}
 *
 * <p>RefreshAssetsRequest</p>
 */
public class RefreshAssetsRequest extends Request {
    @Query
    @NameInMap("AssetType")
    private String assetType;

    @Query
    @NameInMap("CloudAssetSubType")
    private Integer cloudAssetSubType;

    @Query
    @NameInMap("CloudAssetType")
    private Integer cloudAssetType;

    private RefreshAssetsRequest(Builder builder) {
        super(builder);
        this.assetType = builder.assetType;
        this.cloudAssetSubType = builder.cloudAssetSubType;
        this.cloudAssetType = builder.cloudAssetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAssetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return cloudAssetSubType
     */
    public Integer getCloudAssetSubType() {
        return this.cloudAssetSubType;
    }

    /**
     * @return cloudAssetType
     */
    public Integer getCloudAssetType() {
        return this.cloudAssetType;
    }

    public static final class Builder extends Request.Builder<RefreshAssetsRequest, Builder> {
        private String assetType; 
        private Integer cloudAssetSubType; 
        private Integer cloudAssetType; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAssetsRequest request) {
            super(request);
            this.assetType = request.assetType;
            this.cloudAssetSubType = request.cloudAssetSubType;
            this.cloudAssetType = request.cloudAssetType;
        } 

        /**
         * The type of the asset that you want to synchronize.default **ecs**, Valid values:
         * <p>
         * 
         * *   **cloud_product**: Alibaba Cloud service
         * *   **ecs**: Elastic Compute Service (ECS) instance
         * *   **container_image**: container image
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * The subtype of the cloud service.
         * <p>
         * 
         * >  The following list describes the subtypes of cloud services.
         */
        public Builder cloudAssetSubType(Integer cloudAssetSubType) {
            this.putQueryParameter("CloudAssetSubType", cloudAssetSubType);
            this.cloudAssetSubType = cloudAssetSubType;
            return this;
        }

        /**
         * The type of the cloud service. Valid values:
         * <p>
         * 
         * *   **0**: ECS
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
         * *   **15**: Resource Access Management (RAM)
         * *   **16**: Anti-DDoS
         * *   **17**: Web Application Firewall (WAF)
         * *   **18**: Object Storage Service (OSS)
         * *   **19**: PolarDB
         * *   **20**: ApsaraDB RDS for PostgreSQL
         * *   **21**: Microservices Engine (MSE)
         * *   **22**: Apsara File Storage NAS (NAS)
         * *   **23**: Data Security Center (DSC)
         * *   **24**: Elastic IP Address (EIP)
         */
        public Builder cloudAssetType(Integer cloudAssetType) {
            this.putQueryParameter("CloudAssetType", cloudAssetType);
            this.cloudAssetType = cloudAssetType;
            return this;
        }

        @Override
        public RefreshAssetsRequest build() {
            return new RefreshAssetsRequest(this);
        } 

    } 

}
