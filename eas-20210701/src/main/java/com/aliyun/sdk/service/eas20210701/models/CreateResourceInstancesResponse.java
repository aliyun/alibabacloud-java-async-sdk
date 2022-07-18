// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceInstancesResponse} extends {@link TeaModel}
 *
 * <p>CreateResourceInstancesResponse</p>
 */
public class CreateResourceInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResourceInstancesResponseBody body;

    private CreateResourceInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResourceInstancesResponse create() {
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
    public CreateResourceInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResourceInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResourceInstancesResponseBody body);

        @Override
        CreateResourceInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResourceInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResourceInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResourceInstancesResponse response) {
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
        public Builder body(CreateResourceInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResourceInstancesResponse build() {
            return new CreateResourceInstancesResponse(this);
        } 

    } 

}
