// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchPutDcdnKvResponse} extends {@link TeaModel}
 *
 * <p>BatchPutDcdnKvResponse</p>
 */
public class BatchPutDcdnKvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchPutDcdnKvResponseBody body;

    private BatchPutDcdnKvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchPutDcdnKvResponse create() {
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
    public BatchPutDcdnKvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchPutDcdnKvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchPutDcdnKvResponseBody body);

        @Override
        BatchPutDcdnKvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchPutDcdnKvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchPutDcdnKvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchPutDcdnKvResponse response) {
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
        public Builder body(BatchPutDcdnKvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchPutDcdnKvResponse build() {
            return new BatchPutDcdnKvResponse(this);
        } 

    } 

}
