// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevopsProjectResponse} extends {@link TeaModel}
 *
 * <p>CreateDevopsProjectResponse</p>
 */
public class CreateDevopsProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDevopsProjectResponseBody body;

    private CreateDevopsProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDevopsProjectResponse create() {
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
    public CreateDevopsProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDevopsProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDevopsProjectResponseBody body);

        @Override
        CreateDevopsProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDevopsProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDevopsProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDevopsProjectResponse response) {
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
        public Builder body(CreateDevopsProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDevopsProjectResponse build() {
            return new CreateDevopsProjectResponse(this);
        } 

    } 

}
