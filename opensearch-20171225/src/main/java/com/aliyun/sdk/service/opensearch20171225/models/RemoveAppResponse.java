// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAppResponse} extends {@link TeaModel}
 *
 * <p>RemoveAppResponse</p>
 */
public class RemoveAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveAppResponseBody body;

    private RemoveAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveAppResponse create() {
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
    public RemoveAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveAppResponseBody body);

        @Override
        RemoveAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveAppResponse response) {
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
        public Builder body(RemoveAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveAppResponse build() {
            return new RemoveAppResponse(this);
        } 

    } 

}
