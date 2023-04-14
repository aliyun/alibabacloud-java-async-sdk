// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFusionAuthTokenResponse} extends {@link TeaModel}
 *
 * <p>GetFusionAuthTokenResponse</p>
 */
public class GetFusionAuthTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFusionAuthTokenResponseBody body;

    private GetFusionAuthTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFusionAuthTokenResponse create() {
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
    public GetFusionAuthTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFusionAuthTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFusionAuthTokenResponseBody body);

        @Override
        GetFusionAuthTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFusionAuthTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFusionAuthTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFusionAuthTokenResponse response) {
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
        public Builder body(GetFusionAuthTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFusionAuthTokenResponse build() {
            return new GetFusionAuthTokenResponse(this);
        } 

    } 

}
