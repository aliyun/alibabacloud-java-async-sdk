// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyScalingGroupResponse</p>
 */
public class ModifyScalingGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyScalingGroupResponseBody body;

    private ModifyScalingGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyScalingGroupResponse create() {
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
    public ModifyScalingGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyScalingGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyScalingGroupResponseBody body);

        @Override
        ModifyScalingGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyScalingGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyScalingGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyScalingGroupResponse response) {
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
        public Builder body(ModifyScalingGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyScalingGroupResponse build() {
            return new ModifyScalingGroupResponse(this);
        } 

    } 

}
