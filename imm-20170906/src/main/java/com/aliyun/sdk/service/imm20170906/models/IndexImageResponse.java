// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IndexImageResponse} extends {@link TeaModel}
 *
 * <p>IndexImageResponse</p>
 */
public class IndexImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IndexImageResponseBody body;

    private IndexImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IndexImageResponse create() {
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
    public IndexImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IndexImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IndexImageResponseBody body);

        @Override
        IndexImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IndexImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IndexImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IndexImageResponse response) {
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
        public Builder body(IndexImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IndexImageResponse build() {
            return new IndexImageResponse(this);
        } 

    } 

}
