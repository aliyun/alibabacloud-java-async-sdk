// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCubecardWhitelistContentResponse} extends {@link TeaModel}
 *
 * <p>DeleteCubecardWhitelistContentResponse</p>
 */
public class DeleteCubecardWhitelistContentResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteCubecardWhitelistContentResponseBody body;

    private DeleteCubecardWhitelistContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteCubecardWhitelistContentResponse create() {
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
    public DeleteCubecardWhitelistContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCubecardWhitelistContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteCubecardWhitelistContentResponseBody body);

        @Override
        DeleteCubecardWhitelistContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCubecardWhitelistContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteCubecardWhitelistContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCubecardWhitelistContentResponse response) {
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
        public Builder body(DeleteCubecardWhitelistContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCubecardWhitelistContentResponse build() {
            return new DeleteCubecardWhitelistContentResponse(this);
        } 

    } 

}
