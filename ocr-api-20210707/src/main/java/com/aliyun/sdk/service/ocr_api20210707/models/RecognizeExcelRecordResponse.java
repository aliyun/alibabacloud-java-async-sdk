// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeExcelRecordResponse} extends {@link TeaModel}
 *
 * <p>RecognizeExcelRecordResponse</p>
 */
public class RecognizeExcelRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeExcelRecordResponseBody body;

    private RecognizeExcelRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeExcelRecordResponse create() {
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
    public RecognizeExcelRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeExcelRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeExcelRecordResponseBody body);

        @Override
        RecognizeExcelRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeExcelRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeExcelRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeExcelRecordResponse response) {
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
        public Builder body(RecognizeExcelRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeExcelRecordResponse build() {
            return new RecognizeExcelRecordResponse(this);
        } 

    } 

}
