// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LeaveSecurityGroupResponse} extends {@link TeaModel}
 *
 * <p>LeaveSecurityGroupResponse</p>
 */
public class LeaveSecurityGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LeaveSecurityGroupResponseBody body;

    private LeaveSecurityGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LeaveSecurityGroupResponse create() {
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
    public LeaveSecurityGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LeaveSecurityGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LeaveSecurityGroupResponseBody body);

        @Override
        LeaveSecurityGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LeaveSecurityGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LeaveSecurityGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LeaveSecurityGroupResponse response) {
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
        public Builder body(LeaveSecurityGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LeaveSecurityGroupResponse build() {
            return new LeaveSecurityGroupResponse(this);
        } 

    } 

}
