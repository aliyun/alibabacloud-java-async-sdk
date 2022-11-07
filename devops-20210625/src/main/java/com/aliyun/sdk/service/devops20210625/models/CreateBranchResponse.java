// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBranchResponse} extends {@link TeaModel}
 *
 * <p>CreateBranchResponse</p>
 */
public class CreateBranchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBranchResponseBody body;

    private CreateBranchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBranchResponse create() {
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
    public CreateBranchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBranchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBranchResponseBody body);

        @Override
        CreateBranchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBranchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBranchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBranchResponse response) {
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
        public Builder body(CreateBranchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBranchResponse build() {
            return new CreateBranchResponse(this);
        } 

    } 

}
