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
 * {@link DeleteSLBRequest} extends {@link RequestModel}
 *
 * <p>DeleteSLBRequest</p>
 */
public class DeleteSLBRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    private DeleteSLBRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSLBRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSLBRequest, Builder> {
        private String DBClusterId; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSLBRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.product = request.product;
        } 

        /**
         * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to view cluster IDs.</p>
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

        @Override
        public DeleteSLBRequest build() {
            return new DeleteSLBRequest(this);
        } 

    } 

}
