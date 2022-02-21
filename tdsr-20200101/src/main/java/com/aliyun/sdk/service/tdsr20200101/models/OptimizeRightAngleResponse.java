// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OptimizeRightAngleResponse} extends {@link TeaModel}
 *
 * <p>OptimizeRightAngleResponse</p>
 */
public class OptimizeRightAngleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OptimizeRightAngleResponseBody body;

    private OptimizeRightAngleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OptimizeRightAngleResponse create() {
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
    public OptimizeRightAngleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OptimizeRightAngleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OptimizeRightAngleResponseBody body);

        @Override
        OptimizeRightAngleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OptimizeRightAngleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OptimizeRightAngleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OptimizeRightAngleResponse response) {
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
        public Builder body(OptimizeRightAngleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OptimizeRightAngleResponse build() {
            return new OptimizeRightAngleResponse(this);
        } 

    } 

}
