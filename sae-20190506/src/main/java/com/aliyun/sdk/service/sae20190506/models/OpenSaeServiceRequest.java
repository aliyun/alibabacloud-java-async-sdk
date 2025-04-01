// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link OpenSaeServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenSaeServiceRequest</p>
 */
public class OpenSaeServiceRequest extends Request {
    private OpenSaeServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenSaeServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenSaeServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenSaeServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenSaeServiceRequest build() {
            return new OpenSaeServiceRequest(this);
        } 

    } 

}
