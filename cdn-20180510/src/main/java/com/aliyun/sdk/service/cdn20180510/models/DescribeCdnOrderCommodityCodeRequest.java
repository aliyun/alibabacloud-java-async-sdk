// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnOrderCommodityCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnOrderCommodityCodeRequest</p>
 */
public class DescribeCdnOrderCommodityCodeRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeCdnOrderCommodityCodeRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnOrderCommodityCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeCdnOrderCommodityCodeRequest, Builder> {
        private String commodityCode; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnOrderCommodityCodeRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The original commodity code.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
        public DescribeCdnOrderCommodityCodeRequest build() {
            return new DescribeCdnOrderCommodityCodeRequest(this);
        } 

    } 

}
