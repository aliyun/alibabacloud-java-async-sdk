// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaWorkflowTriggerModeResponse} extends {@link TeaModel}
 *
 * <p>UpdateMediaWorkflowTriggerModeResponse</p>
 */
public class UpdateMediaWorkflowTriggerModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMediaWorkflowTriggerModeResponseBody body;

    private UpdateMediaWorkflowTriggerModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMediaWorkflowTriggerModeResponse create() {
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
    public UpdateMediaWorkflowTriggerModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMediaWorkflowTriggerModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMediaWorkflowTriggerModeResponseBody body);

        @Override
        UpdateMediaWorkflowTriggerModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMediaWorkflowTriggerModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMediaWorkflowTriggerModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMediaWorkflowTriggerModeResponse response) {
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
        public Builder body(UpdateMediaWorkflowTriggerModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMediaWorkflowTriggerModeResponse build() {
            return new UpdateMediaWorkflowTriggerModeResponse(this);
        } 

    } 

}
