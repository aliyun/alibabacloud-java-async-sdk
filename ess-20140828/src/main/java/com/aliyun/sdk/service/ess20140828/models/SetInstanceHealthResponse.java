// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstanceHealthResponse} extends {@link TeaModel}
 *
 * <p>SetInstanceHealthResponse</p>
 */
public class SetInstanceHealthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetInstanceHealthResponseBody body;

    private SetInstanceHealthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetInstanceHealthResponse create() {
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
    public SetInstanceHealthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetInstanceHealthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetInstanceHealthResponseBody body);

        @Override
        SetInstanceHealthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetInstanceHealthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetInstanceHealthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetInstanceHealthResponse response) {
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
        public Builder body(SetInstanceHealthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetInstanceHealthResponse build() {
            return new SetInstanceHealthResponse(this);
        } 

    } 

}
