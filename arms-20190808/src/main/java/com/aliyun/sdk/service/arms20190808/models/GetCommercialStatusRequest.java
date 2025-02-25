// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The product code.</p>
         * <ul>
         * <li>arms_app_post</li>
         * <li>arms_web_post</li>
         * <li>arms_promethues_public_cn</li>
         * <li>prometheus_pay_public_cn</li>
         * <li>xtrace</li>
         * <li>arms_serverless_public_cn</li>
         * <li>arms_rumserverless_public_cn</li>
         * <li>prometheus_serverless_public_cn</li>
         * <li>xtrace_serverless_public_cn</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>arms_app_post</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
