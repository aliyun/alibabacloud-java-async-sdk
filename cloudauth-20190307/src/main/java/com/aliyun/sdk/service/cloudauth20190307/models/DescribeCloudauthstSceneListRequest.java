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
 * {@link DescribeCloudauthstSceneListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudauthstSceneListRequest</p>
 */
public class DescribeCloudauthstSceneListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    private DescribeCloudauthstSceneListRequest(Builder builder) {
        super(builder);
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudauthstSceneListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<DescribeCloudauthstSceneListRequest, Builder> {
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudauthstSceneListRequest request) {
            super(request);
            this.productCode = request.productCode;
        } 

        /**
         * <p>Product Code</p>
         * 
         * <strong>example:</strong>
         * <p>SMART_CARD</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DescribeCloudauthstSceneListRequest build() {
            return new DescribeCloudauthstSceneListRequest(this);
        } 

    } 

}
