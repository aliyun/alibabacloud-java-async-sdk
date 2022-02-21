// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachDdosFromAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>DetachDdosFromAcceleratorResponse</p>
 */
public class DetachDdosFromAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachDdosFromAcceleratorResponseBody body;

    private DetachDdosFromAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachDdosFromAcceleratorResponse create() {
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
    public DetachDdosFromAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachDdosFromAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachDdosFromAcceleratorResponseBody body);

        @Override
        DetachDdosFromAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachDdosFromAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachDdosFromAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachDdosFromAcceleratorResponse response) {
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
        public Builder body(DetachDdosFromAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachDdosFromAcceleratorResponse build() {
            return new DetachDdosFromAcceleratorResponse(this);
        } 

    } 

}
