// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepositoryCommitResponse} extends {@link TeaModel}
 *
 * <p>GetRepositoryCommitResponse</p>
 */
public class GetRepositoryCommitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRepositoryCommitResponseBody body;

    private GetRepositoryCommitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRepositoryCommitResponse create() {
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
    public GetRepositoryCommitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRepositoryCommitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRepositoryCommitResponseBody body);

        @Override
        GetRepositoryCommitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRepositoryCommitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRepositoryCommitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRepositoryCommitResponse response) {
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
        public Builder body(GetRepositoryCommitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRepositoryCommitResponse build() {
            return new GetRepositoryCommitResponse(this);
        } 

    } 

}
