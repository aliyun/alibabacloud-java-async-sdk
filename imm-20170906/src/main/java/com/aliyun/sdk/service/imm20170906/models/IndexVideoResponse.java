// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IndexVideoResponse} extends {@link TeaModel}
 *
 * <p>IndexVideoResponse</p>
 */
public class IndexVideoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IndexVideoResponseBody body;

    private IndexVideoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IndexVideoResponse create() {
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
    public IndexVideoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IndexVideoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IndexVideoResponseBody body);

        @Override
        IndexVideoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IndexVideoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IndexVideoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IndexVideoResponse response) {
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
        public Builder body(IndexVideoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IndexVideoResponse build() {
            return new IndexVideoResponse(this);
        } 

    } 

}
