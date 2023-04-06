// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableUserResponse} extends {@link TeaModel}
 *
 * <p>DisableUserResponse</p>
 */
public class DisableUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableUserResponseBody body;

    private DisableUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableUserResponse create() {
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
    public DisableUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableUserResponseBody body);

        @Override
        DisableUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableUserResponse response) {
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
        public Builder body(DisableUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableUserResponse build() {
            return new DisableUserResponse(this);
        } 

    } 

}
