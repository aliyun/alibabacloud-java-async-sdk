// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateTemplateResponse</p>
 */
public class CreateTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTemplateResponseBody body;

    private CreateTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTemplateResponse create() {
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
    public CreateTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTemplateResponseBody body);

        @Override
        CreateTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTemplateResponse response) {
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
        public Builder body(CreateTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTemplateResponse build() {
            return new CreateTemplateResponse(this);
        } 

    } 

}
