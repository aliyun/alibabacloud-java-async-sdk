// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoTagResponse} extends {@link TeaModel}
 *
 * <p>CreateRepoTagResponse</p>
 */
public class CreateRepoTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRepoTagResponseBody body;

    private CreateRepoTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRepoTagResponse create() {
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
    public CreateRepoTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRepoTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRepoTagResponseBody body);

        @Override
        CreateRepoTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRepoTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRepoTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRepoTagResponse response) {
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
        public Builder body(CreateRepoTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRepoTagResponse build() {
            return new CreateRepoTagResponse(this);
        } 

    } 

}
