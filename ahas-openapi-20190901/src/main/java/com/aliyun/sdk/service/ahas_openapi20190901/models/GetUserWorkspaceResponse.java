// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>GetUserWorkspaceResponse</p>
 */
public class GetUserWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserWorkspaceResponseBody body;

    private GetUserWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserWorkspaceResponse create() {
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
    public GetUserWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserWorkspaceResponseBody body);

        @Override
        GetUserWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserWorkspaceResponse response) {
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
        public Builder body(GetUserWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserWorkspaceResponse build() {
            return new GetUserWorkspaceResponse(this);
        } 

    } 

}
