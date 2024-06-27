// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAuthUserResponse} extends {@link TeaModel}
 *
 * <p>DeleteAuthUserResponse</p>
 */
public class DeleteAuthUserResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteAuthUserResponseBody body;

    private DeleteAuthUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteAuthUserResponse create() {
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
    public DeleteAuthUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAuthUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteAuthUserResponseBody body);

        @Override
        DeleteAuthUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAuthUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteAuthUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAuthUserResponse response) {
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
        public Builder body(DeleteAuthUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAuthUserResponse build() {
            return new DeleteAuthUserResponse(this);
        } 

    } 

}
