// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OpenCmsServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenCmsServiceRequest</p>
 */
public class OpenCmsServiceRequest extends Request {
    private OpenCmsServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenCmsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenCmsServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenCmsServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenCmsServiceRequest build() {
            return new OpenCmsServiceRequest(this);
        } 

    } 

}
