// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetDefaultKmsInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetDefaultKmsInstanceRequest</p>
 */
public class GetDefaultKmsInstanceRequest extends Request {
    private GetDefaultKmsInstanceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefaultKmsInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetDefaultKmsInstanceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetDefaultKmsInstanceRequest request) {
            super(request);
        } 

        @Override
        public GetDefaultKmsInstanceRequest build() {
            return new GetDefaultKmsInstanceRequest(this);
        } 

    } 

}
