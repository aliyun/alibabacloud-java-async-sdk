// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReActivateInstancesResponse} extends {@link TeaModel}
 *
 * <p>ReActivateInstancesResponse</p>
 */
public class ReActivateInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReActivateInstancesResponseBody body;

    private ReActivateInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReActivateInstancesResponse create() {
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
    public ReActivateInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReActivateInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReActivateInstancesResponseBody body);

        @Override
        ReActivateInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReActivateInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReActivateInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReActivateInstancesResponse response) {
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
        public Builder body(ReActivateInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReActivateInstancesResponse build() {
            return new ReActivateInstancesResponse(this);
        } 

    } 

}
