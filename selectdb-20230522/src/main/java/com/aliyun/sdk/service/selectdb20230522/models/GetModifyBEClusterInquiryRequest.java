// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModifyBEClusterInquiryRequest} extends {@link RequestModel}
 *
 * <p>GetModifyBEClusterInquiryRequest</p>
 */
public class GetModifyBEClusterInquiryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheSize")
    private Long cacheSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeSize")
    private Long computeSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreCacheSize")
    private Long preCacheSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreComputeSize")
    private Long preComputeSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private GetModifyBEClusterInquiryRequest(Builder builder) {
        super(builder);
        this.cacheSize = builder.cacheSize;
        this.chargeType = builder.chargeType;
        this.clusterId = builder.clusterId;
        this.commodityCode = builder.commodityCode;
        this.computeSize = builder.computeSize;
        this.dbInstanceId = builder.dbInstanceId;
        this.preCacheSize = builder.preCacheSize;
        this.preComputeSize = builder.preComputeSize;
        this.pricingCycle = builder.pricingCycle;
        this.quantity = builder.quantity;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModifyBEClusterInquiryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheSize
     */
    public Long getCacheSize() {
        return this.cacheSize;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return computeSize
     */
    public Long getComputeSize() {
        return this.computeSize;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return preCacheSize
     */
    public Long getPreCacheSize() {
        return this.preCacheSize;
    }

    /**
     * @return preComputeSize
     */
    public Long getPreComputeSize() {
        return this.preComputeSize;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return quantity
     */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<GetModifyBEClusterInquiryRequest, Builder> {
        private Long cacheSize; 
        private String chargeType; 
        private String clusterId; 
        private String commodityCode; 
        private Long computeSize; 
        private String dbInstanceId; 
        private Long preCacheSize; 
        private Long preComputeSize; 
        private String pricingCycle; 
        private Long quantity; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GetModifyBEClusterInquiryRequest request) {
            super(request);
            this.cacheSize = request.cacheSize;
            this.chargeType = request.chargeType;
            this.clusterId = request.clusterId;
            this.commodityCode = request.commodityCode;
            this.computeSize = request.computeSize;
            this.dbInstanceId = request.dbInstanceId;
            this.preCacheSize = request.preCacheSize;
            this.preComputeSize = request.preComputeSize;
            this.pricingCycle = request.pricingCycle;
            this.quantity = request.quantity;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * CacheSize.
         */
        public Builder cacheSize(Long cacheSize) {
            this.putQueryParameter("CacheSize", cacheSize);
            this.cacheSize = cacheSize;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * ComputeSize.
         */
        public Builder computeSize(Long computeSize) {
            this.putQueryParameter("ComputeSize", computeSize);
            this.computeSize = computeSize;
            return this;
        }

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * PreCacheSize.
         */
        public Builder preCacheSize(Long preCacheSize) {
            this.putQueryParameter("PreCacheSize", preCacheSize);
            this.preCacheSize = preCacheSize;
            return this;
        }

        /**
         * PreComputeSize.
         */
        public Builder preComputeSize(Long preComputeSize) {
            this.putQueryParameter("PreComputeSize", preComputeSize);
            this.preComputeSize = preComputeSize;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(Long quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public GetModifyBEClusterInquiryRequest build() {
            return new GetModifyBEClusterInquiryRequest(this);
        } 

    } 

}
