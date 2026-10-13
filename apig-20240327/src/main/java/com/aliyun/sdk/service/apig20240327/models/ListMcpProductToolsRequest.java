// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListMcpProductToolsRequest} extends {@link RequestModel}
 *
 * <p>ListMcpProductToolsRequest</p>
 */
public class ListMcpProductToolsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    private ListMcpProductToolsRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcpProductToolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<ListMcpProductToolsRequest, Builder> {
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(ListMcpProductToolsRequest request) {
            super(request);
            this.productId = request.productId;
        } 

        /**
         * <p>The ID of the MCP Server API product for which you want to query tool details.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putPathParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public ListMcpProductToolsRequest build() {
            return new ListMcpProductToolsRequest(this);
        } 

    } 

}
