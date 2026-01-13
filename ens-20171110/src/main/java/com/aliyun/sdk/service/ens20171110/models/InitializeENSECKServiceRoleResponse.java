// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InitializeENSECKServiceRoleResponse} extends {@link TeaModel}
 *
 * <p>InitializeENSECKServiceRoleResponse</p>
 */
public class InitializeENSECKServiceRoleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private InitializeENSECKServiceRoleResponseBody body;

    private InitializeENSECKServiceRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static InitializeENSECKServiceRoleResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public InitializeENSECKServiceRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitializeENSECKServiceRoleResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(InitializeENSECKServiceRoleResponseBody body);

        @Override
        InitializeENSECKServiceRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitializeENSECKServiceRoleResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private InitializeENSECKServiceRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitializeENSECKServiceRoleResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(InitializeENSECKServiceRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitializeENSECKServiceRoleResponse build() {
            return new InitializeENSECKServiceRoleResponse(this);
        } 

    } 

}
