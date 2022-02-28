// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectStackResourceDriftResponse} extends {@link TeaModel}
 *
 * <p>DetectStackResourceDriftResponse</p>
 */
public class DetectStackResourceDriftResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetectStackResourceDriftResponseBody body;

    private DetectStackResourceDriftResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetectStackResourceDriftResponse create() {
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
    public DetectStackResourceDriftResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetectStackResourceDriftResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetectStackResourceDriftResponseBody body);

        @Override
        DetectStackResourceDriftResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetectStackResourceDriftResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetectStackResourceDriftResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetectStackResourceDriftResponse response) {
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
        public Builder body(DetectStackResourceDriftResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetectStackResourceDriftResponse build() {
            return new DetectStackResourceDriftResponse(this);
        } 

    } 

}
