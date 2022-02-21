// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorizationTokenResponse} extends {@link TeaModel}
 *
 * <p>GetAuthorizationTokenResponse</p>
 */
public class GetAuthorizationTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAuthorizationTokenResponseBody body;

    private GetAuthorizationTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAuthorizationTokenResponse create() {
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
    public GetAuthorizationTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuthorizationTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAuthorizationTokenResponseBody body);

        @Override
        GetAuthorizationTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuthorizationTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAuthorizationTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuthorizationTokenResponse response) {
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
        public Builder body(GetAuthorizationTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuthorizationTokenResponse build() {
            return new GetAuthorizationTokenResponse(this);
        } 

    } 

}
