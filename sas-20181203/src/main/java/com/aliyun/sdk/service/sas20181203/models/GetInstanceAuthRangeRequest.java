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
 * {@link GetInstanceAuthRangeRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceAuthRangeRequest</p>
 */
public class GetInstanceAuthRangeRequest extends Request {
    private GetInstanceAuthRangeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceAuthRangeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetInstanceAuthRangeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetInstanceAuthRangeRequest request) {
            super(request);
        } 

        @Override
        public GetInstanceAuthRangeRequest build() {
            return new GetInstanceAuthRangeRequest(this);
        } 

    } 

}
