// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveTagResponse} extends {@link TeaModel}
 *
 * <p>RemoveTagResponse</p>
 */
public class RemoveTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveTagResponseBody body;

    private RemoveTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveTagResponse create() {
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
    public RemoveTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveTagResponseBody body);

        @Override
        RemoveTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveTagResponse response) {
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
        public Builder body(RemoveTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveTagResponse build() {
            return new RemoveTagResponse(this);
        } 

    } 

}
