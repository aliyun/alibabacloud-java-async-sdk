// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetMFAAuthenticationStatusResponse} extends {@link TeaModel}
 *
 * <p>SetMFAAuthenticationStatusResponse</p>
 */
public class SetMFAAuthenticationStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetMFAAuthenticationStatusResponseBody body;

    private SetMFAAuthenticationStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetMFAAuthenticationStatusResponse create() {
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
    public SetMFAAuthenticationStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetMFAAuthenticationStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetMFAAuthenticationStatusResponseBody body);

        @Override
        SetMFAAuthenticationStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetMFAAuthenticationStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetMFAAuthenticationStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetMFAAuthenticationStatusResponse response) {
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
        public Builder body(SetMFAAuthenticationStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetMFAAuthenticationStatusResponse build() {
            return new SetMFAAuthenticationStatusResponse(this);
        } 

    } 

}
