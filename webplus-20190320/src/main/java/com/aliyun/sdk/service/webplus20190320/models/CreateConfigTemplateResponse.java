// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateConfigTemplateResponse</p>
 */
public class CreateConfigTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateConfigTemplateResponseBody body;

    private CreateConfigTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateConfigTemplateResponse create() {
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
    public CreateConfigTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateConfigTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateConfigTemplateResponseBody body);

        @Override
        CreateConfigTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateConfigTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateConfigTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateConfigTemplateResponse response) {
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
        public Builder body(CreateConfigTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateConfigTemplateResponse build() {
            return new CreateConfigTemplateResponse(this);
        } 

    } 

}
