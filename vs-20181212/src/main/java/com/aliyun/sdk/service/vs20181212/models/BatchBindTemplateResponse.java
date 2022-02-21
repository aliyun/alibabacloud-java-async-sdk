// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindTemplateResponse} extends {@link TeaModel}
 *
 * <p>BatchBindTemplateResponse</p>
 */
public class BatchBindTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchBindTemplateResponseBody body;

    private BatchBindTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchBindTemplateResponse create() {
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
    public BatchBindTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchBindTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchBindTemplateResponseBody body);

        @Override
        BatchBindTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchBindTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchBindTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchBindTemplateResponse response) {
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
        public Builder body(BatchBindTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchBindTemplateResponse build() {
            return new BatchBindTemplateResponse(this);
        } 

    } 

}
