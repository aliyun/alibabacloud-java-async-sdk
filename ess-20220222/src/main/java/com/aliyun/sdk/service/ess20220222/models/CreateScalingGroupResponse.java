// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateScalingGroupResponse</p>
 */
public class CreateScalingGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateScalingGroupResponseBody body;

    private CreateScalingGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateScalingGroupResponse create() {
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
    public CreateScalingGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateScalingGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateScalingGroupResponseBody body);

        @Override
        CreateScalingGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateScalingGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateScalingGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateScalingGroupResponse response) {
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
        public Builder body(CreateScalingGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateScalingGroupResponse build() {
            return new CreateScalingGroupResponse(this);
        } 

    } 

}
