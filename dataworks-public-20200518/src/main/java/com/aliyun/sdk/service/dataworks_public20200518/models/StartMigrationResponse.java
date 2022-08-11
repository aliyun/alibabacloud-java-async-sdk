// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartMigrationResponse} extends {@link TeaModel}
 *
 * <p>StartMigrationResponse</p>
 */
public class StartMigrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartMigrationResponseBody body;

    private StartMigrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartMigrationResponse create() {
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
    public StartMigrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartMigrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartMigrationResponseBody body);

        @Override
        StartMigrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartMigrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartMigrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartMigrationResponse response) {
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
        public Builder body(StartMigrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartMigrationResponse build() {
            return new StartMigrationResponse(this);
        } 

    } 

}
