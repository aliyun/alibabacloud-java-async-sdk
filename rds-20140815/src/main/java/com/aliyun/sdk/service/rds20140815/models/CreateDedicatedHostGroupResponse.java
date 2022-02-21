// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostGroupResponse</p>
 */
public class CreateDedicatedHostGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDedicatedHostGroupResponseBody body;

    private CreateDedicatedHostGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDedicatedHostGroupResponse create() {
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
    public CreateDedicatedHostGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDedicatedHostGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDedicatedHostGroupResponseBody body);

        @Override
        CreateDedicatedHostGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDedicatedHostGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDedicatedHostGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDedicatedHostGroupResponse response) {
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
        public Builder body(CreateDedicatedHostGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDedicatedHostGroupResponse build() {
            return new CreateDedicatedHostGroupResponse(this);
        } 

    } 

}
