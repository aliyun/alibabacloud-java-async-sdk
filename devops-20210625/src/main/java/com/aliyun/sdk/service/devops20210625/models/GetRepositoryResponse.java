// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepositoryResponse} extends {@link TeaModel}
 *
 * <p>GetRepositoryResponse</p>
 */
public class GetRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRepositoryResponseBody body;

    private GetRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRepositoryResponse create() {
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
    public GetRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRepositoryResponseBody body);

        @Override
        GetRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRepositoryResponse response) {
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
        public Builder body(GetRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRepositoryResponse build() {
            return new GetRepositoryResponse(this);
        } 

    } 

}
