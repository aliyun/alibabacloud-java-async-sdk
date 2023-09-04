// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20190620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceSecurityIpsResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceSecurityIpsResponse</p>
 */
public class ModifyDBInstanceSecurityIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBInstanceSecurityIpsResponseBody body;

    private ModifyDBInstanceSecurityIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBInstanceSecurityIpsResponse create() {
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
     * @return body
     */
    public ModifyDBInstanceSecurityIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBInstanceSecurityIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBInstanceSecurityIpsResponseBody body);

        @Override
        ModifyDBInstanceSecurityIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBInstanceSecurityIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBInstanceSecurityIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBInstanceSecurityIpsResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(ModifyDBInstanceSecurityIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBInstanceSecurityIpsResponse build() {
            return new ModifyDBInstanceSecurityIpsResponse(this);
        } 

    } 

}
