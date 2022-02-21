// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrateTaskForSQLServerResponse} extends {@link TeaModel}
 *
 * <p>CreateMigrateTaskForSQLServerResponse</p>
 */
public class CreateMigrateTaskForSQLServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMigrateTaskForSQLServerResponseBody body;

    private CreateMigrateTaskForSQLServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMigrateTaskForSQLServerResponse create() {
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
    public CreateMigrateTaskForSQLServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMigrateTaskForSQLServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMigrateTaskForSQLServerResponseBody body);

        @Override
        CreateMigrateTaskForSQLServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMigrateTaskForSQLServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMigrateTaskForSQLServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMigrateTaskForSQLServerResponse response) {
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
        public Builder body(CreateMigrateTaskForSQLServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMigrateTaskForSQLServerResponse build() {
            return new CreateMigrateTaskForSQLServerResponse(this);
        } 

    } 

}
