// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeSubscriptionPriceRequest</p>
 */
public class DescribeSubscriptionPriceRequest extends Request {
    @Query
    @NameInMap("CacheCloudEfficiencySize")
    private Long cacheCloudEfficiencySize;

    @Query
    @NameInMap("CacheESSDPl1Size")
    private Long cacheESSDPl1Size;

    @Query
    @NameInMap("CacheSSDSize")
    private Long cacheSSDSize;

    @Query
    @NameInMap("GatewayClass")
    private String gatewayClass;

    @Query
    @NameInMap("PeriodQuantity")
    private Integer periodQuantity;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeSubscriptionPriceRequest(Builder builder) {
        super(builder);
        this.cacheCloudEfficiencySize = builder.cacheCloudEfficiencySize;
        this.cacheESSDPl1Size = builder.cacheESSDPl1Size;
        this.cacheSSDSize = builder.cacheSSDSize;
        this.gatewayClass = builder.gatewayClass;
        this.periodQuantity = builder.periodQuantity;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheCloudEfficiencySize
     */
    public Long getCacheCloudEfficiencySize() {
        return this.cacheCloudEfficiencySize;
    }

    /**
     * @return cacheESSDPl1Size
     */
    public Long getCacheESSDPl1Size() {
        return this.cacheESSDPl1Size;
    }

    /**
     * @return cacheSSDSize
     */
    public Long getCacheSSDSize() {
        return this.cacheSSDSize;
    }

    /**
     * @return gatewayClass
     */
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    /**
     * @return periodQuantity
     */
    public Integer getPeriodQuantity() {
        return this.periodQuantity;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeSubscriptionPriceRequest, Builder> {
        private Long cacheCloudEfficiencySize; 
        private Long cacheESSDPl1Size; 
        private Long cacheSSDSize; 
        private String gatewayClass; 
        private Integer periodQuantity; 
        private String periodUnit; 
        private String regionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSubscriptionPriceRequest request) {
            super(request);
            this.cacheCloudEfficiencySize = request.cacheCloudEfficiencySize;
            this.cacheESSDPl1Size = request.cacheESSDPl1Size;
            this.cacheSSDSize = request.cacheSSDSize;
            this.gatewayClass = request.gatewayClass;
            this.periodQuantity = request.periodQuantity;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.securityToken = request.securityToken;
        } 

        /**
         * CacheCloudEfficiencySize.
         */
        public Builder cacheCloudEfficiencySize(Long cacheCloudEfficiencySize) {
            this.putQueryParameter("CacheCloudEfficiencySize", cacheCloudEfficiencySize);
            this.cacheCloudEfficiencySize = cacheCloudEfficiencySize;
            return this;
        }

        /**
         * CacheESSDPl1Size.
         */
        public Builder cacheESSDPl1Size(Long cacheESSDPl1Size) {
            this.putQueryParameter("CacheESSDPl1Size", cacheESSDPl1Size);
            this.cacheESSDPl1Size = cacheESSDPl1Size;
            return this;
        }

        /**
         * CacheSSDSize.
         */
        public Builder cacheSSDSize(Long cacheSSDSize) {
            this.putQueryParameter("CacheSSDSize", cacheSSDSize);
            this.cacheSSDSize = cacheSSDSize;
            return this;
        }

        /**
         * GatewayClass.
         */
        public Builder gatewayClass(String gatewayClass) {
            this.putQueryParameter("GatewayClass", gatewayClass);
            this.gatewayClass = gatewayClass;
            return this;
        }

        /**
         * PeriodQuantity.
         */
        public Builder periodQuantity(Integer periodQuantity) {
            this.putQueryParameter("PeriodQuantity", periodQuantity);
            this.periodQuantity = periodQuantity;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeSubscriptionPriceRequest build() {
            return new DescribeSubscriptionPriceRequest(this);
        } 

    } 

}
