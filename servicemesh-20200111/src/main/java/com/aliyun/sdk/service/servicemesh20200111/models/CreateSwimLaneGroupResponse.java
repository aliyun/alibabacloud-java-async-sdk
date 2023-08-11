// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSwimLaneGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateSwimLaneGroupResponse</p>
 */
public class CreateSwimLaneGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSwimLaneGroupResponseBody body;

    private CreateSwimLaneGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSwimLaneGroupResponse create() {
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
    public CreateSwimLaneGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSwimLaneGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSwimLaneGroupResponseBody body);

        @Override
        CreateSwimLaneGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSwimLaneGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSwimLaneGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSwimLaneGroupResponse response) {
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
        public Builder body(CreateSwimLaneGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSwimLaneGroupResponse build() {
            return new CreateSwimLaneGroupResponse(this);
        } 

    } 

}
