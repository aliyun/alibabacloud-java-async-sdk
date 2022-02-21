// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishDialogFlowResponse} extends {@link TeaModel}
 *
 * <p>PublishDialogFlowResponse</p>
 */
public class PublishDialogFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishDialogFlowResponseBody body;

    private PublishDialogFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishDialogFlowResponse create() {
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
    public PublishDialogFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishDialogFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishDialogFlowResponseBody body);

        @Override
        PublishDialogFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishDialogFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishDialogFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishDialogFlowResponse response) {
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
        public Builder body(PublishDialogFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishDialogFlowResponse build() {
            return new PublishDialogFlowResponse(this);
        } 

    } 

}
