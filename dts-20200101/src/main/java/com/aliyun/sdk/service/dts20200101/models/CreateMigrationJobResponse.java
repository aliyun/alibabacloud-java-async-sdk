// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrationJobResponse} extends {@link TeaModel}
 *
 * <p>CreateMigrationJobResponse</p>
 */
public class CreateMigrationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMigrationJobResponseBody body;

    private CreateMigrationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMigrationJobResponse create() {
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
    public CreateMigrationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMigrationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMigrationJobResponseBody body);

        @Override
        CreateMigrationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMigrationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMigrationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMigrationJobResponse response) {
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
        public Builder body(CreateMigrationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMigrationJobResponse build() {
            return new CreateMigrationJobResponse(this);
        } 

    } 

}
