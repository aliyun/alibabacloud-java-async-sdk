// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomTemplateResponse</p>
 */
public class CreateCustomTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomTemplateResponseBody body;

    private CreateCustomTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomTemplateResponse create() {
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
    public CreateCustomTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomTemplateResponseBody body);

        @Override
        CreateCustomTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomTemplateResponse response) {
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
        public Builder body(CreateCustomTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomTemplateResponse build() {
            return new CreateCustomTemplateResponse(this);
        } 

    } 

}
