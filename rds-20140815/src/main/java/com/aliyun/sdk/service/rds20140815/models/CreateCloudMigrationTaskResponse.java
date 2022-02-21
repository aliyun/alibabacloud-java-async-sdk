// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudMigrationTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateCloudMigrationTaskResponse</p>
 */
public class CreateCloudMigrationTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCloudMigrationTaskResponseBody body;

    private CreateCloudMigrationTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCloudMigrationTaskResponse create() {
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
    public CreateCloudMigrationTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCloudMigrationTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCloudMigrationTaskResponseBody body);

        @Override
        CreateCloudMigrationTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCloudMigrationTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCloudMigrationTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCloudMigrationTaskResponse response) {
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
        public Builder body(CreateCloudMigrationTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCloudMigrationTaskResponse build() {
            return new CreateCloudMigrationTaskResponse(this);
        } 

    } 

}
