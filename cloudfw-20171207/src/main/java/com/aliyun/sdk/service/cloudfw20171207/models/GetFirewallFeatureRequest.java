// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link GetFirewallFeatureRequest} extends {@link RequestModel}
 *
 * <p>GetFirewallFeatureRequest</p>
 */
public class GetFirewallFeatureRequest extends Request {
    private GetFirewallFeatureRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFirewallFeatureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetFirewallFeatureRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetFirewallFeatureRequest request) {
            super(request);
        } 

        @Override
        public GetFirewallFeatureRequest build() {
            return new GetFirewallFeatureRequest(this);
        } 

    } 

}
