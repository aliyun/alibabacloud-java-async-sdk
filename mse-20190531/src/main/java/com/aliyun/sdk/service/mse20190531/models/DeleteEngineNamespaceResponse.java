// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteEngineNamespaceResponse} extends {@link TeaModel}
 *
 * <p>DeleteEngineNamespaceResponse</p>
 */
public class DeleteEngineNamespaceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteEngineNamespaceResponseBody body;

    private DeleteEngineNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteEngineNamespaceResponse create() {
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
    public DeleteEngineNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEngineNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteEngineNamespaceResponseBody body);

        @Override
        DeleteEngineNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEngineNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteEngineNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEngineNamespaceResponse response) {
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
        public Builder body(DeleteEngineNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEngineNamespaceResponse build() {
            return new DeleteEngineNamespaceResponse(this);
        } 

    } 

}
