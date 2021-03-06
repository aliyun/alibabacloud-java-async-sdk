// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TakeAccessTokenResponse} extends {@link TeaModel}
 *
 * <p>TakeAccessTokenResponse</p>
 */
public class TakeAccessTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TakeAccessTokenResponseBody body;

    private TakeAccessTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TakeAccessTokenResponse create() {
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
    public TakeAccessTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TakeAccessTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TakeAccessTokenResponseBody body);

        @Override
        TakeAccessTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TakeAccessTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TakeAccessTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TakeAccessTokenResponse response) {
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
        public Builder body(TakeAccessTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TakeAccessTokenResponse build() {
            return new TakeAccessTokenResponse(this);
        } 

    } 

}
