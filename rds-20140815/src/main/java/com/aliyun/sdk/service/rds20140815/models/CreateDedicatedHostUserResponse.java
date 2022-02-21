// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostUserResponse} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostUserResponse</p>
 */
public class CreateDedicatedHostUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDedicatedHostUserResponseBody body;

    private CreateDedicatedHostUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDedicatedHostUserResponse create() {
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
    public CreateDedicatedHostUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDedicatedHostUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDedicatedHostUserResponseBody body);

        @Override
        CreateDedicatedHostUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDedicatedHostUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDedicatedHostUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDedicatedHostUserResponse response) {
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
        public Builder body(CreateDedicatedHostUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDedicatedHostUserResponse build() {
            return new CreateDedicatedHostUserResponse(this);
        } 

    } 

}
