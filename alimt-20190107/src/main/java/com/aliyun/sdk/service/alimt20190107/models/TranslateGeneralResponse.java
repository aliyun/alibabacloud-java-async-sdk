// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190107.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateGeneralResponse} extends {@link TeaModel}
 *
 * <p>TranslateGeneralResponse</p>
 */
public class TranslateGeneralResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private TranslateGeneralResponseBody body;

    private TranslateGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TranslateGeneralResponse create() {
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
    public TranslateGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TranslateGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TranslateGeneralResponseBody body);

        @Override
        TranslateGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TranslateGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TranslateGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TranslateGeneralResponse response) {
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
        public Builder body(TranslateGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TranslateGeneralResponse build() {
            return new TranslateGeneralResponse(this);
        } 

    } 

}
