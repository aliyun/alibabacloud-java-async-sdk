// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>MigrateDBInstanceResponse</p>
 */
public class MigrateDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MigrateDBInstanceResponseBody body;

    private MigrateDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MigrateDBInstanceResponse create() {
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
    public MigrateDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MigrateDBInstanceResponseBody body);

        @Override
        MigrateDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MigrateDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateDBInstanceResponse response) {
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
        public Builder body(MigrateDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MigrateDBInstanceResponse build() {
            return new MigrateDBInstanceResponse(this);
        } 

    } 

}
