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
 * {@link OpenKmsServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenKmsServiceRequest</p>
 */
public class OpenKmsServiceRequest extends Request {
    private OpenKmsServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenKmsServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenKmsServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenKmsServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenKmsServiceRequest build() {
            return new OpenKmsServiceRequest(this);
        } 

    } 

}
