// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateScratchResponse} extends {@link TeaModel}
 *
 * <p>CreateTemplateScratchResponse</p>
 */
public class CreateTemplateScratchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTemplateScratchResponseBody body;

    private CreateTemplateScratchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTemplateScratchResponse create() {
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
    public CreateTemplateScratchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTemplateScratchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTemplateScratchResponseBody body);

        @Override
        CreateTemplateScratchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTemplateScratchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTemplateScratchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTemplateScratchResponse response) {
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
        public Builder body(CreateTemplateScratchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTemplateScratchResponse build() {
            return new CreateTemplateScratchResponse(this);
        } 

    } 

}
