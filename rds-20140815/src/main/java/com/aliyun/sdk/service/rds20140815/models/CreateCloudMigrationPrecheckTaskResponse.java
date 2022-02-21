// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudMigrationPrecheckTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateCloudMigrationPrecheckTaskResponse</p>
 */
public class CreateCloudMigrationPrecheckTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCloudMigrationPrecheckTaskResponseBody body;

    private CreateCloudMigrationPrecheckTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCloudMigrationPrecheckTaskResponse create() {
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
    public CreateCloudMigrationPrecheckTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCloudMigrationPrecheckTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCloudMigrationPrecheckTaskResponseBody body);

        @Override
        CreateCloudMigrationPrecheckTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCloudMigrationPrecheckTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCloudMigrationPrecheckTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCloudMigrationPrecheckTaskResponse response) {
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
        public Builder body(CreateCloudMigrationPrecheckTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCloudMigrationPrecheckTaskResponse build() {
            return new CreateCloudMigrationPrecheckTaskResponse(this);
        } 

    } 

}
