// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachDestinationResponse} extends {@link TeaModel}
 *
 * <p>DetachDestinationResponse</p>
 */
public class DetachDestinationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachDestinationResponseBody body;

    private DetachDestinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachDestinationResponse create() {
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
    public DetachDestinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachDestinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachDestinationResponseBody body);

        @Override
        DetachDestinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachDestinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachDestinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachDestinationResponse response) {
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
        public Builder body(DetachDestinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachDestinationResponse build() {
            return new DetachDestinationResponse(this);
        } 

    } 

}
