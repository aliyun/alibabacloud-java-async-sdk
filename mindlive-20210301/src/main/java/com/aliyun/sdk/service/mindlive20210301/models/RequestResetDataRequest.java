// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestResetDataRequest} extends {@link RequestModel}
 *
 * <p>RequestResetDataRequest</p>
 */
public class RequestResetDataRequest extends Request {
    @Query
    @NameInMap("LiveSource")
    @Validation(required = true)
    private String liveSource;

    private RequestResetDataRequest(Builder builder) {
        super(builder);
        this.liveSource = builder.liveSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestResetDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveSource
     */
    public String getLiveSource() {
        return this.liveSource;
    }

    public static final class Builder extends Request.Builder<RequestResetDataRequest, Builder> {
        private String liveSource; 

        private Builder() {
            super();
        } 

        private Builder(RequestResetDataRequest request) {
            super(request);
            this.liveSource = request.liveSource;
        } 

        /**
         * LiveSource.
         */
        public Builder liveSource(String liveSource) {
            this.putQueryParameter("LiveSource", liveSource);
            this.liveSource = liveSource;
            return this;
        }

        @Override
        public RequestResetDataRequest build() {
            return new RequestResetDataRequest(this);
        } 

    } 

}
