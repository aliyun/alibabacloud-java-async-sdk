// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link DescribeAdvisorChecksRequest} extends {@link RequestModel}
 *
 * <p>DescribeAdvisorChecksRequest</p>
 */
public class DescribeAdvisorChecksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    private DescribeAdvisorChecksRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvisorChecksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<DescribeAdvisorChecksRequest, Builder> {
        private String language; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAdvisorChecksRequest request) {
            super(request);
            this.language = request.language;
            this.product = request.product;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
        public DescribeAdvisorChecksRequest build() {
            return new DescribeAdvisorChecksRequest(this);
        } 

    } 

}
