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
 * {@link DeleteBlackListStrategyRequest} extends {@link RequestModel}
 *
 * <p>DeleteBlackListStrategyRequest</p>
 */
public class DeleteBlackListStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteBlackListStrategyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.productName = builder.productName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBlackListStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteBlackListStrategyRequest, Builder> {
        private Long id; 
        private String productName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBlackListStrategyRequest request) {
            super(request);
            this.id = request.id;
            this.productName = request.productName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Rule ID.</p>
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
         * <p>Product Name:</p>
         * <ul>
         * <li><strong>id2meta</strong>: ID card two-factor verification</li>
         * <li><strong>mobile3Meta</strong>: Mobile phone number factor verification</li>
         * <li><strong>bankcardMeta</strong>: Bank card factor verification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>id2meta</p>
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
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
        public DeleteBlackListStrategyRequest build() {
            return new DeleteBlackListStrategyRequest(this);
        } 

    } 

}
