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
 * {@link StopAutoNormalReviewRequest} extends {@link RequestModel}
 *
 * <p>StopAutoNormalReviewRequest</p>
 */
public class StopAutoNormalReviewRequest extends Request {
    private StopAutoNormalReviewRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAutoNormalReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<StopAutoNormalReviewRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(StopAutoNormalReviewRequest request) {
            super(request);
        } 

        @Override
        public StopAutoNormalReviewRequest build() {
            return new StopAutoNormalReviewRequest(this);
        } 

    } 

}
