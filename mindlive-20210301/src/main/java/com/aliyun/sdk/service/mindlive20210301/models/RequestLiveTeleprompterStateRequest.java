// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestLiveTeleprompterStateRequest} extends {@link RequestModel}
 *
 * <p>RequestLiveTeleprompterStateRequest</p>
 */
public class RequestLiveTeleprompterStateRequest extends Request {
    private RequestLiveTeleprompterStateRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestLiveTeleprompterStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RequestLiveTeleprompterStateRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RequestLiveTeleprompterStateRequest request) {
            super(request);
        } 

        @Override
        public RequestLiveTeleprompterStateRequest build() {
            return new RequestLiveTeleprompterStateRequest(this);
        } 

    } 

}
