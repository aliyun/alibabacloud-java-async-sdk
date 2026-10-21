// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetAccessKeyPolicyForAccountRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyPolicyForAccountRequest</p>
 */
public class GetAccessKeyPolicyForAccountRequest extends Request {
    private GetAccessKeyPolicyForAccountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyPolicyForAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAccessKeyPolicyForAccountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyPolicyForAccountRequest request) {
            super(request);
        } 

        @Override
        public GetAccessKeyPolicyForAccountRequest build() {
            return new GetAccessKeyPolicyForAccountRequest(this);
        } 

    } 

}
