// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorizationUrlResponse} extends {@link TeaModel}
 *
 * <p>GetAuthorizationUrlResponse</p>
 */
public class GetAuthorizationUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAuthorizationUrlResponseBody body;

    private GetAuthorizationUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAuthorizationUrlResponse create() {
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
    public GetAuthorizationUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuthorizationUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAuthorizationUrlResponseBody body);

        @Override
        GetAuthorizationUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuthorizationUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAuthorizationUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuthorizationUrlResponse response) {
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
        public Builder body(GetAuthorizationUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuthorizationUrlResponse build() {
            return new GetAuthorizationUrlResponse(this);
        } 

    } 

}
