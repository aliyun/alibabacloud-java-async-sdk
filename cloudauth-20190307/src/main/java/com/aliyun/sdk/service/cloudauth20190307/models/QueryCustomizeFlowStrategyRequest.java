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
 * {@link QueryCustomizeFlowStrategyRequest} extends {@link RequestModel}
 *
 * <p>QueryCustomizeFlowStrategyRequest</p>
 */
public class QueryCustomizeFlowStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private QueryCustomizeFlowStrategyRequest(Builder builder) {
        super(builder);
        this.productType = builder.productType;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomizeFlowStrategyRequest create() {
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

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryCustomizeFlowStrategyRequest, Builder> {
        private String productType; 
        private String regionId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCustomizeFlowStrategyRequest request) {
            super(request);
            this.productType = request.productType;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * <p>Product type, currently only supports <strong>ANT_CLOUD_AUTH</strong> (Financial-grade Real Person), all others have been phased out.</p>
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
         * <p>regionId</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>User ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>126005125163xxxx</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryCustomizeFlowStrategyRequest build() {
            return new QueryCustomizeFlowStrategyRequest(this);
        } 

    } 

}
