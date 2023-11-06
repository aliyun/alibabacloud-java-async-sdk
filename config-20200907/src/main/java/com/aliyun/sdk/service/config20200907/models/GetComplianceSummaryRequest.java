// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetComplianceSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetComplianceSummaryRequest</p>
 */
public class GetComplianceSummaryRequest extends Request {
    private GetComplianceSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComplianceSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetComplianceSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetComplianceSummaryRequest request) {
            super(request);
        } 

        @Override
        public GetComplianceSummaryRequest build() {
            return new GetComplianceSummaryRequest(this);
        } 

    } 

}
