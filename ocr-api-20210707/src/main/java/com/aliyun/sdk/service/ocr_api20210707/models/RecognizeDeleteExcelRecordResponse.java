// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeDeleteExcelRecordResponse} extends {@link TeaModel}
 *
 * <p>RecognizeDeleteExcelRecordResponse</p>
 */
public class RecognizeDeleteExcelRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeDeleteExcelRecordResponseBody body;

    private RecognizeDeleteExcelRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeDeleteExcelRecordResponse create() {
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
    public RecognizeDeleteExcelRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeDeleteExcelRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeDeleteExcelRecordResponseBody body);

        @Override
        RecognizeDeleteExcelRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeDeleteExcelRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeDeleteExcelRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeDeleteExcelRecordResponse response) {
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
        public Builder body(RecognizeDeleteExcelRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeDeleteExcelRecordResponse build() {
            return new RecognizeDeleteExcelRecordResponse(this);
        } 

    } 

}
