// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TextEmbeddingResponse} extends {@link TeaModel}
 *
 * <p>TextEmbeddingResponse</p>
 */
public class TextEmbeddingResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TextEmbeddingResponseBody body;

    private TextEmbeddingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TextEmbeddingResponse create() {
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
    public TextEmbeddingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TextEmbeddingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TextEmbeddingResponseBody body);

        @Override
        TextEmbeddingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TextEmbeddingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TextEmbeddingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TextEmbeddingResponse response) {
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
        public Builder body(TextEmbeddingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TextEmbeddingResponse build() {
            return new TextEmbeddingResponse(this);
        } 

    } 

}
