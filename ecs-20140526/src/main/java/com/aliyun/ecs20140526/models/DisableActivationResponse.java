// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableActivationResponse} extends {@link TeaModel}
 *
 * <p>DisableActivationResponse</p>
 */
public class DisableActivationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableActivationResponseBody body;

    private DisableActivationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableActivationResponse create() {
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
    public DisableActivationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableActivationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableActivationResponseBody body);

        @Override
        DisableActivationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableActivationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableActivationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableActivationResponse response) {
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
        public Builder body(DisableActivationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableActivationResponse build() {
            return new DisableActivationResponse(this);
        } 

    } 

}
