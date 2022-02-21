// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDTCSecurityIpHostsForSQLServerResponse} extends {@link TeaModel}
 *
 * <p>ModifyDTCSecurityIpHostsForSQLServerResponse</p>
 */
public class ModifyDTCSecurityIpHostsForSQLServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDTCSecurityIpHostsForSQLServerResponseBody body;

    private ModifyDTCSecurityIpHostsForSQLServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDTCSecurityIpHostsForSQLServerResponse create() {
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
    public ModifyDTCSecurityIpHostsForSQLServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDTCSecurityIpHostsForSQLServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDTCSecurityIpHostsForSQLServerResponseBody body);

        @Override
        ModifyDTCSecurityIpHostsForSQLServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDTCSecurityIpHostsForSQLServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDTCSecurityIpHostsForSQLServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDTCSecurityIpHostsForSQLServerResponse response) {
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
        public Builder body(ModifyDTCSecurityIpHostsForSQLServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDTCSecurityIpHostsForSQLServerResponse build() {
            return new ModifyDTCSecurityIpHostsForSQLServerResponse(this);
        } 

    } 

}
