// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartContainerGroupResponse} extends {@link TeaModel}
 *
 * <p>RestartContainerGroupResponse</p>
 */
public class RestartContainerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartContainerGroupResponseBody body;

    private RestartContainerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartContainerGroupResponse create() {
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
    public RestartContainerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartContainerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartContainerGroupResponseBody body);

        @Override
        RestartContainerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartContainerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartContainerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartContainerGroupResponse response) {
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
        public Builder body(RestartContainerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartContainerGroupResponse build() {
            return new RestartContainerGroupResponse(this);
        } 

    } 

}
