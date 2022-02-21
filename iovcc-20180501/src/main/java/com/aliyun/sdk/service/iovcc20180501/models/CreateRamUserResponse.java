// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRamUserResponse} extends {@link TeaModel}
 *
 * <p>CreateRamUserResponse</p>
 */
public class CreateRamUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRamUserResponseBody body;

    private CreateRamUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRamUserResponse create() {
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
    public CreateRamUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRamUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRamUserResponseBody body);

        @Override
        CreateRamUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRamUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRamUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRamUserResponse response) {
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
        public Builder body(CreateRamUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRamUserResponse build() {
            return new CreateRamUserResponse(this);
        } 

    } 

}
