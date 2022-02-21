// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeSecurityGroupEgressResponse} extends {@link TeaModel}
 *
 * <p>RevokeSecurityGroupEgressResponse</p>
 */
public class RevokeSecurityGroupEgressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeSecurityGroupEgressResponseBody body;

    private RevokeSecurityGroupEgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeSecurityGroupEgressResponse create() {
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
    public RevokeSecurityGroupEgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeSecurityGroupEgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeSecurityGroupEgressResponseBody body);

        @Override
        RevokeSecurityGroupEgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeSecurityGroupEgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeSecurityGroupEgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeSecurityGroupEgressResponse response) {
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
        public Builder body(RevokeSecurityGroupEgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeSecurityGroupEgressResponse build() {
            return new RevokeSecurityGroupEgressResponse(this);
        } 

    } 

}
