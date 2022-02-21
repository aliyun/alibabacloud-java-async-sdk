// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PlayerAuthResponse} extends {@link TeaModel}
 *
 * <p>PlayerAuthResponse</p>
 */
public class PlayerAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PlayerAuthResponseBody body;

    private PlayerAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PlayerAuthResponse create() {
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
    public PlayerAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PlayerAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PlayerAuthResponseBody body);

        @Override
        PlayerAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PlayerAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PlayerAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PlayerAuthResponse response) {
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
        public Builder body(PlayerAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PlayerAuthResponse build() {
            return new PlayerAuthResponse(this);
        } 

    } 

}
