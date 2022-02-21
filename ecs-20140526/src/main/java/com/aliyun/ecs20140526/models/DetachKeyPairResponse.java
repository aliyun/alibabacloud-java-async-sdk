// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachKeyPairResponse} extends {@link TeaModel}
 *
 * <p>DetachKeyPairResponse</p>
 */
public class DetachKeyPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachKeyPairResponseBody body;

    private DetachKeyPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachKeyPairResponse create() {
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
    public DetachKeyPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachKeyPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachKeyPairResponseBody body);

        @Override
        DetachKeyPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachKeyPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachKeyPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachKeyPairResponse response) {
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
        public Builder body(DetachKeyPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachKeyPairResponse build() {
            return new DetachKeyPairResponse(this);
        } 

    } 

}
