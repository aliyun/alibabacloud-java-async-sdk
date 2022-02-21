// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateAIInstanceResponse</p>
 */
public class CreateAIInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAIInstanceResponseBody body;

    private CreateAIInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAIInstanceResponse create() {
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
    public CreateAIInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAIInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAIInstanceResponseBody body);

        @Override
        CreateAIInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAIInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAIInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAIInstanceResponse response) {
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
        public Builder body(CreateAIInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAIInstanceResponse build() {
            return new CreateAIInstanceResponse(this);
        } 

    } 

}
