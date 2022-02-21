// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateComputeInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateComputeInstanceResponse</p>
 */
public class CreateComputeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateComputeInstanceResponseBody body;

    private CreateComputeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateComputeInstanceResponse create() {
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
    public CreateComputeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateComputeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateComputeInstanceResponseBody body);

        @Override
        CreateComputeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateComputeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateComputeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateComputeInstanceResponse response) {
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
        public Builder body(CreateComputeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateComputeInstanceResponse build() {
            return new CreateComputeInstanceResponse(this);
        } 

    } 

}
