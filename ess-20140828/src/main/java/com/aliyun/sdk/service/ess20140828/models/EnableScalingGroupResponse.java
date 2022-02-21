// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableScalingGroupResponse} extends {@link TeaModel}
 *
 * <p>EnableScalingGroupResponse</p>
 */
public class EnableScalingGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableScalingGroupResponseBody body;

    private EnableScalingGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableScalingGroupResponse create() {
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
    public EnableScalingGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableScalingGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableScalingGroupResponseBody body);

        @Override
        EnableScalingGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableScalingGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableScalingGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableScalingGroupResponse response) {
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
        public Builder body(EnableScalingGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableScalingGroupResponse build() {
            return new EnableScalingGroupResponse(this);
        } 

    } 

}
