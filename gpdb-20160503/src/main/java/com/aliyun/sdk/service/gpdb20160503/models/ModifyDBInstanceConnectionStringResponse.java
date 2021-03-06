// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceConnectionStringResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceConnectionStringResponse</p>
 */
public class ModifyDBInstanceConnectionStringResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBInstanceConnectionStringResponseBody body;

    private ModifyDBInstanceConnectionStringResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBInstanceConnectionStringResponse create() {
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
    public ModifyDBInstanceConnectionStringResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBInstanceConnectionStringResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBInstanceConnectionStringResponseBody body);

        @Override
        ModifyDBInstanceConnectionStringResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBInstanceConnectionStringResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBInstanceConnectionStringResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBInstanceConnectionStringResponse response) {
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
        public Builder body(ModifyDBInstanceConnectionStringResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBInstanceConnectionStringResponse build() {
            return new ModifyDBInstanceConnectionStringResponse(this);
        } 

    } 

}
