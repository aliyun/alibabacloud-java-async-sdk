// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveImageResponse} extends {@link TeaModel}
 *
 * <p>RemoveImageResponse</p>
 */
public class RemoveImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveImageResponseBody body;

    private RemoveImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveImageResponse create() {
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
    public RemoveImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveImageResponseBody body);

        @Override
        RemoveImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveImageResponse response) {
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
        public Builder body(RemoveImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveImageResponse build() {
            return new RemoveImageResponse(this);
        } 

    } 

}
