// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHealthCheckTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateHealthCheckTemplateResponse</p>
 */
public class CreateHealthCheckTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHealthCheckTemplateResponseBody body;

    private CreateHealthCheckTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHealthCheckTemplateResponse create() {
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
    public CreateHealthCheckTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHealthCheckTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHealthCheckTemplateResponseBody body);

        @Override
        CreateHealthCheckTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHealthCheckTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHealthCheckTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHealthCheckTemplateResponse response) {
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
        public Builder body(CreateHealthCheckTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHealthCheckTemplateResponse build() {
            return new CreateHealthCheckTemplateResponse(this);
        } 

    } 

}
