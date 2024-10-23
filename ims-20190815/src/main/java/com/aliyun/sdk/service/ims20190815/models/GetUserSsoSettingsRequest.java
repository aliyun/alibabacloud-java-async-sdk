// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserSsoSettingsRequest} extends {@link RequestModel}
 *
 * <p>GetUserSsoSettingsRequest</p>
 */
public class GetUserSsoSettingsRequest extends Request {
    private GetUserSsoSettingsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserSsoSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetUserSsoSettingsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetUserSsoSettingsRequest request) {
            super(request);
        } 

        @Override
        public GetUserSsoSettingsRequest build() {
            return new GetUserSsoSettingsRequest(this);
        } 

    } 

}
