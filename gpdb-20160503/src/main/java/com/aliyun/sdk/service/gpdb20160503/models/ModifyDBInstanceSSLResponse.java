// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceSSLResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceSSLResponse</p>
 */
public class ModifyDBInstanceSSLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBInstanceSSLResponseBody body;

    private ModifyDBInstanceSSLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBInstanceSSLResponse create() {
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
    public ModifyDBInstanceSSLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBInstanceSSLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBInstanceSSLResponseBody body);

        @Override
        ModifyDBInstanceSSLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBInstanceSSLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBInstanceSSLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBInstanceSSLResponse response) {
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
        public Builder body(ModifyDBInstanceSSLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBInstanceSSLResponse build() {
            return new ModifyDBInstanceSSLResponse(this);
        } 

    } 

}
