// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateSecurityIPModeResponse} extends {@link TeaModel}
 *
 * <p>MigrateSecurityIPModeResponse</p>
 */
public class MigrateSecurityIPModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MigrateSecurityIPModeResponseBody body;

    private MigrateSecurityIPModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MigrateSecurityIPModeResponse create() {
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
    public MigrateSecurityIPModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateSecurityIPModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MigrateSecurityIPModeResponseBody body);

        @Override
        MigrateSecurityIPModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateSecurityIPModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MigrateSecurityIPModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateSecurityIPModeResponse response) {
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
        public Builder body(MigrateSecurityIPModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MigrateSecurityIPModeResponse build() {
            return new MigrateSecurityIPModeResponse(this);
        } 

    } 

}
