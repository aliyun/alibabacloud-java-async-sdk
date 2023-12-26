// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenNASServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenNASServiceRequest</p>
 */
public class OpenNASServiceRequest extends Request {
    private OpenNASServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenNASServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenNASServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenNASServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenNASServiceRequest build() {
            return new OpenNASServiceRequest(this);
        } 

    } 

}
