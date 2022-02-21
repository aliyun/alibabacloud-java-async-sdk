// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReprotectDiskReplicaGroupResponse} extends {@link TeaModel}
 *
 * <p>ReprotectDiskReplicaGroupResponse</p>
 */
public class ReprotectDiskReplicaGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReprotectDiskReplicaGroupResponseBody body;

    private ReprotectDiskReplicaGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReprotectDiskReplicaGroupResponse create() {
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
    public ReprotectDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReprotectDiskReplicaGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReprotectDiskReplicaGroupResponseBody body);

        @Override
        ReprotectDiskReplicaGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReprotectDiskReplicaGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReprotectDiskReplicaGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReprotectDiskReplicaGroupResponse response) {
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
        public Builder body(ReprotectDiskReplicaGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReprotectDiskReplicaGroupResponse build() {
            return new ReprotectDiskReplicaGroupResponse(this);
        } 

    } 

}
