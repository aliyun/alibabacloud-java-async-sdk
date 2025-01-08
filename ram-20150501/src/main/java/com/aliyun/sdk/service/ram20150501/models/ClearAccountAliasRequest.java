// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link ClearAccountAliasRequest} extends {@link RequestModel}
 *
 * <p>ClearAccountAliasRequest</p>
 */
public class ClearAccountAliasRequest extends Request {
    private ClearAccountAliasRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearAccountAliasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ClearAccountAliasRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ClearAccountAliasRequest request) {
            super(request);
        } 

        @Override
        public ClearAccountAliasRequest build() {
            return new ClearAccountAliasRequest(this);
        } 

    } 

}
