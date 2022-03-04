// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateActivationResponse} extends {@link TeaModel}
 *
 * <p>CreateActivationResponse</p>
 */
public class CreateActivationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateActivationResponseBody body;

    private CreateActivationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateActivationResponse create() {
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
    public CreateActivationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateActivationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateActivationResponseBody body);

        @Override
        CreateActivationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateActivationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateActivationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateActivationResponse response) {
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
        public Builder body(CreateActivationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateActivationResponse build() {
            return new CreateActivationResponse(this);
        } 

    } 

}
