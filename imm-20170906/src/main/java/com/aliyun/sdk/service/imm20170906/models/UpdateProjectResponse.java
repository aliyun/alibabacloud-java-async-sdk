// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectResponse} extends {@link TeaModel}
 *
 * <p>UpdateProjectResponse</p>
 */
public class UpdateProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProjectResponseBody body;

    private UpdateProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProjectResponse create() {
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
    public UpdateProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProjectResponseBody body);

        @Override
        UpdateProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProjectResponse response) {
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
        public Builder body(UpdateProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProjectResponse build() {
            return new UpdateProjectResponse(this);
        } 

    } 

}
