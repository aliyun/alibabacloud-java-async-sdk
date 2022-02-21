// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAIAppResponse} extends {@link TeaModel}
 *
 * <p>RemoveAIAppResponse</p>
 */
public class RemoveAIAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveAIAppResponseBody body;

    private RemoveAIAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveAIAppResponse create() {
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
    public RemoveAIAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveAIAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveAIAppResponseBody body);

        @Override
        RemoveAIAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveAIAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveAIAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveAIAppResponse response) {
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
        public Builder body(RemoveAIAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveAIAppResponse build() {
            return new RemoveAIAppResponse(this);
        } 

    } 

}
