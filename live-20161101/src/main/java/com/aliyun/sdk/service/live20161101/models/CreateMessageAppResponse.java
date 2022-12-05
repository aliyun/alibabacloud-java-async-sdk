// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMessageAppResponse} extends {@link TeaModel}
 *
 * <p>CreateMessageAppResponse</p>
 */
public class CreateMessageAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMessageAppResponseBody body;

    private CreateMessageAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMessageAppResponse create() {
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
    public CreateMessageAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMessageAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMessageAppResponseBody body);

        @Override
        CreateMessageAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMessageAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMessageAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMessageAppResponse response) {
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
        public Builder body(CreateMessageAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMessageAppResponse build() {
            return new CreateMessageAppResponse(this);
        } 

    } 

}
