// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntentResponse} extends {@link TeaModel}
 *
 * <p>UpdateIntentResponse</p>
 */
public class UpdateIntentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIntentResponseBody body;

    private UpdateIntentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIntentResponse create() {
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
    public UpdateIntentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIntentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIntentResponseBody body);

        @Override
        UpdateIntentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIntentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIntentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIntentResponse response) {
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
        public Builder body(UpdateIntentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIntentResponse build() {
            return new UpdateIntentResponse(this);
        } 

    } 

}
