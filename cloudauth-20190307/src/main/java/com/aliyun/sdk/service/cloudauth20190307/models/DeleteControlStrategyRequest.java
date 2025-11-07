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
 * {@link DeleteControlStrategyRequest} extends {@link RequestModel}
 *
 * <p>DeleteControlStrategyRequest</p>
 */
public class DeleteControlStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteControlStrategyRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.id = builder.id;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteControlStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<DeleteControlStrategyRequest, Builder> {
        private String apiName; 
        private Long id; 
        private String productType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteControlStrategyRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.id = request.id;
            this.productType = request.productType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>API name, same as <strong>ProductCode</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * <p>Security rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
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
         * <p>Region ID.</p>
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
        public DeleteControlStrategyRequest build() {
            return new DeleteControlStrategyRequest(this);
        } 

    } 

}
