// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStackInstancesResponse} extends {@link TeaModel}
 *
 * <p>CreateStackInstancesResponse</p>
 */
public class CreateStackInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateStackInstancesResponseBody body;

    private CreateStackInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateStackInstancesResponse create() {
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
    public CreateStackInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateStackInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateStackInstancesResponseBody body);

        @Override
        CreateStackInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateStackInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateStackInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateStackInstancesResponse response) {
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
        public Builder body(CreateStackInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateStackInstancesResponse build() {
            return new CreateStackInstancesResponse(this);
        } 

    } 

}
