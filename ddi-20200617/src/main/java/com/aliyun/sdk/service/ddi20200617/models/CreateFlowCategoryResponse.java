// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowCategoryResponse} extends {@link TeaModel}
 *
 * <p>CreateFlowCategoryResponse</p>
 */
public class CreateFlowCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFlowCategoryResponseBody body;

    private CreateFlowCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFlowCategoryResponse create() {
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
    public CreateFlowCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFlowCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFlowCategoryResponseBody body);

        @Override
        CreateFlowCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFlowCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFlowCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFlowCategoryResponse response) {
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
        public Builder body(CreateFlowCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFlowCategoryResponse build() {
            return new CreateFlowCategoryResponse(this);
        } 

    } 

}
