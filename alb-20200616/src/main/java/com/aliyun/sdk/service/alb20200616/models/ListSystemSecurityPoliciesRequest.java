// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemSecurityPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListSystemSecurityPoliciesRequest</p>
 */
public class ListSystemSecurityPoliciesRequest extends Request {
    private ListSystemSecurityPoliciesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemSecurityPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListSystemSecurityPoliciesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListSystemSecurityPoliciesRequest request) {
            super(request);
        } 

        @Override
        public ListSystemSecurityPoliciesRequest build() {
            return new ListSystemSecurityPoliciesRequest(this);
        } 

    } 

}
