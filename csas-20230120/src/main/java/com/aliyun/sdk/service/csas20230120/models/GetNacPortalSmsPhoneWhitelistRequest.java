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
 * {@link GetNacPortalSmsPhoneWhitelistRequest} extends {@link RequestModel}
 *
 * <p>GetNacPortalSmsPhoneWhitelistRequest</p>
 */
public class GetNacPortalSmsPhoneWhitelistRequest extends Request {
    private GetNacPortalSmsPhoneWhitelistRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNacPortalSmsPhoneWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetNacPortalSmsPhoneWhitelistRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetNacPortalSmsPhoneWhitelistRequest request) {
            super(request);
        } 

        @Override
        public GetNacPortalSmsPhoneWhitelistRequest build() {
            return new GetNacPortalSmsPhoneWhitelistRequest(this);
        } 

    } 

}
