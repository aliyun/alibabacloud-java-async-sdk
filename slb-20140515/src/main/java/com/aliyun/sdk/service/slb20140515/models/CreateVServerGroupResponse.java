// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVServerGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateVServerGroupResponse</p>
 */
public class CreateVServerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVServerGroupResponseBody body;

    private CreateVServerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVServerGroupResponse create() {
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
    public CreateVServerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVServerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVServerGroupResponseBody body);

        @Override
        CreateVServerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVServerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVServerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVServerGroupResponse response) {
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
        public Builder body(CreateVServerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVServerGroupResponse build() {
            return new CreateVServerGroupResponse(this);
        } 

    } 

}
