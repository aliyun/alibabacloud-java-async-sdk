// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FrozenWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>FrozenWorkspaceResponse</p>
 */
public class FrozenWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FrozenWorkspaceResponseBody body;

    private FrozenWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FrozenWorkspaceResponse create() {
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
    public FrozenWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FrozenWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FrozenWorkspaceResponseBody body);

        @Override
        FrozenWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FrozenWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FrozenWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FrozenWorkspaceResponse response) {
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
        public Builder body(FrozenWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FrozenWorkspaceResponse build() {
            return new FrozenWorkspaceResponse(this);
        } 

    } 

}
