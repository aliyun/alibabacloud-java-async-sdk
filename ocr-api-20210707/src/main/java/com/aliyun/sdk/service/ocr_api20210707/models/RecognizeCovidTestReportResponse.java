// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeCovidTestReportResponse} extends {@link TeaModel}
 *
 * <p>RecognizeCovidTestReportResponse</p>
 */
public class RecognizeCovidTestReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeCovidTestReportResponseBody body;

    private RecognizeCovidTestReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeCovidTestReportResponse create() {
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
    public RecognizeCovidTestReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeCovidTestReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeCovidTestReportResponseBody body);

        @Override
        RecognizeCovidTestReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeCovidTestReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeCovidTestReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeCovidTestReportResponse response) {
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
        public Builder body(RecognizeCovidTestReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeCovidTestReportResponse build() {
            return new RecognizeCovidTestReportResponse(this);
        } 

    } 

}
