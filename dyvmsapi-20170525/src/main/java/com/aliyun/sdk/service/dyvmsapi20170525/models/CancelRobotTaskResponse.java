// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelRobotTaskResponse} extends {@link TeaModel}
 *
 * <p>CancelRobotTaskResponse</p>
 */
public class CancelRobotTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelRobotTaskResponseBody body;

    private CancelRobotTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelRobotTaskResponse create() {
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
    public CancelRobotTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelRobotTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelRobotTaskResponseBody body);

        @Override
        CancelRobotTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelRobotTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelRobotTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelRobotTaskResponse response) {
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
        public Builder body(CancelRobotTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelRobotTaskResponse build() {
            return new CancelRobotTaskResponse(this);
        } 

    } 

}
