// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceDelayedReplicationTimeResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceDelayedReplicationTimeResponse</p>
 */
public class ModifyDBInstanceDelayedReplicationTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBInstanceDelayedReplicationTimeResponseBody body;

    private ModifyDBInstanceDelayedReplicationTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBInstanceDelayedReplicationTimeResponse create() {
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
    public ModifyDBInstanceDelayedReplicationTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBInstanceDelayedReplicationTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBInstanceDelayedReplicationTimeResponseBody body);

        @Override
        ModifyDBInstanceDelayedReplicationTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBInstanceDelayedReplicationTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBInstanceDelayedReplicationTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBInstanceDelayedReplicationTimeResponse response) {
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
        public Builder body(ModifyDBInstanceDelayedReplicationTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBInstanceDelayedReplicationTimeResponse build() {
            return new ModifyDBInstanceDelayedReplicationTimeResponse(this);
        } 

    } 

}
