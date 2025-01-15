// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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

        private Builder(DisableControlPolicyRequest request) {
            super(request);
        } 

        @Override
        public DisableControlPolicyRequest build() {
            return new DisableControlPolicyRequest(this);
        } 

    } 

}
