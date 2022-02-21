// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelProgressResponse} extends {@link TeaModel}
 *
 * <p>GetModelProgressResponse</p>
 */
public class GetModelProgressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetModelProgressResponseBody body;

    private GetModelProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetModelProgressResponse create() {
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
    public GetModelProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetModelProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetModelProgressResponseBody body);

        @Override
        GetModelProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetModelProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetModelProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetModelProgressResponse response) {
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
        public Builder body(GetModelProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetModelProgressResponse build() {
            return new GetModelProgressResponse(this);
        } 

    } 

}
