// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceAutoUpgradeMinorVersionResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceAutoUpgradeMinorVersionResponse</p>
 */
public class ModifyDBInstanceAutoUpgradeMinorVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBInstanceAutoUpgradeMinorVersionResponseBody body;

    private ModifyDBInstanceAutoUpgradeMinorVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBInstanceAutoUpgradeMinorVersionResponse create() {
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
    public ModifyDBInstanceAutoUpgradeMinorVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBInstanceAutoUpgradeMinorVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBInstanceAutoUpgradeMinorVersionResponseBody body);

        @Override
        ModifyDBInstanceAutoUpgradeMinorVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBInstanceAutoUpgradeMinorVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBInstanceAutoUpgradeMinorVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBInstanceAutoUpgradeMinorVersionResponse response) {
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
        public Builder body(ModifyDBInstanceAutoUpgradeMinorVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBInstanceAutoUpgradeMinorVersionResponse build() {
            return new ModifyDBInstanceAutoUpgradeMinorVersionResponse(this);
        } 

    } 

}
