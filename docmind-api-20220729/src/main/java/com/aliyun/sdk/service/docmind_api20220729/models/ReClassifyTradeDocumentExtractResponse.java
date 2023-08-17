// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220729.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReClassifyTradeDocumentExtractResponse} extends {@link TeaModel}
 *
 * <p>ReClassifyTradeDocumentExtractResponse</p>
 */
public class ReClassifyTradeDocumentExtractResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReClassifyTradeDocumentExtractResponseBody body;

    private ReClassifyTradeDocumentExtractResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReClassifyTradeDocumentExtractResponse create() {
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
    public ReClassifyTradeDocumentExtractResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReClassifyTradeDocumentExtractResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReClassifyTradeDocumentExtractResponseBody body);

        @Override
        ReClassifyTradeDocumentExtractResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReClassifyTradeDocumentExtractResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReClassifyTradeDocumentExtractResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReClassifyTradeDocumentExtractResponse response) {
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
        public Builder body(ReClassifyTradeDocumentExtractResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReClassifyTradeDocumentExtractResponse build() {
            return new ReClassifyTradeDocumentExtractResponse(this);
        } 

    } 

}
