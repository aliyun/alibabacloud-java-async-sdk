// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableResourceCenterRequest} extends {@link RequestModel}
 *
 * <p>EnableResourceCenterRequest</p>
 */
public class EnableResourceCenterRequest extends Request {
    private EnableResourceCenterRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableResourceCenterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EnableResourceCenterRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EnableResourceCenterRequest request) {
            super(request);
        } 

        @Override
        public EnableResourceCenterRequest build() {
            return new EnableResourceCenterRequest(this);
        } 

    } 

}
