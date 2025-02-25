// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableServiceRequest} extends {@link RequestModel}
 *
 * <p>EnableServiceRequest</p>
 */
public class EnableServiceRequest extends Request {
    private EnableServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EnableServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EnableServiceRequest request) {
            super(request);
        } 

        @Override
        public EnableServiceRequest build() {
            return new EnableServiceRequest(this);
        } 

    } 

}
