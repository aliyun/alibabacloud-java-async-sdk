// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendMigrationJobResponse} extends {@link TeaModel}
 *
 * <p>SuspendMigrationJobResponse</p>
 */
public class SuspendMigrationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendMigrationJobResponseBody body;

    private SuspendMigrationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendMigrationJobResponse create() {
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
    public SuspendMigrationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendMigrationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendMigrationJobResponseBody body);

        @Override
        SuspendMigrationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendMigrationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendMigrationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendMigrationJobResponse response) {
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
        public Builder body(SuspendMigrationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendMigrationJobResponse build() {
            return new SuspendMigrationJobResponse(this);
        } 

    } 

}
