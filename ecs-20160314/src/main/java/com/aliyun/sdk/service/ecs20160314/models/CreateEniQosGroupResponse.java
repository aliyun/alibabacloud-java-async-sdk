// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEniQosGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateEniQosGroupResponse</p>
 */
public class CreateEniQosGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEniQosGroupResponseBody body;

    private CreateEniQosGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEniQosGroupResponse create() {
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
    public CreateEniQosGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEniQosGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEniQosGroupResponseBody body);

        @Override
        CreateEniQosGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEniQosGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEniQosGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEniQosGroupResponse response) {
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
        public Builder body(CreateEniQosGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEniQosGroupResponse build() {
            return new CreateEniQosGroupResponse(this);
        } 

    } 

}
