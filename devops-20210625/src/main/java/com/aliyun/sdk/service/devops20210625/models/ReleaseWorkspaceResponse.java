// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>ReleaseWorkspaceResponse</p>
 */
public class ReleaseWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseWorkspaceResponseBody body;

    private ReleaseWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseWorkspaceResponse create() {
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
    public ReleaseWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseWorkspaceResponseBody body);

        @Override
        ReleaseWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseWorkspaceResponse response) {
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
        public Builder body(ReleaseWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseWorkspaceResponse build() {
            return new ReleaseWorkspaceResponse(this);
        } 

    } 

}
