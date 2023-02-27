// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportCustomCallTaggingResponse} extends {@link TeaModel}
 *
 * <p>ExportCustomCallTaggingResponse</p>
 */
public class ExportCustomCallTaggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportCustomCallTaggingResponseBody body;

    private ExportCustomCallTaggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportCustomCallTaggingResponse create() {
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
    public ExportCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportCustomCallTaggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportCustomCallTaggingResponseBody body);

        @Override
        ExportCustomCallTaggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportCustomCallTaggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportCustomCallTaggingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportCustomCallTaggingResponse response) {
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
        public Builder body(ExportCustomCallTaggingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportCustomCallTaggingResponse build() {
            return new ExportCustomCallTaggingResponse(this);
        } 

    } 

}
