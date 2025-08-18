// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetGovernanceMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetGovernanceMetricsRequest</p>
 */
public class GetGovernanceMetricsRequest extends Request {
    private GetGovernanceMetricsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGovernanceMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetGovernanceMetricsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetGovernanceMetricsRequest request) {
            super(request);
        } 

        @Override
        public GetGovernanceMetricsRequest build() {
            return new GetGovernanceMetricsRequest(this);
        } 

    } 

}
