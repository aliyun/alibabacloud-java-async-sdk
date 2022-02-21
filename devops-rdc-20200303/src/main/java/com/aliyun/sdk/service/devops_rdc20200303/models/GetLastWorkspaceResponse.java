// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLastWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>GetLastWorkspaceResponse</p>
 */
public class GetLastWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLastWorkspaceResponseBody body;

    private GetLastWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLastWorkspaceResponse create() {
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
    public GetLastWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLastWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLastWorkspaceResponseBody body);

        @Override
        GetLastWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLastWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLastWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLastWorkspaceResponse response) {
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
        public Builder body(GetLastWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLastWorkspaceResponse build() {
            return new GetLastWorkspaceResponse(this);
        } 

    } 

}
