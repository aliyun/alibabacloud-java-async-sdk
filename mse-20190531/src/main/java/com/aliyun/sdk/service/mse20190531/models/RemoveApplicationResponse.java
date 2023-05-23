// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveApplicationResponse} extends {@link TeaModel}
 *
 * <p>RemoveApplicationResponse</p>
 */
public class RemoveApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveApplicationResponseBody body;

    private RemoveApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveApplicationResponse create() {
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
    public RemoveApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveApplicationResponseBody body);

        @Override
        RemoveApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveApplicationResponse response) {
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
        public Builder body(RemoveApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveApplicationResponse build() {
            return new RemoveApplicationResponse(this);
        } 

    } 

}
