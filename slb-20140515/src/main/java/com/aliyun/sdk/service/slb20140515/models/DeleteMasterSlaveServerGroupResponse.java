// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMasterSlaveServerGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteMasterSlaveServerGroupResponse</p>
 */
public class DeleteMasterSlaveServerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMasterSlaveServerGroupResponseBody body;

    private DeleteMasterSlaveServerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMasterSlaveServerGroupResponse create() {
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
    public DeleteMasterSlaveServerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMasterSlaveServerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMasterSlaveServerGroupResponseBody body);

        @Override
        DeleteMasterSlaveServerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMasterSlaveServerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMasterSlaveServerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMasterSlaveServerGroupResponse response) {
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
        public Builder body(DeleteMasterSlaveServerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMasterSlaveServerGroupResponse build() {
            return new DeleteMasterSlaveServerGroupResponse(this);
        } 

    } 

}
