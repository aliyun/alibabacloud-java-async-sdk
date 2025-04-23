// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link InitTenantAliasRequest} extends {@link RequestModel}
 *
 * <p>InitTenantAliasRequest</p>
 */
public class InitTenantAliasRequest extends Request {
    private InitTenantAliasRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitTenantAliasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<InitTenantAliasRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(InitTenantAliasRequest request) {
            super(request);
        } 

        @Override
        public InitTenantAliasRequest build() {
            return new InitTenantAliasRequest(this);
        } 

    } 

}
