// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetBootAndAntiUninstallPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetBootAndAntiUninstallPolicyRequest</p>
 */
public class GetBootAndAntiUninstallPolicyRequest extends Request {
    private GetBootAndAntiUninstallPolicyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBootAndAntiUninstallPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetBootAndAntiUninstallPolicyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetBootAndAntiUninstallPolicyRequest request) {
            super(request);
        } 

        @Override
        public GetBootAndAntiUninstallPolicyRequest build() {
            return new GetBootAndAntiUninstallPolicyRequest(this);
        } 

    } 

}
