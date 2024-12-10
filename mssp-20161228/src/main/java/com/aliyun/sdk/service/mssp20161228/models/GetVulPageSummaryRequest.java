// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVulPageSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetVulPageSummaryRequest</p>
 */
public class GetVulPageSummaryRequest extends Request {
    private GetVulPageSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulPageSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetVulPageSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetVulPageSummaryRequest request) {
            super(request);
        } 

        @Override
        public GetVulPageSummaryRequest build() {
            return new GetVulPageSummaryRequest(this);
        } 

    } 

}
