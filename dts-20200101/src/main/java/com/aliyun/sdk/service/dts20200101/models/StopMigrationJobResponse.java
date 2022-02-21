// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMigrationJobResponse} extends {@link TeaModel}
 *
 * <p>StopMigrationJobResponse</p>
 */
public class StopMigrationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopMigrationJobResponseBody body;

    private StopMigrationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopMigrationJobResponse create() {
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
    public StopMigrationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopMigrationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopMigrationJobResponseBody body);

        @Override
        StopMigrationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopMigrationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopMigrationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopMigrationJobResponse response) {
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
        public Builder body(StopMigrationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopMigrationJobResponse build() {
            return new StopMigrationJobResponse(this);
        } 

    } 

}
