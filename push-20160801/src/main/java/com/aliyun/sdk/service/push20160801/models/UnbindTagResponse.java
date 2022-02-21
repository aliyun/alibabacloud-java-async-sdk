// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindTagResponse} extends {@link TeaModel}
 *
 * <p>UnbindTagResponse</p>
 */
public class UnbindTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindTagResponseBody body;

    private UnbindTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindTagResponse create() {
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
    public UnbindTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindTagResponseBody body);

        @Override
        UnbindTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindTagResponse response) {
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
        public Builder body(UnbindTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindTagResponse build() {
            return new UnbindTagResponse(this);
        } 

    } 

}
