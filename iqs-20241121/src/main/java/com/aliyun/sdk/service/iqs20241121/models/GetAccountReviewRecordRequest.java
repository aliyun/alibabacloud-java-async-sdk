// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link GetAccountReviewRecordRequest} extends {@link RequestModel}
 *
 * <p>GetAccountReviewRecordRequest</p>
 */
public class GetAccountReviewRecordRequest extends Request {
    private GetAccountReviewRecordRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountReviewRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAccountReviewRecordRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAccountReviewRecordRequest request) {
            super(request);
        } 

        @Override
        public GetAccountReviewRecordRequest build() {
            return new GetAccountReviewRecordRequest(this);
        } 

    } 

}
