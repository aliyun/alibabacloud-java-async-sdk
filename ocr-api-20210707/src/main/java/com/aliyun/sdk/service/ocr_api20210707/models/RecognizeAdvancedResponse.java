// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeAdvancedResponse} extends {@link TeaModel}
 *
 * <p>RecognizeAdvancedResponse</p>
 */
public class RecognizeAdvancedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeAdvancedResponseBody body;

    private RecognizeAdvancedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RecognizeAdvancedResponse create() {
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
    public RecognizeAdvancedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeAdvancedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RecognizeAdvancedResponseBody body);

        @Override
        RecognizeAdvancedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeAdvancedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RecognizeAdvancedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeAdvancedResponse response) {
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
        public Builder body(RecognizeAdvancedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeAdvancedResponse build() {
            return new RecognizeAdvancedResponse(this);
        } 

    } 

}
