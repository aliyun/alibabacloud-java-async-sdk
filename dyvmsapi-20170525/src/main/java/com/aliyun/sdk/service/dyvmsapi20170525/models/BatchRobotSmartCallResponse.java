// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchRobotSmartCallResponse} extends {@link TeaModel}
 *
 * <p>BatchRobotSmartCallResponse</p>
 */
public class BatchRobotSmartCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchRobotSmartCallResponseBody body;

    private BatchRobotSmartCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchRobotSmartCallResponse create() {
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
    public BatchRobotSmartCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchRobotSmartCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchRobotSmartCallResponseBody body);

        @Override
        BatchRobotSmartCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchRobotSmartCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchRobotSmartCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchRobotSmartCallResponse response) {
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
        public Builder body(BatchRobotSmartCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchRobotSmartCallResponse build() {
            return new BatchRobotSmartCallResponse(this);
        } 

    } 

}
