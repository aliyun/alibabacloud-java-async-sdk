// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMasterSlaveServerGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateMasterSlaveServerGroupResponse</p>
 */
public class CreateMasterSlaveServerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMasterSlaveServerGroupResponseBody body;

    private CreateMasterSlaveServerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMasterSlaveServerGroupResponse create() {
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
    public CreateMasterSlaveServerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMasterSlaveServerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMasterSlaveServerGroupResponseBody body);

        @Override
        CreateMasterSlaveServerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMasterSlaveServerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMasterSlaveServerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMasterSlaveServerGroupResponse response) {
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
        public Builder body(CreateMasterSlaveServerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMasterSlaveServerGroupResponse build() {
            return new CreateMasterSlaveServerGroupResponse(this);
        } 

    } 

}
