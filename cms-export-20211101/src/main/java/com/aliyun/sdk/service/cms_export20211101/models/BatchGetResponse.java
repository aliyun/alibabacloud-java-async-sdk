// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms_export20211101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetResponse} extends {@link TeaModel}
 *
 * <p>BatchGetResponse</p>
 */
public class BatchGetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchGetResponseBody body;

    private BatchGetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchGetResponse create() {
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
    public BatchGetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchGetResponseBody body);

        @Override
        BatchGetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchGetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGetResponse response) {
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
        public Builder body(BatchGetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGetResponse build() {
            return new BatchGetResponse(this);
        } 

    } 

}
