// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDialogueFlowResponse} extends {@link TeaModel}
 *
 * <p>CreateDialogueFlowResponse</p>
 */
public class CreateDialogueFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDialogueFlowResponseBody body;

    private CreateDialogueFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDialogueFlowResponse create() {
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
    public CreateDialogueFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDialogueFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDialogueFlowResponseBody body);

        @Override
        CreateDialogueFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDialogueFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDialogueFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDialogueFlowResponse response) {
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
        public Builder body(CreateDialogueFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDialogueFlowResponse build() {
            return new CreateDialogueFlowResponse(this);
        } 

    } 

}
