// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableScalingGroupResponse} extends {@link TeaModel}
 *
 * <p>DisableScalingGroupResponse</p>
 */
public class DisableScalingGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableScalingGroupResponseBody body;

    private DisableScalingGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableScalingGroupResponse create() {
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
    public DisableScalingGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableScalingGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableScalingGroupResponseBody body);

        @Override
        DisableScalingGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableScalingGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableScalingGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableScalingGroupResponse response) {
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
        public Builder body(DisableScalingGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableScalingGroupResponse build() {
            return new DisableScalingGroupResponse(this);
        } 

    } 

}
