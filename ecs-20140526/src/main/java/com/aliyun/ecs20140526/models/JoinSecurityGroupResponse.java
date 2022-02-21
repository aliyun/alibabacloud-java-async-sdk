// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinSecurityGroupResponse} extends {@link TeaModel}
 *
 * <p>JoinSecurityGroupResponse</p>
 */
public class JoinSecurityGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinSecurityGroupResponseBody body;

    private JoinSecurityGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinSecurityGroupResponse create() {
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
    public JoinSecurityGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinSecurityGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinSecurityGroupResponseBody body);

        @Override
        JoinSecurityGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinSecurityGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinSecurityGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinSecurityGroupResponse response) {
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
        public Builder body(JoinSecurityGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinSecurityGroupResponse build() {
            return new JoinSecurityGroupResponse(this);
        } 

    } 

}
