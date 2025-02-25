// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecognizeLatinResponse} extends {@link TeaModel}
 *
 * <p>RecognizeLatinResponse</p>
 */
public class RecognizeLatinResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RecognizeLatinResponseBody body;

    private RecognizeLatinResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RecognizeLatinResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public RecognizeLatinResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeLatinResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RecognizeLatinResponseBody body);

        @Override
        RecognizeLatinResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeLatinResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RecognizeLatinResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeLatinResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(RecognizeLatinResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeLatinResponse build() {
            return new RecognizeLatinResponse(this);
        } 

    } 

}
