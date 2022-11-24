// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeLogstoreResponse} extends {@link TeaModel}
 *
 * <p>GetRetcodeLogstoreResponse</p>
 */
public class GetRetcodeLogstoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRetcodeLogstoreResponseBody body;

    private GetRetcodeLogstoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRetcodeLogstoreResponse create() {
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
    public GetRetcodeLogstoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRetcodeLogstoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRetcodeLogstoreResponseBody body);

        @Override
        GetRetcodeLogstoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRetcodeLogstoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRetcodeLogstoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRetcodeLogstoreResponse response) {
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
        public Builder body(GetRetcodeLogstoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRetcodeLogstoreResponse build() {
            return new GetRetcodeLogstoreResponse(this);
        } 

    } 

}
