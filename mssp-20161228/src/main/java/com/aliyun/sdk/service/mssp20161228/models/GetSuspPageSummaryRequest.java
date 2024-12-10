// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSuspPageSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetSuspPageSummaryRequest</p>
 */
public class GetSuspPageSummaryRequest extends Request {
    private GetSuspPageSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSuspPageSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetSuspPageSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetSuspPageSummaryRequest request) {
            super(request);
        } 

        @Override
        public GetSuspPageSummaryRequest build() {
            return new GetSuspPageSummaryRequest(this);
        } 

    } 

}
