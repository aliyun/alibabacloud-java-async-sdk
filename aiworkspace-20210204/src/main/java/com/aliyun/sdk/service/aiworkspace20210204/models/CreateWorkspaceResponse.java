// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>CreateWorkspaceResponse</p>
 */
public class CreateWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWorkspaceResponseBody body;

    private CreateWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWorkspaceResponse create() {
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
    public CreateWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWorkspaceResponseBody body);

        @Override
        CreateWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWorkspaceResponse response) {
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
        public Builder body(CreateWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWorkspaceResponse build() {
            return new CreateWorkspaceResponse(this);
        } 

    } 

}
