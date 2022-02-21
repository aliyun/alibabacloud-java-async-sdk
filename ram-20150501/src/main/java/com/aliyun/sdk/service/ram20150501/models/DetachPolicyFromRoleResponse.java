// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachPolicyFromRoleResponse} extends {@link TeaModel}
 *
 * <p>DetachPolicyFromRoleResponse</p>
 */
public class DetachPolicyFromRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachPolicyFromRoleResponseBody body;

    private DetachPolicyFromRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachPolicyFromRoleResponse create() {
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
    public DetachPolicyFromRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachPolicyFromRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachPolicyFromRoleResponseBody body);

        @Override
        DetachPolicyFromRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachPolicyFromRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachPolicyFromRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachPolicyFromRoleResponse response) {
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
        public Builder body(DetachPolicyFromRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachPolicyFromRoleResponse build() {
            return new DetachPolicyFromRoleResponse(this);
        } 

    } 

}
