// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrateTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateMigrateTaskResponse</p>
 */
public class CreateMigrateTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMigrateTaskResponseBody body;

    private CreateMigrateTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMigrateTaskResponse create() {
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
    public CreateMigrateTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMigrateTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMigrateTaskResponseBody body);

        @Override
        CreateMigrateTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMigrateTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMigrateTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMigrateTaskResponse response) {
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
        public Builder body(CreateMigrateTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMigrateTaskResponse build() {
            return new CreateMigrateTaskResponse(this);
        } 

    } 

}
