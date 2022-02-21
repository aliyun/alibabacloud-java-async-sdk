// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateClusterResponse</p>
 */
public class CreateClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateClusterResponseBody body;

    private CreateClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateClusterResponse create() {
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
    public CreateClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateClusterResponseBody body);

        @Override
        CreateClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClusterResponse response) {
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
        public Builder body(CreateClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClusterResponse build() {
            return new CreateClusterResponse(this);
        } 

    } 

}
