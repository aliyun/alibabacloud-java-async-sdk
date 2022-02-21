// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTimeTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateTimeTemplateResponse</p>
 */
public class CreateTimeTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTimeTemplateResponseBody body;

    private CreateTimeTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTimeTemplateResponse create() {
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
    public CreateTimeTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTimeTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTimeTemplateResponseBody body);

        @Override
        CreateTimeTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTimeTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTimeTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTimeTemplateResponse response) {
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
        public Builder body(CreateTimeTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTimeTemplateResponse build() {
            return new CreateTimeTemplateResponse(this);
        } 

    } 

}
