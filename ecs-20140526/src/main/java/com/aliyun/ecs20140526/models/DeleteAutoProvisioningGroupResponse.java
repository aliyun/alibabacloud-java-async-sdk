// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAutoProvisioningGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteAutoProvisioningGroupResponse</p>
 */
public class DeleteAutoProvisioningGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAutoProvisioningGroupResponseBody body;

    private DeleteAutoProvisioningGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAutoProvisioningGroupResponse create() {
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
    public DeleteAutoProvisioningGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAutoProvisioningGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAutoProvisioningGroupResponseBody body);

        @Override
        DeleteAutoProvisioningGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAutoProvisioningGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAutoProvisioningGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAutoProvisioningGroupResponse response) {
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
        public Builder body(DeleteAutoProvisioningGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAutoProvisioningGroupResponse build() {
            return new DeleteAutoProvisioningGroupResponse(this);
        } 

    } 

}
