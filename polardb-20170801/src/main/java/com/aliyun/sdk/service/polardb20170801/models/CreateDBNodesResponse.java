// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBNodesResponse} extends {@link TeaModel}
 *
 * <p>CreateDBNodesResponse</p>
 */
public class CreateDBNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDBNodesResponseBody body;

    private CreateDBNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDBNodesResponse create() {
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
    public CreateDBNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDBNodesResponseBody body);

        @Override
        CreateDBNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDBNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBNodesResponse response) {
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
        public Builder body(CreateDBNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBNodesResponse build() {
            return new CreateDBNodesResponse(this);
        } 

    } 

}
