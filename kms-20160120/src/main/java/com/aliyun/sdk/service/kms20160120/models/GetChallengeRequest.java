// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetChallengeRequest} extends {@link RequestModel}
 *
 * <p>GetChallengeRequest</p>
 */
public class GetChallengeRequest extends Request {
    private GetChallengeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChallengeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetChallengeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetChallengeRequest request) {
            super(request);
        } 

        @Override
        public GetChallengeRequest build() {
            return new GetChallengeRequest(this);
        } 

    } 

}
