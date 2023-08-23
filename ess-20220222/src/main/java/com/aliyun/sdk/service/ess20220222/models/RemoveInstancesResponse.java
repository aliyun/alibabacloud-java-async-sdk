// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveInstancesResponse} extends {@link TeaModel}
 *
 * <p>RemoveInstancesResponse</p>
 */
public class RemoveInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveInstancesResponseBody body;

    private RemoveInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveInstancesResponse create() {
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
    public RemoveInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveInstancesResponseBody body);

        @Override
        RemoveInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveInstancesResponse response) {
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
        public Builder body(RemoveInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveInstancesResponse build() {
            return new RemoveInstancesResponse(this);
        } 

    } 

}
