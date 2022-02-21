// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>EnableControlPolicyRequest</p>
 */
public class EnableControlPolicyRequest extends Request {
    private EnableControlPolicyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EnableControlPolicyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EnableControlPolicyRequest response) {
            super(response);
        } 

        @Override
        public EnableControlPolicyRequest build() {
            return new EnableControlPolicyRequest(this);
        } 

    } 

}
