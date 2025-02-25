// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostMSConvSearchTokenGeneratedRequest} extends {@link RequestModel}
 *
 * <p>PostMSConvSearchTokenGeneratedRequest</p>
 */
public class PostMSConvSearchTokenGeneratedRequest extends Request {
    private PostMSConvSearchTokenGeneratedRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostMSConvSearchTokenGeneratedRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<PostMSConvSearchTokenGeneratedRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(PostMSConvSearchTokenGeneratedRequest request) {
            super(request);
        } 

        @Override
        public PostMSConvSearchTokenGeneratedRequest build() {
            return new PostMSConvSearchTokenGeneratedRequest(this);
        } 

    } 

}
