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
 * {@link GetOpaStrategyTemplateSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetOpaStrategyTemplateSummaryRequest</p>
 */
public class GetOpaStrategyTemplateSummaryRequest extends Request {
    private GetOpaStrategyTemplateSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpaStrategyTemplateSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetOpaStrategyTemplateSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetOpaStrategyTemplateSummaryRequest request) {
            super(request);
        } 

        @Override
        public GetOpaStrategyTemplateSummaryRequest build() {
            return new GetOpaStrategyTemplateSummaryRequest(this);
        } 

    } 

}
