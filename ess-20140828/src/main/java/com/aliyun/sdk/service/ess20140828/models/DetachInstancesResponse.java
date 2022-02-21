// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachInstancesResponse} extends {@link TeaModel}
 *
 * <p>DetachInstancesResponse</p>
 */
public class DetachInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachInstancesResponseBody body;

    private DetachInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachInstancesResponse create() {
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
    public DetachInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachInstancesResponseBody body);

        @Override
        DetachInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachInstancesResponse response) {
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
        public Builder body(DetachInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachInstancesResponse build() {
            return new DetachInstancesResponse(this);
        } 

    } 

}
