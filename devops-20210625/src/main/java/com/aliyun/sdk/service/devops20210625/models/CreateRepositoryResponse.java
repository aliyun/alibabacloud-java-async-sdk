// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepositoryResponse} extends {@link TeaModel}
 *
 * <p>CreateRepositoryResponse</p>
 */
public class CreateRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRepositoryResponseBody body;

    private CreateRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRepositoryResponse create() {
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
    public CreateRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRepositoryResponseBody body);

        @Override
        CreateRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRepositoryResponse response) {
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
        public Builder body(CreateRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRepositoryResponse build() {
            return new CreateRepositoryResponse(this);
        } 

    } 

}
