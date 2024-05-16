// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePostPayOrderResponse} extends {@link TeaModel}
 *
 * <p>CreatePostPayOrderResponse</p>
 */
public class CreatePostPayOrderResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreatePostPayOrderResponseBody body;

    private CreatePostPayOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreatePostPayOrderResponse create() {
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
    public CreatePostPayOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePostPayOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreatePostPayOrderResponseBody body);

        @Override
        CreatePostPayOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePostPayOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreatePostPayOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePostPayOrderResponse response) {
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
        public Builder body(CreatePostPayOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePostPayOrderResponse build() {
            return new CreatePostPayOrderResponse(this);
        } 

    } 

}
