// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopRobotTaskResponse} extends {@link TeaModel}
 *
 * <p>StopRobotTaskResponse</p>
 */
public class StopRobotTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopRobotTaskResponseBody body;

    private StopRobotTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopRobotTaskResponse create() {
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
    public StopRobotTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopRobotTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopRobotTaskResponseBody body);

        @Override
        StopRobotTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopRobotTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopRobotTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopRobotTaskResponse response) {
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
        public Builder body(StopRobotTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopRobotTaskResponse build() {
            return new StopRobotTaskResponse(this);
        } 

    } 

}
