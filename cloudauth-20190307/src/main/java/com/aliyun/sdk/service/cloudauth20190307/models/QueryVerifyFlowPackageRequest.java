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
 * {@link QueryVerifyFlowPackageRequest} extends {@link RequestModel}
 *
 * <p>QueryVerifyFlowPackageRequest</p>
 */
public class QueryVerifyFlowPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private QueryVerifyFlowPackageRequest(Builder builder) {
        super(builder);
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVerifyFlowPackageRequest create() {
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

    public static final class Builder extends Request.Builder<QueryVerifyFlowPackageRequest, Builder> {
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(QueryVerifyFlowPackageRequest request) {
            super(request);
            this.productType = request.productType;
        } 

        /**
         * <p>Product type:</p>
         * <ul>
         * <li><strong>FINANCE_VERIFY</strong>: Financial Grade Real Person Verification</li>
         * <li><strong>SMART_VERIFY</strong>: Enhanced Real Person Verification (discontinued)</li>
         * <li><strong>FACE_VERIFY</strong>: Real Person Verification (discontinued)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FINANCE_VERIFY</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public QueryVerifyFlowPackageRequest build() {
            return new QueryVerifyFlowPackageRequest(this);
        } 

    } 

}
