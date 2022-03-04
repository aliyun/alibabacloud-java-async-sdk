// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommandResponse} extends {@link TeaModel}
 *
 * <p>CreateCommandResponse</p>
 */
public class CreateCommandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCommandResponseBody body;

    private CreateCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCommandResponse create() {
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
    public CreateCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCommandResponseBody body);

        @Override
        CreateCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCommandResponse response) {
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
        public Builder body(CreateCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCommandResponse build() {
            return new CreateCommandResponse(this);
        } 

    } 

}
