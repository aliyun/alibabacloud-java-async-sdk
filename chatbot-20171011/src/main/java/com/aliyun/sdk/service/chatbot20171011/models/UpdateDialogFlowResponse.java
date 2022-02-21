// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDialogFlowResponse} extends {@link TeaModel}
 *
 * <p>UpdateDialogFlowResponse</p>
 */
public class UpdateDialogFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDialogFlowResponseBody body;

    private UpdateDialogFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDialogFlowResponse create() {
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
    public UpdateDialogFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDialogFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDialogFlowResponseBody body);

        @Override
        UpdateDialogFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDialogFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDialogFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDialogFlowResponse response) {
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
        public Builder body(UpdateDialogFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDialogFlowResponse build() {
            return new UpdateDialogFlowResponse(this);
        } 

    } 

}
