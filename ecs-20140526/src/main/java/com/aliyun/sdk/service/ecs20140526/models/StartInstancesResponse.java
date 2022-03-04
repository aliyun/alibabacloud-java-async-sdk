// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartInstancesResponse} extends {@link TeaModel}
 *
 * <p>StartInstancesResponse</p>
 */
public class StartInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartInstancesResponseBody body;

    private StartInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartInstancesResponse create() {
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
    public StartInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartInstancesResponseBody body);

        @Override
        StartInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartInstancesResponse response) {
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
        public Builder body(StartInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartInstancesResponse build() {
            return new StartInstancesResponse(this);
        } 

    } 

}
