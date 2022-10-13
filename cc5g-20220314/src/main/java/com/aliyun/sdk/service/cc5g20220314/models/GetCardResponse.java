// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardResponse} extends {@link TeaModel}
 *
 * <p>GetCardResponse</p>
 */
public class GetCardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCardResponseBody body;

    private GetCardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCardResponse create() {
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
    public GetCardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCardResponseBody body);

        @Override
        GetCardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCardResponse response) {
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
        public Builder body(GetCardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCardResponse build() {
            return new GetCardResponse(this);
        } 

    } 

}
