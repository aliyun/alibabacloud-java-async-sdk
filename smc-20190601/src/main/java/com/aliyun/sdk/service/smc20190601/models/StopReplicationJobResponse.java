// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopReplicationJobResponse} extends {@link TeaModel}
 *
 * <p>StopReplicationJobResponse</p>
 */
public class StopReplicationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopReplicationJobResponseBody body;

    private StopReplicationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopReplicationJobResponse create() {
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
    public StopReplicationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopReplicationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopReplicationJobResponseBody body);

        @Override
        StopReplicationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopReplicationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopReplicationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopReplicationJobResponse response) {
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
        public Builder body(StopReplicationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopReplicationJobResponse build() {
            return new StopReplicationJobResponse(this);
        } 

    } 

}
