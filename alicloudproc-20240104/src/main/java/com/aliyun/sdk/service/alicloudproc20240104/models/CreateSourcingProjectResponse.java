// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSourcingProjectResponse} extends {@link TeaModel}
 *
 * <p>CreateSourcingProjectResponse</p>
 */
public class CreateSourcingProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSourcingProjectResponseBody body;

    private CreateSourcingProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSourcingProjectResponse create() {
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
    public CreateSourcingProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSourcingProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSourcingProjectResponseBody body);

        @Override
        CreateSourcingProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSourcingProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSourcingProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSourcingProjectResponse response) {
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
        public Builder body(CreateSourcingProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSourcingProjectResponse build() {
            return new CreateSourcingProjectResponse(this);
        } 

    } 

}
