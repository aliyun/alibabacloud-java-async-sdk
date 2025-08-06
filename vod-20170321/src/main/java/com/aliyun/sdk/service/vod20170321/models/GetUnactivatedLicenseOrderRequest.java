// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetUnactivatedLicenseOrderRequest} extends {@link RequestModel}
 *
 * <p>GetUnactivatedLicenseOrderRequest</p>
 */
public class GetUnactivatedLicenseOrderRequest extends Request {
    private GetUnactivatedLicenseOrderRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUnactivatedLicenseOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetUnactivatedLicenseOrderRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetUnactivatedLicenseOrderRequest request) {
            super(request);
        } 

        @Override
        public GetUnactivatedLicenseOrderRequest build() {
            return new GetUnactivatedLicenseOrderRequest(this);
        } 

    } 

}
