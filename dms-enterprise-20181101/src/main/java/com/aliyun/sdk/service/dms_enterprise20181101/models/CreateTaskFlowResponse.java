// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskFlowResponse} extends {@link TeaModel}
 *
 * <p>CreateTaskFlowResponse</p>
 */
public class CreateTaskFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTaskFlowResponseBody body;

    private CreateTaskFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTaskFlowResponse create() {
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
    public CreateTaskFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTaskFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTaskFlowResponseBody body);

        @Override
        CreateTaskFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTaskFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTaskFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTaskFlowResponse response) {
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
        public Builder body(CreateTaskFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTaskFlowResponse build() {
            return new CreateTaskFlowResponse(this);
        } 

    } 

}
