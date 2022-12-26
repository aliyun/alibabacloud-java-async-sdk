// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetInterceptionSummaryRequest</p>
 */
public class GetInterceptionSummaryRequest extends Request {
    private GetInterceptionSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetInterceptionSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetInterceptionSummaryRequest request) {
            super(request);
        } 

        @Override
        public GetInterceptionSummaryRequest build() {
            return new GetInterceptionSummaryRequest(this);
        } 

    } 

}
