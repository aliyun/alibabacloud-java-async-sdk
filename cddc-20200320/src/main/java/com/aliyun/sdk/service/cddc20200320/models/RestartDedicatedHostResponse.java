// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDedicatedHostResponse} extends {@link TeaModel}
 *
 * <p>RestartDedicatedHostResponse</p>
 */
public class RestartDedicatedHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartDedicatedHostResponseBody body;

    private RestartDedicatedHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartDedicatedHostResponse create() {
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
    public RestartDedicatedHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartDedicatedHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartDedicatedHostResponseBody body);

        @Override
        RestartDedicatedHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartDedicatedHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartDedicatedHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartDedicatedHostResponse response) {
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
        public Builder body(RestartDedicatedHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartDedicatedHostResponse build() {
            return new RestartDedicatedHostResponse(this);
        } 

    } 

}
