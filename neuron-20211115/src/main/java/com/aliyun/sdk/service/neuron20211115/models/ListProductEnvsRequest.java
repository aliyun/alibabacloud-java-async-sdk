// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListProductEnvsRequest} extends {@link RequestModel}
 *
 * <p>ListProductEnvsRequest</p>
 */
public class ListProductEnvsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    private ListProductEnvsRequest(Builder builder) {
        super(builder);
        this.companyId = builder.companyId;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductEnvsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<ListProductEnvsRequest, Builder> {
        private Long companyId; 
        private Long productId; 

        private Builder() {
            super();
        } 

        private Builder(ListProductEnvsRequest request) {
            super(request);
            this.companyId = request.companyId;
            this.productId = request.productId;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public ListProductEnvsRequest build() {
            return new ListProductEnvsRequest(this);
        } 

    } 

}
