// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link FetchArtifactTempBucketTokenRequest} extends {@link RequestModel}
 *
 * <p>FetchArtifactTempBucketTokenRequest</p>
 */
public class FetchArtifactTempBucketTokenRequest extends Request {
    private FetchArtifactTempBucketTokenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchArtifactTempBucketTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<FetchArtifactTempBucketTokenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(FetchArtifactTempBucketTokenRequest request) {
            super(request);
        } 

        @Override
        public FetchArtifactTempBucketTokenRequest build() {
            return new FetchArtifactTempBucketTokenRequest(this);
        } 

    } 

}
