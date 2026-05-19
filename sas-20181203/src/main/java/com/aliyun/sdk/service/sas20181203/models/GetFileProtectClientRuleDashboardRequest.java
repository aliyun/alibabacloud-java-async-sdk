// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetFileProtectClientRuleDashboardRequest} extends {@link RequestModel}
 *
 * <p>GetFileProtectClientRuleDashboardRequest</p>
 */
public class GetFileProtectClientRuleDashboardRequest extends Request {
    private GetFileProtectClientRuleDashboardRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectClientRuleDashboardRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetFileProtectClientRuleDashboardRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetFileProtectClientRuleDashboardRequest request) {
            super(request);
        } 

        @Override
        public GetFileProtectClientRuleDashboardRequest build() {
            return new GetFileProtectClientRuleDashboardRequest(this);
        } 

    } 

}
