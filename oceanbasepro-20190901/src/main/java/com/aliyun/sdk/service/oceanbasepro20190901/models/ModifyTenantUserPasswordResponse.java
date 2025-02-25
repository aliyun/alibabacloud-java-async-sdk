// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserPasswordResponse} extends {@link TeaModel}
 *
 * <p>ModifyTenantUserPasswordResponse</p>
 */
public class ModifyTenantUserPasswordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyTenantUserPasswordResponseBody body;

    private ModifyTenantUserPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyTenantUserPasswordResponse create() {
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
    public ModifyTenantUserPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTenantUserPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyTenantUserPasswordResponseBody body);

        @Override
        ModifyTenantUserPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTenantUserPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyTenantUserPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTenantUserPasswordResponse response) {
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
        public Builder body(ModifyTenantUserPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTenantUserPasswordResponse build() {
            return new ModifyTenantUserPasswordResponse(this);
        } 

    } 

}
