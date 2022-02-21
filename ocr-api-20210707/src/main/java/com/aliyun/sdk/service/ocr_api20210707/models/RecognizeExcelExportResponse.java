// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeExcelExportResponse} extends {@link TeaModel}
 *
 * <p>RecognizeExcelExportResponse</p>
 */
public class RecognizeExcelExportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeExcelExportResponseBody body;

    private RecognizeExcelExportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeExcelExportResponse create() {
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
    public RecognizeExcelExportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeExcelExportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeExcelExportResponseBody body);

        @Override
        RecognizeExcelExportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeExcelExportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeExcelExportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeExcelExportResponse response) {
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
        public Builder body(RecognizeExcelExportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeExcelExportResponse build() {
            return new RecognizeExcelExportResponse(this);
        } 

    } 

}
