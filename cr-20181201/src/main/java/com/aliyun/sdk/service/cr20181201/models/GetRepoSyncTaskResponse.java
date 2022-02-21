// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoSyncTaskResponse} extends {@link TeaModel}
 *
 * <p>GetRepoSyncTaskResponse</p>
 */
public class GetRepoSyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRepoSyncTaskResponseBody body;

    private GetRepoSyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRepoSyncTaskResponse create() {
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
    public GetRepoSyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRepoSyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRepoSyncTaskResponseBody body);

        @Override
        GetRepoSyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRepoSyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRepoSyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRepoSyncTaskResponse response) {
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
        public Builder body(GetRepoSyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRepoSyncTaskResponse build() {
            return new GetRepoSyncTaskResponse(this);
        } 

    } 

}
