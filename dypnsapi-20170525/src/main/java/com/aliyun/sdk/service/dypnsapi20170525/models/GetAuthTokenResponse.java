// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthTokenResponse} extends {@link TeaModel}
 *
 * <p>GetAuthTokenResponse</p>
 */
public class GetAuthTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAuthTokenResponseBody body;

    private GetAuthTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAuthTokenResponse create() {
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
    public GetAuthTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuthTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAuthTokenResponseBody body);

        @Override
        GetAuthTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuthTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAuthTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuthTokenResponse response) {
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
        public Builder body(GetAuthTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuthTokenResponse build() {
            return new GetAuthTokenResponse(this);
        } 

    } 

}
