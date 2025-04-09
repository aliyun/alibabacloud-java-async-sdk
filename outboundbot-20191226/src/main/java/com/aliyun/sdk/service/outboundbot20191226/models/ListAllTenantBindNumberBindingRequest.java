// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListAllTenantBindNumberBindingRequest} extends {@link RequestModel}
 *
 * <p>ListAllTenantBindNumberBindingRequest</p>
 */
public class ListAllTenantBindNumberBindingRequest extends Request {
    private ListAllTenantBindNumberBindingRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllTenantBindNumberBindingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAllTenantBindNumberBindingRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAllTenantBindNumberBindingRequest request) {
            super(request);
        } 

        @Override
        public ListAllTenantBindNumberBindingRequest build() {
            return new ListAllTenantBindNumberBindingRequest(this);
        } 

    } 

}
