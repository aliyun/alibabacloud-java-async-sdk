// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListTenantConfigRequest} extends {@link RequestModel}
 *
 * <p>ListTenantConfigRequest</p>
 */
public class ListTenantConfigRequest extends Request {
    private ListTenantConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListTenantConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListTenantConfigRequest request) {
            super(request);
        } 

        @Override
        public ListTenantConfigRequest build() {
            return new ListTenantConfigRequest(this);
        } 

    } 

}
