// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevopsProjectTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateDevopsProjectTaskResponse</p>
 */
public class CreateDevopsProjectTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDevopsProjectTaskResponseBody body;

    private CreateDevopsProjectTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDevopsProjectTaskResponse create() {
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
    public CreateDevopsProjectTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDevopsProjectTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDevopsProjectTaskResponseBody body);

        @Override
        CreateDevopsProjectTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDevopsProjectTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDevopsProjectTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDevopsProjectTaskResponse response) {
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
        public Builder body(CreateDevopsProjectTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDevopsProjectTaskResponse build() {
            return new CreateDevopsProjectTaskResponse(this);
        } 

    } 

}
