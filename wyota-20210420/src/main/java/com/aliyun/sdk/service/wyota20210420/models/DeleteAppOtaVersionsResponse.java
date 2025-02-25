// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAppOtaVersionsResponse} extends {@link TeaModel}
 *
 * <p>DeleteAppOtaVersionsResponse</p>
 */
public class DeleteAppOtaVersionsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteAppOtaVersionsResponseBody body;

    private DeleteAppOtaVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteAppOtaVersionsResponse create() {
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
    public DeleteAppOtaVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAppOtaVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteAppOtaVersionsResponseBody body);

        @Override
        DeleteAppOtaVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAppOtaVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteAppOtaVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAppOtaVersionsResponse response) {
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
        public Builder body(DeleteAppOtaVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAppOtaVersionsResponse build() {
            return new DeleteAppOtaVersionsResponse(this);
        } 

    } 

}
