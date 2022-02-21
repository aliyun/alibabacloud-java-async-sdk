// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecordLifecycleActionHeartbeatResponse} extends {@link TeaModel}
 *
 * <p>RecordLifecycleActionHeartbeatResponse</p>
 */
public class RecordLifecycleActionHeartbeatResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecordLifecycleActionHeartbeatResponseBody body;

    private RecordLifecycleActionHeartbeatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecordLifecycleActionHeartbeatResponse create() {
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
    public RecordLifecycleActionHeartbeatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecordLifecycleActionHeartbeatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecordLifecycleActionHeartbeatResponseBody body);

        @Override
        RecordLifecycleActionHeartbeatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecordLifecycleActionHeartbeatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecordLifecycleActionHeartbeatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecordLifecycleActionHeartbeatResponse response) {
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
        public Builder body(RecordLifecycleActionHeartbeatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecordLifecycleActionHeartbeatResponse build() {
            return new RecordLifecycleActionHeartbeatResponse(this);
        } 

    } 

}
