// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeactivateMediaWorkflowResponse} extends {@link TeaModel}
 *
 * <p>DeactivateMediaWorkflowResponse</p>
 */
public class DeactivateMediaWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeactivateMediaWorkflowResponseBody body;

    private DeactivateMediaWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeactivateMediaWorkflowResponse create() {
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
    public DeactivateMediaWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeactivateMediaWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeactivateMediaWorkflowResponseBody body);

        @Override
        DeactivateMediaWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeactivateMediaWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeactivateMediaWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeactivateMediaWorkflowResponse response) {
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
        public Builder body(DeactivateMediaWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeactivateMediaWorkflowResponse build() {
            return new DeactivateMediaWorkflowResponse(this);
        } 

    } 

}
