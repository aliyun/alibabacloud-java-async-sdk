// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOmsOpenAPIProjectResponse} extends {@link TeaModel}
 *
 * <p>CreateOmsOpenAPIProjectResponse</p>
 */
public class CreateOmsOpenAPIProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOmsOpenAPIProjectResponseBody body;

    private CreateOmsOpenAPIProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOmsOpenAPIProjectResponse create() {
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
    public CreateOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOmsOpenAPIProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOmsOpenAPIProjectResponseBody body);

        @Override
        CreateOmsOpenAPIProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOmsOpenAPIProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOmsOpenAPIProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOmsOpenAPIProjectResponse response) {
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
        public Builder body(CreateOmsOpenAPIProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOmsOpenAPIProjectResponse build() {
            return new CreateOmsOpenAPIProjectResponse(this);
        } 

    } 

}
