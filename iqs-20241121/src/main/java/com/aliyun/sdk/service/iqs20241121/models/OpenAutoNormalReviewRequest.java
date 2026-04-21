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
 * {@link OpenAutoNormalReviewRequest} extends {@link RequestModel}
 *
 * <p>OpenAutoNormalReviewRequest</p>
 */
public class OpenAutoNormalReviewRequest extends Request {
    private OpenAutoNormalReviewRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenAutoNormalReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenAutoNormalReviewRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenAutoNormalReviewRequest request) {
            super(request);
        } 

        @Override
        public OpenAutoNormalReviewRequest build() {
            return new OpenAutoNormalReviewRequest(this);
        } 

    } 

}
