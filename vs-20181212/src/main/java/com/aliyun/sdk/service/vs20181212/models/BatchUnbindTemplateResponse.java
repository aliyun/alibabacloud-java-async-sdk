// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUnbindTemplateResponse} extends {@link TeaModel}
 *
 * <p>BatchUnbindTemplateResponse</p>
 */
public class BatchUnbindTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUnbindTemplateResponseBody body;

    private BatchUnbindTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUnbindTemplateResponse create() {
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
    public BatchUnbindTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUnbindTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUnbindTemplateResponseBody body);

        @Override
        BatchUnbindTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUnbindTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUnbindTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUnbindTemplateResponse response) {
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
        public Builder body(BatchUnbindTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUnbindTemplateResponse build() {
            return new BatchUnbindTemplateResponse(this);
        } 

    } 

}
