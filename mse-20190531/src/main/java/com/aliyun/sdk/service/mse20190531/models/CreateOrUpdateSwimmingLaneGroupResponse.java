// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSwimmingLaneGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateSwimmingLaneGroupResponse</p>
 */
public class CreateOrUpdateSwimmingLaneGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrUpdateSwimmingLaneGroupResponseBody body;

    private CreateOrUpdateSwimmingLaneGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOrUpdateSwimmingLaneGroupResponse create() {
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
    public CreateOrUpdateSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrUpdateSwimmingLaneGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOrUpdateSwimmingLaneGroupResponseBody body);

        @Override
        CreateOrUpdateSwimmingLaneGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrUpdateSwimmingLaneGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrUpdateSwimmingLaneGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrUpdateSwimmingLaneGroupResponse response) {
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
        public Builder body(CreateOrUpdateSwimmingLaneGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrUpdateSwimmingLaneGroupResponse build() {
            return new CreateOrUpdateSwimmingLaneGroupResponse(this);
        } 

    } 

}
