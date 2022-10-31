// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageTokenResponse} extends {@link TeaModel}
 *
 * <p>GetMessageTokenResponse</p>
 */
public class GetMessageTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMessageTokenResponseBody body;

    private GetMessageTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMessageTokenResponse create() {
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
    public GetMessageTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMessageTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMessageTokenResponseBody body);

        @Override
        GetMessageTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMessageTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMessageTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMessageTokenResponse response) {
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
        public Builder body(GetMessageTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMessageTokenResponse build() {
            return new GetMessageTokenResponse(this);
        } 

    } 

}
