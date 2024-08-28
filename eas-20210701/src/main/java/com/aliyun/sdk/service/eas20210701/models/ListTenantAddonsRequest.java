// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTenantAddonsRequest} extends {@link RequestModel}
 *
 * <p>ListTenantAddonsRequest</p>
 */
public class ListTenantAddonsRequest extends Request {
    private ListTenantAddonsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantAddonsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListTenantAddonsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListTenantAddonsRequest request) {
            super(request);
        } 

        @Override
        public ListTenantAddonsRequest build() {
            return new ListTenantAddonsRequest(this);
        } 

    } 

}
