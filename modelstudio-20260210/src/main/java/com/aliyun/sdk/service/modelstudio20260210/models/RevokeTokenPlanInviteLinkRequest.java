// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link RevokeTokenPlanInviteLinkRequest} extends {@link RequestModel}
 *
 * <p>RevokeTokenPlanInviteLinkRequest</p>
 */
public class RevokeTokenPlanInviteLinkRequest extends Request {
    private RevokeTokenPlanInviteLinkRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeTokenPlanInviteLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RevokeTokenPlanInviteLinkRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RevokeTokenPlanInviteLinkRequest request) {
            super(request);
        } 

        @Override
        public RevokeTokenPlanInviteLinkRequest build() {
            return new RevokeTokenPlanInviteLinkRequest(this);
        } 

    } 

}
