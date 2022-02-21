// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachEaiResponse} extends {@link TeaModel}
 *
 * <p>DetachEaiResponse</p>
 */
public class DetachEaiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachEaiResponseBody body;

    private DetachEaiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachEaiResponse create() {
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
    public DetachEaiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachEaiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachEaiResponseBody body);

        @Override
        DetachEaiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachEaiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachEaiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachEaiResponse response) {
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
        public Builder body(DetachEaiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachEaiResponse build() {
            return new DetachEaiResponse(this);
        } 

    } 

}
