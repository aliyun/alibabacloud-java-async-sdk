// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDefaultWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>UpdateDefaultWorkspaceResponse</p>
 */
public class UpdateDefaultWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDefaultWorkspaceResponseBody body;

    private UpdateDefaultWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDefaultWorkspaceResponse create() {
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
    public UpdateDefaultWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDefaultWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDefaultWorkspaceResponseBody body);

        @Override
        UpdateDefaultWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDefaultWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDefaultWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDefaultWorkspaceResponse response) {
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
        public Builder body(UpdateDefaultWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDefaultWorkspaceResponse build() {
            return new UpdateDefaultWorkspaceResponse(this);
        } 

    } 

}
