// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteClusterSecurityIPGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteClusterSecurityIPGroupResponse</p>
 */
public class DeleteClusterSecurityIPGroupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteClusterSecurityIPGroupResponseBody body;

    private DeleteClusterSecurityIPGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteClusterSecurityIPGroupResponse create() {
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
    public DeleteClusterSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteClusterSecurityIPGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteClusterSecurityIPGroupResponseBody body);

        @Override
        DeleteClusterSecurityIPGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteClusterSecurityIPGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteClusterSecurityIPGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteClusterSecurityIPGroupResponse response) {
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
        public Builder body(DeleteClusterSecurityIPGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteClusterSecurityIPGroupResponse build() {
            return new DeleteClusterSecurityIPGroupResponse(this);
        } 

    } 

}
