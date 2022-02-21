// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetForceRedirectConfigResponse} extends {@link TeaModel}
 *
 * <p>SetForceRedirectConfigResponse</p>
 */
public class SetForceRedirectConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetForceRedirectConfigResponseBody body;

    private SetForceRedirectConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetForceRedirectConfigResponse create() {
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
    public SetForceRedirectConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetForceRedirectConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetForceRedirectConfigResponseBody body);

        @Override
        SetForceRedirectConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetForceRedirectConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetForceRedirectConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetForceRedirectConfigResponse response) {
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
        public Builder body(SetForceRedirectConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetForceRedirectConfigResponse build() {
            return new SetForceRedirectConfigResponse(this);
        } 

    } 

}
