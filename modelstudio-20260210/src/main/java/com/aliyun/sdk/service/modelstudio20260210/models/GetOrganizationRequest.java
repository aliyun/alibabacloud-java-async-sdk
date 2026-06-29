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
 * {@link GetOrganizationRequest} extends {@link RequestModel}
 *
 * <p>GetOrganizationRequest</p>
 */
public class GetOrganizationRequest extends Request {
    private GetOrganizationRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetOrganizationRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetOrganizationRequest request) {
            super(request);
        } 

        @Override
        public GetOrganizationRequest build() {
            return new GetOrganizationRequest(this);
        } 

    } 

}
