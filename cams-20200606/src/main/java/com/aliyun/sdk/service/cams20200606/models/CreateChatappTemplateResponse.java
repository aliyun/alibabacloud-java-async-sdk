// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChatappTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateChatappTemplateResponse</p>
 */
public class CreateChatappTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateChatappTemplateResponseBody body;

    private CreateChatappTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateChatappTemplateResponse create() {
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
    public CreateChatappTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateChatappTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateChatappTemplateResponseBody body);

        @Override
        CreateChatappTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateChatappTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateChatappTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateChatappTemplateResponse response) {
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
        public Builder body(CreateChatappTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateChatappTemplateResponse build() {
            return new CreateChatappTemplateResponse(this);
        } 

    } 

}
