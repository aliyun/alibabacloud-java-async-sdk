// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeDocumentStructureResponse} extends {@link TeaModel}
 *
 * <p>RecognizeDocumentStructureResponse</p>
 */
public class RecognizeDocumentStructureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeDocumentStructureResponseBody body;

    private RecognizeDocumentStructureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeDocumentStructureResponse create() {
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
    public RecognizeDocumentStructureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeDocumentStructureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeDocumentStructureResponseBody body);

        @Override
        RecognizeDocumentStructureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeDocumentStructureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeDocumentStructureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeDocumentStructureResponse response) {
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
        public Builder body(RecognizeDocumentStructureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeDocumentStructureResponse build() {
            return new RecognizeDocumentStructureResponse(this);
        } 

    } 

}
