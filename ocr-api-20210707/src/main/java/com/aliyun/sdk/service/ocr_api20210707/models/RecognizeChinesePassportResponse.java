// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeChinesePassportResponse} extends {@link TeaModel}
 *
 * <p>RecognizeChinesePassportResponse</p>
 */
public class RecognizeChinesePassportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeChinesePassportResponseBody body;

    private RecognizeChinesePassportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeChinesePassportResponse create() {
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
    public RecognizeChinesePassportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeChinesePassportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeChinesePassportResponseBody body);

        @Override
        RecognizeChinesePassportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeChinesePassportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeChinesePassportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeChinesePassportResponse response) {
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
        public Builder body(RecognizeChinesePassportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeChinesePassportResponse build() {
            return new RecognizeChinesePassportResponse(this);
        } 

    } 

}
