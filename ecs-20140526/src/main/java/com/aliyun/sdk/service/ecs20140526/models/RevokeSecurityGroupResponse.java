// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeSecurityGroupResponse} extends {@link TeaModel}
 *
 * <p>RevokeSecurityGroupResponse</p>
 */
public class RevokeSecurityGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeSecurityGroupResponseBody body;

    private RevokeSecurityGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeSecurityGroupResponse create() {
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
    public RevokeSecurityGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeSecurityGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeSecurityGroupResponseBody body);

        @Override
        RevokeSecurityGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeSecurityGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeSecurityGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeSecurityGroupResponse response) {
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
        public Builder body(RevokeSecurityGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeSecurityGroupResponse build() {
            return new RevokeSecurityGroupResponse(this);
        } 

    } 

}
