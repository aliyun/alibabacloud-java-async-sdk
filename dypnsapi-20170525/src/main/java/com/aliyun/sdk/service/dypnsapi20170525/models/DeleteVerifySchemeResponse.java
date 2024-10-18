// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteVerifySchemeResponse} extends {@link TeaModel}
 *
 * <p>DeleteVerifySchemeResponse</p>
 */
public class DeleteVerifySchemeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteVerifySchemeResponseBody body;

    private DeleteVerifySchemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteVerifySchemeResponse create() {
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
    public DeleteVerifySchemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVerifySchemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteVerifySchemeResponseBody body);

        @Override
        DeleteVerifySchemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVerifySchemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteVerifySchemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVerifySchemeResponse response) {
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
        public Builder body(DeleteVerifySchemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVerifySchemeResponse build() {
            return new DeleteVerifySchemeResponse(this);
        } 

    } 

}
