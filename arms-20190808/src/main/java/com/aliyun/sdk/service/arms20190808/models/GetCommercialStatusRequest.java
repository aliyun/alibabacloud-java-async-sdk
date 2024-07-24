// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommercialStatusRequest} extends {@link RequestModel}
 *
 * <p>GetCommercialStatusRequest</p>
 */
public class GetCommercialStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetCommercialStatusRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommercialStatusRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetCommercialStatusRequest, Builder> {
        private String commodityCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetCommercialStatusRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.regionId = request.regionId;
        } 

        /**
         * The product code.
         * <p>
         * 
         * *   arms_app_post
         * *   arms_web_post
         * *   arms_promethues_public_cn
         * *   prometheus_pay_public_cn
         * *   xtrace
         * *   arms_serverless_public_cn
         * *   arms_rumserverless_public_cn
         * *   prometheus_serverless_public_cn
         * *   xtrace_serverless_public_cn
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetCommercialStatusRequest build() {
            return new GetCommercialStatusRequest(this);
        } 

    } 

}
