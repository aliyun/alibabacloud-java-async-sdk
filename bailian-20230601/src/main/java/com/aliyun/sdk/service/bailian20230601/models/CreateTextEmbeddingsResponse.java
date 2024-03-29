// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTextEmbeddingsResponse} extends {@link TeaModel}
 *
 * <p>CreateTextEmbeddingsResponse</p>
 */
public class CreateTextEmbeddingsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateTextEmbeddingsResponseBody body;

    private CreateTextEmbeddingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateTextEmbeddingsResponse create() {
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
    public CreateTextEmbeddingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTextEmbeddingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateTextEmbeddingsResponseBody body);

        @Override
        CreateTextEmbeddingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTextEmbeddingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateTextEmbeddingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTextEmbeddingsResponse response) {
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
        public Builder body(CreateTextEmbeddingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTextEmbeddingsResponse build() {
            return new CreateTextEmbeddingsResponse(this);
        } 

    } 

}
