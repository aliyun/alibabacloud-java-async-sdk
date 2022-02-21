// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartMigrationJobResponse} extends {@link TeaModel}
 *
 * <p>StartMigrationJobResponse</p>
 */
public class StartMigrationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartMigrationJobResponseBody body;

    private StartMigrationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartMigrationJobResponse create() {
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
    public StartMigrationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartMigrationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartMigrationJobResponseBody body);

        @Override
        StartMigrationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartMigrationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartMigrationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartMigrationJobResponse response) {
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
        public Builder body(StartMigrationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartMigrationJobResponse build() {
            return new StartMigrationJobResponse(this);
        } 

    } 

}
