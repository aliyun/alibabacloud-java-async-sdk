// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSaTokenResponse} extends {@link TeaModel}
 *
 * <p>GetSaTokenResponse</p>
 */
public class GetSaTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSaTokenResponseBody body;

    private GetSaTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSaTokenResponse create() {
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
    public GetSaTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSaTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSaTokenResponseBody body);

        @Override
        GetSaTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSaTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSaTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSaTokenResponse response) {
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
        public Builder body(GetSaTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSaTokenResponse build() {
            return new GetSaTokenResponse(this);
        } 

    } 

}
