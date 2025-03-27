// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link ListInfraredDeviceBrandsRequest} extends {@link RequestModel}
 *
 * <p>ListInfraredDeviceBrandsRequest</p>
 */
public class ListInfraredDeviceBrandsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceProvider")
    private String serviceProvider;

    private ListInfraredDeviceBrandsRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.serviceProvider = builder.serviceProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInfraredDeviceBrandsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return serviceProvider
     */
    public String getServiceProvider() {
        return this.serviceProvider;
    }

    public static final class Builder extends Request.Builder<ListInfraredDeviceBrandsRequest, Builder> {
        private String category; 
        private String serviceProvider; 

        private Builder() {
            super();
        } 

        private Builder(ListInfraredDeviceBrandsRequest request) {
            super(request);
            this.category = request.category;
            this.serviceProvider = request.serviceProvider;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * ServiceProvider.
         */
        public Builder serviceProvider(String serviceProvider) {
            this.putBodyParameter("ServiceProvider", serviceProvider);
            this.serviceProvider = serviceProvider;
            return this;
        }

        @Override
        public ListInfraredDeviceBrandsRequest build() {
            return new ListInfraredDeviceBrandsRequest(this);
        } 

    } 

}
