// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link QueryControlStrategyRequest} extends {@link RequestModel}
 *
 * <p>QueryControlStrategyRequest</p>
 */
public class QueryControlStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private QueryControlStrategyRequest(Builder builder) {
        super(builder);
        this.productType = builder.productType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryControlStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<QueryControlStrategyRequest, Builder> {
        private String productType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryControlStrategyRequest request) {
            super(request);
            this.productType = request.productType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Product type, currently only supports ANT_CLOUD_AUTH (financial-grade real person), all others have been phased out.</p>
         * 
         * <strong>example:</strong>
         * <p>ANT_CLOUD_AUTH</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>Region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public QueryControlStrategyRequest build() {
            return new QueryControlStrategyRequest(this);
        } 

    } 

}
