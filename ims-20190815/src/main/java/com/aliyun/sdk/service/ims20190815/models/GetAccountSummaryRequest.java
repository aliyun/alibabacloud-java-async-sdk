// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetAccountSummaryRequest</p>
 */
public class GetAccountSummaryRequest extends Request {
    private GetAccountSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAccountSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAccountSummaryRequest response) {
            super(response);
        } 

        @Override
        public GetAccountSummaryRequest build() {
            return new GetAccountSummaryRequest(this);
        } 

    } 

}
