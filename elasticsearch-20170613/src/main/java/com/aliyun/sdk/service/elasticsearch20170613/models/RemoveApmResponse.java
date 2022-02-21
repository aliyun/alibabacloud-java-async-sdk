// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveApmResponse} extends {@link TeaModel}
 *
 * <p>RemoveApmResponse</p>
 */
public class RemoveApmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveApmResponseBody body;

    private RemoveApmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveApmResponse create() {
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
    public RemoveApmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveApmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveApmResponseBody body);

        @Override
        RemoveApmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveApmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveApmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveApmResponse response) {
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
        public Builder body(RemoveApmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveApmResponse build() {
            return new RemoveApmResponse(this);
        } 

    } 

}
