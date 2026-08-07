// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetGuardLogStatsRequest} extends {@link RequestModel}
 *
 * <p>GetGuardLogStatsRequest</p>
 */
public class GetGuardLogStatsRequest extends Request {
    private GetGuardLogStatsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGuardLogStatsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetGuardLogStatsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetGuardLogStatsRequest request) {
            super(request);
        } 

        @Override
        public GetGuardLogStatsRequest build() {
            return new GetGuardLogStatsRequest(this);
        } 

    } 

}
