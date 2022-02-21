// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartRobotTaskResponse} extends {@link TeaModel}
 *
 * <p>StartRobotTaskResponse</p>
 */
public class StartRobotTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartRobotTaskResponseBody body;

    private StartRobotTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartRobotTaskResponse create() {
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
    public StartRobotTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartRobotTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartRobotTaskResponseBody body);

        @Override
        StartRobotTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartRobotTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartRobotTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartRobotTaskResponse response) {
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
        public Builder body(StartRobotTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartRobotTaskResponse build() {
            return new StartRobotTaskResponse(this);
        } 

    } 

}
