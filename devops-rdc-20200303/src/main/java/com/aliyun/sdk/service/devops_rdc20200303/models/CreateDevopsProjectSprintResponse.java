// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevopsProjectSprintResponse} extends {@link TeaModel}
 *
 * <p>CreateDevopsProjectSprintResponse</p>
 */
public class CreateDevopsProjectSprintResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDevopsProjectSprintResponseBody body;

    private CreateDevopsProjectSprintResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDevopsProjectSprintResponse create() {
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
    public CreateDevopsProjectSprintResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDevopsProjectSprintResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDevopsProjectSprintResponseBody body);

        @Override
        CreateDevopsProjectSprintResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDevopsProjectSprintResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDevopsProjectSprintResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDevopsProjectSprintResponse response) {
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
        public Builder body(CreateDevopsProjectSprintResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDevopsProjectSprintResponse build() {
            return new CreateDevopsProjectSprintResponse(this);
        } 

    } 

}
