// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProjectModifyResponse} extends {@link TeaModel}
 *
 * <p>ProjectModifyResponse</p>
 */
public class ProjectModifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ProjectModifyResponseBody body;

    private ProjectModifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ProjectModifyResponse create() {
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
    public ProjectModifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ProjectModifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ProjectModifyResponseBody body);

        @Override
        ProjectModifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ProjectModifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ProjectModifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ProjectModifyResponse response) {
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
        public Builder body(ProjectModifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ProjectModifyResponse build() {
            return new ProjectModifyResponse(this);
        } 

    } 

}
