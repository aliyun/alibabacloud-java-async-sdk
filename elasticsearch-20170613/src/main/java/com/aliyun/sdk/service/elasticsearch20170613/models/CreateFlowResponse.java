// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowResponse} extends {@link TeaModel}
 *
 * <p>CreateFlowResponse</p>
 */
public class CreateFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFlowResponseBody body;

    private CreateFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFlowResponse create() {
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
    public CreateFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFlowResponseBody body);

        @Override
        CreateFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFlowResponse response) {
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
        public Builder body(CreateFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFlowResponse build() {
            return new CreateFlowResponse(this);
        } 

    } 

}
