// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachEndUserResponse} extends {@link TeaModel}
 *
 * <p>DetachEndUserResponse</p>
 */
public class DetachEndUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachEndUserResponseBody body;

    private DetachEndUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachEndUserResponse create() {
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
    public DetachEndUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachEndUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachEndUserResponseBody body);

        @Override
        DetachEndUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachEndUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachEndUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachEndUserResponse response) {
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
        public Builder body(DetachEndUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachEndUserResponse build() {
            return new DetachEndUserResponse(this);
        } 

    } 

}
