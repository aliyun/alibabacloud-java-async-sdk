// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileProtectDashboardRequest} extends {@link RequestModel}
 *
 * <p>GetFileProtectDashboardRequest</p>
 */
public class GetFileProtectDashboardRequest extends Request {
    private GetFileProtectDashboardRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectDashboardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetFileProtectDashboardRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetFileProtectDashboardRequest request) {
            super(request);
        } 

        @Override
        public GetFileProtectDashboardRequest build() {
            return new GetFileProtectDashboardRequest(this);
        } 

    } 

}
