// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAIPlanResponse} extends {@link TeaModel}
 *
 * <p>RemoveAIPlanResponse</p>
 */
public class RemoveAIPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveAIPlanResponseBody body;

    private RemoveAIPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveAIPlanResponse create() {
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
    public RemoveAIPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveAIPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveAIPlanResponseBody body);

        @Override
        RemoveAIPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveAIPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveAIPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveAIPlanResponse response) {
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
        public Builder body(RemoveAIPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveAIPlanResponse build() {
            return new RemoveAIPlanResponse(this);
        } 

    } 

}
