// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachInstanceRamRoleResponse} extends {@link TeaModel}
 *
 * <p>AttachInstanceRamRoleResponse</p>
 */
public class AttachInstanceRamRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachInstanceRamRoleResponseBody body;

    private AttachInstanceRamRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachInstanceRamRoleResponse create() {
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
    public AttachInstanceRamRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachInstanceRamRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachInstanceRamRoleResponseBody body);

        @Override
        AttachInstanceRamRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachInstanceRamRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachInstanceRamRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachInstanceRamRoleResponse response) {
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
        public Builder body(AttachInstanceRamRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachInstanceRamRoleResponse build() {
            return new AttachInstanceRamRoleResponse(this);
        } 

    } 

}
