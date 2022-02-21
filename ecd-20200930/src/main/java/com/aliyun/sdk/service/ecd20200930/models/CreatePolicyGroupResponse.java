// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyGroupResponse} extends {@link TeaModel}
 *
 * <p>CreatePolicyGroupResponse</p>
 */
public class CreatePolicyGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePolicyGroupResponseBody body;

    private CreatePolicyGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePolicyGroupResponse create() {
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
    public CreatePolicyGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePolicyGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePolicyGroupResponseBody body);

        @Override
        CreatePolicyGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePolicyGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePolicyGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePolicyGroupResponse response) {
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
        public Builder body(CreatePolicyGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePolicyGroupResponse build() {
            return new CreatePolicyGroupResponse(this);
        } 

    } 

}
