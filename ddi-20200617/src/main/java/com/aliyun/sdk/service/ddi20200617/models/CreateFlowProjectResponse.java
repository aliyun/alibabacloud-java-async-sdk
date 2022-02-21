// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowProjectResponse} extends {@link TeaModel}
 *
 * <p>CreateFlowProjectResponse</p>
 */
public class CreateFlowProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFlowProjectResponseBody body;

    private CreateFlowProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFlowProjectResponse create() {
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
    public CreateFlowProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFlowProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFlowProjectResponseBody body);

        @Override
        CreateFlowProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFlowProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFlowProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFlowProjectResponse response) {
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
        public Builder body(CreateFlowProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFlowProjectResponse build() {
            return new CreateFlowProjectResponse(this);
        } 

    } 

}
