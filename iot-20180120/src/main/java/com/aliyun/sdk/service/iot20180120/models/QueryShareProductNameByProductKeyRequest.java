// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryShareProductNameByProductKeyRequest} extends {@link RequestModel}
 *
 * <p>QueryShareProductNameByProductKeyRequest</p>
 */
public class QueryShareProductNameByProductKeyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareTaskCode;

    private QueryShareProductNameByProductKeyRequest(Builder builder) {
        super(builder);
        this.productKey = builder.productKey;
        this.shareTaskCode = builder.shareTaskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryShareProductNameByProductKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return shareTaskCode
     */
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    public static final class Builder extends Request.Builder<QueryShareProductNameByProductKeyRequest, Builder> {
        private String productKey; 
        private String shareTaskCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryShareProductNameByProductKeyRequest request) {
            super(request);
            this.productKey = request.productKey;
            this.shareTaskCode = request.shareTaskCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2YwD2****</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>52******_7<strong>e_4</strong>3_9<strong>e_61</strong>********</p>
         */
        public Builder shareTaskCode(String shareTaskCode) {
            this.putBodyParameter("ShareTaskCode", shareTaskCode);
            this.shareTaskCode = shareTaskCode;
            return this;
        }

        @Override
        public QueryShareProductNameByProductKeyRequest build() {
            return new QueryShareProductNameByProductKeyRequest(this);
        } 

    } 

}
