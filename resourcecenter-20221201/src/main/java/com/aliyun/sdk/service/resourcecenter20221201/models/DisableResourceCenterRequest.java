// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableResourceCenterRequest} extends {@link RequestModel}
 *
 * <p>DisableResourceCenterRequest</p>
 */
public class DisableResourceCenterRequest extends Request {
    private DisableResourceCenterRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableResourceCenterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DisableResourceCenterRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DisableResourceCenterRequest request) {
            super(request);
        } 

        @Override
        public DisableResourceCenterRequest build() {
            return new DisableResourceCenterRequest(this);
        } 

    } 

}
