// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGeneratedContentResponse} extends {@link TeaModel}
 *
 * <p>DeleteGeneratedContentResponse</p>
 */
public class DeleteGeneratedContentResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteGeneratedContentResponseBody body;

    private DeleteGeneratedContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteGeneratedContentResponse create() {
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
    public DeleteGeneratedContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGeneratedContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteGeneratedContentResponseBody body);

        @Override
        DeleteGeneratedContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGeneratedContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteGeneratedContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGeneratedContentResponse response) {
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
        public Builder body(DeleteGeneratedContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGeneratedContentResponse build() {
            return new DeleteGeneratedContentResponse(this);
        } 

    } 

}
