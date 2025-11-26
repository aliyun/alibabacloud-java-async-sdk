// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateCloudResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudResourceRequest</p>
 */
public class CreateCloudResourceRequest extends Request {
    private CreateCloudResourceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateCloudResourceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateCloudResourceRequest request) {
            super(request);
        } 

        @Override
        public CreateCloudResourceRequest build() {
            return new CreateCloudResourceRequest(this);
        } 

    } 

}
