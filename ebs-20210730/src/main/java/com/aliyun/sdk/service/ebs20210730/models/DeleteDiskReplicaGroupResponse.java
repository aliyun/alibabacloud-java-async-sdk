// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDiskReplicaGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteDiskReplicaGroupResponse</p>
 */
public class DeleteDiskReplicaGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDiskReplicaGroupResponseBody body;

    private DeleteDiskReplicaGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDiskReplicaGroupResponse create() {
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
    public DeleteDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDiskReplicaGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDiskReplicaGroupResponseBody body);

        @Override
        DeleteDiskReplicaGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDiskReplicaGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDiskReplicaGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDiskReplicaGroupResponse response) {
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
        public Builder body(DeleteDiskReplicaGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDiskReplicaGroupResponse build() {
            return new DeleteDiskReplicaGroupResponse(this);
        } 

    } 

}
