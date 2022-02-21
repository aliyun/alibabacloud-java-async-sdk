// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingTaskGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyScalingTaskGroupResponse</p>
 */
public class ModifyScalingTaskGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyScalingTaskGroupResponseBody body;

    private ModifyScalingTaskGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyScalingTaskGroupResponse create() {
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
    public ModifyScalingTaskGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyScalingTaskGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyScalingTaskGroupResponseBody body);

        @Override
        ModifyScalingTaskGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyScalingTaskGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyScalingTaskGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyScalingTaskGroupResponse response) {
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
        public Builder body(ModifyScalingTaskGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyScalingTaskGroupResponse build() {
            return new ModifyScalingTaskGroupResponse(this);
        } 

    } 

}
