// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetSecurityCheckResultBaseInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSecurityCheckResultBaseInfoRequest</p>
 */
public class GetSecurityCheckResultBaseInfoRequest extends Request {
    private GetSecurityCheckResultBaseInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityCheckResultBaseInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetSecurityCheckResultBaseInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetSecurityCheckResultBaseInfoRequest request) {
            super(request);
        } 

        @Override
        public GetSecurityCheckResultBaseInfoRequest build() {
            return new GetSecurityCheckResultBaseInfoRequest(this);
        } 

    } 

}
