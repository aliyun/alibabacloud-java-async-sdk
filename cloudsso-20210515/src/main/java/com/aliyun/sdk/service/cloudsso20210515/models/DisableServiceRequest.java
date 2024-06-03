// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableServiceRequest} extends {@link RequestModel}
 *
 * <p>DisableServiceRequest</p>
 */
public class DisableServiceRequest extends Request {
    private DisableServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DisableServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DisableServiceRequest request) {
            super(request);
        } 

        @Override
        public DisableServiceRequest build() {
            return new DisableServiceRequest(this);
        } 

    } 

}
