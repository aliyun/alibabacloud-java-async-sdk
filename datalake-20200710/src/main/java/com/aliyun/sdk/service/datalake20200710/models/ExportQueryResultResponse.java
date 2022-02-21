// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportQueryResultResponse} extends {@link TeaModel}
 *
 * <p>ExportQueryResultResponse</p>
 */
public class ExportQueryResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportQueryResultResponseBody body;

    private ExportQueryResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportQueryResultResponse create() {
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
    public ExportQueryResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportQueryResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportQueryResultResponseBody body);

        @Override
        ExportQueryResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportQueryResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportQueryResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportQueryResultResponse response) {
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
        public Builder body(ExportQueryResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportQueryResultResponse build() {
            return new ExportQueryResultResponse(this);
        } 

    } 

}
