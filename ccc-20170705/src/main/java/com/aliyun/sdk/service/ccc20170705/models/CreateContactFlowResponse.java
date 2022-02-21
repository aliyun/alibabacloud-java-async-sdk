// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContactFlowResponse} extends {@link TeaModel}
 *
 * <p>CreateContactFlowResponse</p>
 */
public class CreateContactFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateContactFlowResponseBody body;

    private CreateContactFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateContactFlowResponse create() {
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
    public CreateContactFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateContactFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateContactFlowResponseBody body);

        @Override
        CreateContactFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateContactFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateContactFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateContactFlowResponse response) {
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
        public Builder body(CreateContactFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateContactFlowResponse build() {
            return new CreateContactFlowResponse(this);
        } 

    } 

}
