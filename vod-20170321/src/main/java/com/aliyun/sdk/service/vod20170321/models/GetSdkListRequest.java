// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetSdkListRequest} extends {@link RequestModel}
 *
 * <p>GetSdkListRequest</p>
 */
public class GetSdkListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    private Integer group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    private GetSdkListRequest(Builder builder) {
        super(builder);
        this.group = builder.group;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSdkListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return group
     */
    public Integer getGroup() {
        return this.group;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<GetSdkListRequest, Builder> {
        private Integer group; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(GetSdkListRequest request) {
            super(request);
            this.group = request.group;
            this.product = request.product;
        } 

        /**
         * Group.
         */
        public Builder group(Integer group) {
            this.putQueryParameter("Group", group);
            this.group = group;
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
        public GetSdkListRequest build() {
            return new GetSdkListRequest(this);
        } 

    } 

}
