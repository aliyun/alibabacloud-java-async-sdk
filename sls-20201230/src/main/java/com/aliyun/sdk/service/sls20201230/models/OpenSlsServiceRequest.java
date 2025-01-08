// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link OpenSlsServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenSlsServiceRequest</p>
 */
public class OpenSlsServiceRequest extends Request {
    private OpenSlsServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenSlsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenSlsServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenSlsServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenSlsServiceRequest build() {
            return new OpenSlsServiceRequest(this);
        } 

    } 

}
