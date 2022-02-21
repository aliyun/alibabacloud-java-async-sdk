// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoSyncTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateRepoSyncTaskResponse</p>
 */
public class CreateRepoSyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRepoSyncTaskResponseBody body;

    private CreateRepoSyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRepoSyncTaskResponse create() {
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
    public CreateRepoSyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRepoSyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRepoSyncTaskResponseBody body);

        @Override
        CreateRepoSyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRepoSyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRepoSyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRepoSyncTaskResponse response) {
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
        public Builder body(CreateRepoSyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRepoSyncTaskResponse build() {
            return new CreateRepoSyncTaskResponse(this);
        } 

    } 

}
