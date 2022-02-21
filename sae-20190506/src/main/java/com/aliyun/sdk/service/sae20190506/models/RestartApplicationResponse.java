// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartApplicationResponse} extends {@link TeaModel}
 *
 * <p>RestartApplicationResponse</p>
 */
public class RestartApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartApplicationResponseBody body;

    private RestartApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartApplicationResponse create() {
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
    public RestartApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartApplicationResponseBody body);

        @Override
        RestartApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartApplicationResponse response) {
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
        public Builder body(RestartApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartApplicationResponse build() {
            return new RestartApplicationResponse(this);
        } 

    } 

}
