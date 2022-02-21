// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateAppTemplateResponse</p>
 */
public class CreateAppTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAppTemplateResponseBody body;

    private CreateAppTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAppTemplateResponse create() {
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
    public CreateAppTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAppTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAppTemplateResponseBody body);

        @Override
        CreateAppTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAppTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAppTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAppTemplateResponse response) {
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
        public Builder body(CreateAppTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAppTemplateResponse build() {
            return new CreateAppTemplateResponse(this);
        } 

    } 

}
