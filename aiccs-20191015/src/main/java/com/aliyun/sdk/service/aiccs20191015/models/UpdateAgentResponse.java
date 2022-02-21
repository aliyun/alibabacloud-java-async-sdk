// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAgentResponse} extends {@link TeaModel}
 *
 * <p>UpdateAgentResponse</p>
 */
public class UpdateAgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAgentResponseBody body;

    private UpdateAgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAgentResponse create() {
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
    public UpdateAgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAgentResponseBody body);

        @Override
        UpdateAgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAgentResponse response) {
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
        public Builder body(UpdateAgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAgentResponse build() {
            return new UpdateAgentResponse(this);
        } 

    } 

}
