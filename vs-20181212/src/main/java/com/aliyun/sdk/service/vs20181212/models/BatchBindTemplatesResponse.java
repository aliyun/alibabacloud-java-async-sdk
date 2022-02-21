// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindTemplatesResponse} extends {@link TeaModel}
 *
 * <p>BatchBindTemplatesResponse</p>
 */
public class BatchBindTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchBindTemplatesResponseBody body;

    private BatchBindTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchBindTemplatesResponse create() {
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
    public BatchBindTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchBindTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchBindTemplatesResponseBody body);

        @Override
        BatchBindTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchBindTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchBindTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchBindTemplatesResponse response) {
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
        public Builder body(BatchBindTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchBindTemplatesResponse build() {
            return new BatchBindTemplatesResponse(this);
        } 

    } 

}
