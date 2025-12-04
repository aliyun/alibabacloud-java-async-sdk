// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link CreateSLBRequest} extends {@link RequestModel}
 *
 * <p>CreateSLBRequest</p>
 */
public class CreateSLBRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateSLBRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.product = builder.product;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSLBRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateSLBRequest, Builder> {
        private String DBClusterId; 
        private String product; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSLBRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.product = request.product;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to obtain the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-uf6bnitmve5n0****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
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
        public CreateSLBRequest build() {
            return new CreateSLBRequest(this);
        } 

    } 

}
