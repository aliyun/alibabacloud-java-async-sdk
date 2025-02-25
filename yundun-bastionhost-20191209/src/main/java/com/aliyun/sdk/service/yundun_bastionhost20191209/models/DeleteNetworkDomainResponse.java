// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteNetworkDomainResponse} extends {@link TeaModel}
 *
 * <p>DeleteNetworkDomainResponse</p>
 */
public class DeleteNetworkDomainResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteNetworkDomainResponseBody body;

    private DeleteNetworkDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteNetworkDomainResponse create() {
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
    public DeleteNetworkDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNetworkDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteNetworkDomainResponseBody body);

        @Override
        DeleteNetworkDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNetworkDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteNetworkDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNetworkDomainResponse response) {
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
        public Builder body(DeleteNetworkDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNetworkDomainResponse build() {
            return new DeleteNetworkDomainResponse(this);
        } 

    } 

}
