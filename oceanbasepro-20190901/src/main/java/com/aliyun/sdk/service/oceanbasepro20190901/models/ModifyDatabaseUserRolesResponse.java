// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseUserRolesResponse} extends {@link TeaModel}
 *
 * <p>ModifyDatabaseUserRolesResponse</p>
 */
public class ModifyDatabaseUserRolesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyDatabaseUserRolesResponseBody body;

    private ModifyDatabaseUserRolesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyDatabaseUserRolesResponse create() {
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
    public ModifyDatabaseUserRolesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDatabaseUserRolesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyDatabaseUserRolesResponseBody body);

        @Override
        ModifyDatabaseUserRolesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDatabaseUserRolesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyDatabaseUserRolesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDatabaseUserRolesResponse response) {
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
        public Builder body(ModifyDatabaseUserRolesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDatabaseUserRolesResponse build() {
            return new ModifyDatabaseUserRolesResponse(this);
        } 

    } 

}
