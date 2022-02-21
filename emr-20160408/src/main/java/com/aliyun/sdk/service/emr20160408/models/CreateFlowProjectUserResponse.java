// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowProjectUserResponse} extends {@link TeaModel}
 *
 * <p>CreateFlowProjectUserResponse</p>
 */
public class CreateFlowProjectUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFlowProjectUserResponseBody body;

    private CreateFlowProjectUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFlowProjectUserResponse create() {
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
    public CreateFlowProjectUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFlowProjectUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFlowProjectUserResponseBody body);

        @Override
        CreateFlowProjectUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFlowProjectUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFlowProjectUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFlowProjectUserResponse response) {
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
        public Builder body(CreateFlowProjectUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFlowProjectUserResponse build() {
            return new CreateFlowProjectUserResponse(this);
        } 

    } 

}
