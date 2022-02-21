// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDiskReplicaGroupResponse} extends {@link TeaModel}
 *
 * <p>StartDiskReplicaGroupResponse</p>
 */
public class StartDiskReplicaGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDiskReplicaGroupResponseBody body;

    private StartDiskReplicaGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDiskReplicaGroupResponse create() {
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
    public StartDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDiskReplicaGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDiskReplicaGroupResponseBody body);

        @Override
        StartDiskReplicaGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDiskReplicaGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDiskReplicaGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDiskReplicaGroupResponse response) {
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
        public Builder body(StartDiskReplicaGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDiskReplicaGroupResponse build() {
            return new StartDiskReplicaGroupResponse(this);
        } 

    } 

}
