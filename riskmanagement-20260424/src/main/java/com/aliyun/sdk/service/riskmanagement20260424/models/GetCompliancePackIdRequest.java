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
 * {@link GetCompliancePackIdRequest} extends {@link RequestModel}
 *
 * <p>GetCompliancePackIdRequest</p>
 */
public class GetCompliancePackIdRequest extends Request {
    private GetCompliancePackIdRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCompliancePackIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCompliancePackIdRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCompliancePackIdRequest request) {
            super(request);
        } 

        @Override
        public GetCompliancePackIdRequest build() {
            return new GetCompliancePackIdRequest(this);
        } 

    } 

}
