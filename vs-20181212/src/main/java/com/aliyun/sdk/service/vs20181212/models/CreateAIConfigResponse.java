// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateAIConfigResponse</p>
 */
public class CreateAIConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAIConfigResponseBody body;

    private CreateAIConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAIConfigResponse create() {
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
    public CreateAIConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAIConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAIConfigResponseBody body);

        @Override
        CreateAIConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAIConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAIConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAIConfigResponse response) {
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
        public Builder body(CreateAIConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAIConfigResponse build() {
            return new CreateAIConfigResponse(this);
        } 

    } 

}
