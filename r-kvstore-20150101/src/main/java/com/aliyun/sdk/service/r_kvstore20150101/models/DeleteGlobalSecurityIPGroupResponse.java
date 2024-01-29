// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGlobalSecurityIPGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteGlobalSecurityIPGroupResponse</p>
 */
public class DeleteGlobalSecurityIPGroupResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DeleteGlobalSecurityIPGroupResponseBody body;

    private DeleteGlobalSecurityIPGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteGlobalSecurityIPGroupResponse create() {
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
    public DeleteGlobalSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGlobalSecurityIPGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteGlobalSecurityIPGroupResponseBody body);

        @Override
        DeleteGlobalSecurityIPGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGlobalSecurityIPGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteGlobalSecurityIPGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGlobalSecurityIPGroupResponse response) {
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
        public Builder body(DeleteGlobalSecurityIPGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGlobalSecurityIPGroupResponse build() {
            return new DeleteGlobalSecurityIPGroupResponse(this);
        } 

    } 

}
