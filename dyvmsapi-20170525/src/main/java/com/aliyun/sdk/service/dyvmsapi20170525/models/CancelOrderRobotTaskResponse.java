// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOrderRobotTaskResponse} extends {@link TeaModel}
 *
 * <p>CancelOrderRobotTaskResponse</p>
 */
public class CancelOrderRobotTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelOrderRobotTaskResponseBody body;

    private CancelOrderRobotTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelOrderRobotTaskResponse create() {
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
    public CancelOrderRobotTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelOrderRobotTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelOrderRobotTaskResponseBody body);

        @Override
        CancelOrderRobotTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelOrderRobotTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelOrderRobotTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelOrderRobotTaskResponse response) {
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
        public Builder body(CancelOrderRobotTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelOrderRobotTaskResponse build() {
            return new CancelOrderRobotTaskResponse(this);
        } 

    } 

}
