// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link CheckAccountTypeRequest} extends {@link RequestModel}
 *
 * <p>CheckAccountTypeRequest</p>
 */
public class CheckAccountTypeRequest extends Request {
    private CheckAccountTypeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAccountTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CheckAccountTypeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CheckAccountTypeRequest request) {
            super(request);
        } 

        @Override
        public CheckAccountTypeRequest build() {
            return new CheckAccountTypeRequest(this);
        } 

    } 

}
