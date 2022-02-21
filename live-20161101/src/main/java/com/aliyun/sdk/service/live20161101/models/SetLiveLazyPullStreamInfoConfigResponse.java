// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveLazyPullStreamInfoConfigResponse} extends {@link TeaModel}
 *
 * <p>SetLiveLazyPullStreamInfoConfigResponse</p>
 */
public class SetLiveLazyPullStreamInfoConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLiveLazyPullStreamInfoConfigResponseBody body;

    private SetLiveLazyPullStreamInfoConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLiveLazyPullStreamInfoConfigResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public SetLiveLazyPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLiveLazyPullStreamInfoConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLiveLazyPullStreamInfoConfigResponseBody body);

        @Override
        SetLiveLazyPullStreamInfoConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLiveLazyPullStreamInfoConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLiveLazyPullStreamInfoConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLiveLazyPullStreamInfoConfigResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(SetLiveLazyPullStreamInfoConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLiveLazyPullStreamInfoConfigResponse build() {
            return new SetLiveLazyPullStreamInfoConfigResponse(this);
        } 

    } 

}
