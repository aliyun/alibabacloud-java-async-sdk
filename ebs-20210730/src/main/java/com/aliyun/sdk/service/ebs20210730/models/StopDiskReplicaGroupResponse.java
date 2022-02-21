// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDiskReplicaGroupResponse} extends {@link TeaModel}
 *
 * <p>StopDiskReplicaGroupResponse</p>
 */
public class StopDiskReplicaGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDiskReplicaGroupResponseBody body;

    private StopDiskReplicaGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDiskReplicaGroupResponse create() {
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
    public StopDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDiskReplicaGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDiskReplicaGroupResponseBody body);

        @Override
        StopDiskReplicaGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDiskReplicaGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDiskReplicaGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDiskReplicaGroupResponse response) {
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
        public Builder body(StopDiskReplicaGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDiskReplicaGroupResponse build() {
            return new StopDiskReplicaGroupResponse(this);
        } 

    } 

}
