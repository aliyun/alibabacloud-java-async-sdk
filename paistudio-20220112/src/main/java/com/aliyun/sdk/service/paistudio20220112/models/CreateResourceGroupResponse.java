// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateResourceGroupResponse</p>
 */
public class CreateResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResourceGroupResponseBody body;

    private CreateResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResourceGroupResponse create() {
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
    public CreateResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResourceGroupResponseBody body);

        @Override
        CreateResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResourceGroupResponse response) {
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
        public Builder body(CreateResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResourceGroupResponse build() {
            return new CreateResourceGroupResponse(this);
        } 

    } 

}
