// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceMaintainTimeResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceMaintainTimeResponse</p>
 */
public class ModifyDBInstanceMaintainTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBInstanceMaintainTimeResponseBody body;

    private ModifyDBInstanceMaintainTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBInstanceMaintainTimeResponse create() {
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
    public ModifyDBInstanceMaintainTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBInstanceMaintainTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBInstanceMaintainTimeResponseBody body);

        @Override
        ModifyDBInstanceMaintainTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBInstanceMaintainTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBInstanceMaintainTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBInstanceMaintainTimeResponse response) {
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
        public Builder body(ModifyDBInstanceMaintainTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBInstanceMaintainTimeResponse build() {
            return new ModifyDBInstanceMaintainTimeResponse(this);
        } 

    } 

}
