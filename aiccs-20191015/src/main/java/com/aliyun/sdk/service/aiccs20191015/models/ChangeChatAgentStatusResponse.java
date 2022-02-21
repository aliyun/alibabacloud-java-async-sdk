// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeChatAgentStatusResponse} extends {@link TeaModel}
 *
 * <p>ChangeChatAgentStatusResponse</p>
 */
public class ChangeChatAgentStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeChatAgentStatusResponseBody body;

    private ChangeChatAgentStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeChatAgentStatusResponse create() {
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
    public ChangeChatAgentStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeChatAgentStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeChatAgentStatusResponseBody body);

        @Override
        ChangeChatAgentStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeChatAgentStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeChatAgentStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeChatAgentStatusResponse response) {
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
        public Builder body(ChangeChatAgentStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeChatAgentStatusResponse build() {
            return new ChangeChatAgentStatusResponse(this);
        } 

    } 

}
