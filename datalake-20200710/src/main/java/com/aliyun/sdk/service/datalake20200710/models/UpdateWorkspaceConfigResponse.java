// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkspaceConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkspaceConfigResponse</p>
 */
public class UpdateWorkspaceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkspaceConfigResponseBody body;

    private UpdateWorkspaceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWorkspaceConfigResponse create() {
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
    public UpdateWorkspaceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkspaceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWorkspaceConfigResponseBody body);

        @Override
        UpdateWorkspaceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkspaceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWorkspaceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkspaceConfigResponse response) {
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
        public Builder body(UpdateWorkspaceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkspaceConfigResponse build() {
            return new UpdateWorkspaceConfigResponse(this);
        } 

    } 

}
