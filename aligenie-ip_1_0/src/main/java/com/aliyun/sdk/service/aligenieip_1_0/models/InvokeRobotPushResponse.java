// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeRobotPushResponse} extends {@link TeaModel}
 *
 * <p>InvokeRobotPushResponse</p>
 */
public class InvokeRobotPushResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvokeRobotPushResponseBody body;

    private InvokeRobotPushResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvokeRobotPushResponse create() {
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
    public InvokeRobotPushResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvokeRobotPushResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvokeRobotPushResponseBody body);

        @Override
        InvokeRobotPushResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvokeRobotPushResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvokeRobotPushResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvokeRobotPushResponse response) {
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
        public Builder body(InvokeRobotPushResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvokeRobotPushResponse build() {
            return new InvokeRobotPushResponse(this);
        } 

    } 

}
