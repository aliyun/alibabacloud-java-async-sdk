// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectApplicationMonitorResponse} extends {@link TeaModel}
 *
 * <p>DetectApplicationMonitorResponse</p>
 */
public class DetectApplicationMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetectApplicationMonitorResponseBody body;

    private DetectApplicationMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetectApplicationMonitorResponse create() {
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
    public DetectApplicationMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetectApplicationMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetectApplicationMonitorResponseBody body);

        @Override
        DetectApplicationMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetectApplicationMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetectApplicationMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetectApplicationMonitorResponse response) {
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
        public Builder body(DetectApplicationMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetectApplicationMonitorResponse build() {
            return new DetectApplicationMonitorResponse(this);
        } 

    } 

}
