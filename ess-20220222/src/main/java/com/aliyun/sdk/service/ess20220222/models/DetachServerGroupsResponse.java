// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachServerGroupsResponse} extends {@link TeaModel}
 *
 * <p>DetachServerGroupsResponse</p>
 */
public class DetachServerGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachServerGroupsResponseBody body;

    private DetachServerGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachServerGroupsResponse create() {
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
    public DetachServerGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachServerGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachServerGroupsResponseBody body);

        @Override
        DetachServerGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachServerGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachServerGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachServerGroupsResponse response) {
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
        public Builder body(DetachServerGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachServerGroupsResponse build() {
            return new DetachServerGroupsResponse(this);
        } 

    } 

}
