// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteInstanceResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteInstanceResponse</p>
 */
public class BatchDeleteInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteInstanceResponseBody body;

    private BatchDeleteInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteInstanceResponse create() {
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
    public BatchDeleteInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteInstanceResponseBody body);

        @Override
        BatchDeleteInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteInstanceResponse response) {
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
        public Builder body(BatchDeleteInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteInstanceResponse build() {
            return new BatchDeleteInstanceResponse(this);
        } 

    } 

}
