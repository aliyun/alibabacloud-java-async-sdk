// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>DisableControlPolicyRequest</p>
 */
public class DisableControlPolicyRequest extends Request {
    private DisableControlPolicyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DisableControlPolicyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DisableControlPolicyRequest response) {
            super(response);
        } 

        @Override
        public DisableControlPolicyRequest build() {
            return new DisableControlPolicyRequest(this);
        } 

    } 

}
