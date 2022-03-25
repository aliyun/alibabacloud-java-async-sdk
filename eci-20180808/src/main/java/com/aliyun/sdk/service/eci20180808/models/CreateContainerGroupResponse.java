// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContainerGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateContainerGroupResponse</p>
 */
public class CreateContainerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateContainerGroupResponseBody body;

    private CreateContainerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateContainerGroupResponse create() {
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
    public CreateContainerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateContainerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateContainerGroupResponseBody body);

        @Override
        CreateContainerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateContainerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateContainerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateContainerGroupResponse response) {
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
        public Builder body(CreateContainerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateContainerGroupResponse build() {
            return new CreateContainerGroupResponse(this);
        } 

    } 

}
