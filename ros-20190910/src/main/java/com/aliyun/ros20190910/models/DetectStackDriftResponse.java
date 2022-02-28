// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectStackDriftResponse} extends {@link TeaModel}
 *
 * <p>DetectStackDriftResponse</p>
 */
public class DetectStackDriftResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetectStackDriftResponseBody body;

    private DetectStackDriftResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetectStackDriftResponse create() {
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
    public DetectStackDriftResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetectStackDriftResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetectStackDriftResponseBody body);

        @Override
        DetectStackDriftResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetectStackDriftResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetectStackDriftResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetectStackDriftResponse response) {
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
        public Builder body(DetectStackDriftResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetectStackDriftResponse build() {
            return new DetectStackDriftResponse(this);
        } 

    } 

}
