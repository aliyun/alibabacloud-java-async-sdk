// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIAppResponse} extends {@link TeaModel}
 *
 * <p>CreateAIAppResponse</p>
 */
public class CreateAIAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAIAppResponseBody body;

    private CreateAIAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAIAppResponse create() {
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
    public CreateAIAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAIAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAIAppResponseBody body);

        @Override
        CreateAIAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAIAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAIAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAIAppResponse response) {
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
        public Builder body(CreateAIAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAIAppResponse build() {
            return new CreateAIAppResponse(this);
        } 

    } 

}
