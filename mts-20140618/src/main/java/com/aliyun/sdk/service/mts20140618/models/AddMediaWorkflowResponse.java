// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMediaWorkflowResponse} extends {@link TeaModel}
 *
 * <p>AddMediaWorkflowResponse</p>
 */
public class AddMediaWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMediaWorkflowResponseBody body;

    private AddMediaWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMediaWorkflowResponse create() {
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
    public AddMediaWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMediaWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMediaWorkflowResponseBody body);

        @Override
        AddMediaWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMediaWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMediaWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMediaWorkflowResponse response) {
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
        public Builder body(AddMediaWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMediaWorkflowResponse build() {
            return new AddMediaWorkflowResponse(this);
        } 

    } 

}
