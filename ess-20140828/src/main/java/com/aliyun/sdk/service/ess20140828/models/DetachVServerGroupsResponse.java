// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachVServerGroupsResponse} extends {@link TeaModel}
 *
 * <p>DetachVServerGroupsResponse</p>
 */
public class DetachVServerGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachVServerGroupsResponseBody body;

    private DetachVServerGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachVServerGroupsResponse create() {
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
    public DetachVServerGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachVServerGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachVServerGroupsResponseBody body);

        @Override
        DetachVServerGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachVServerGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachVServerGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachVServerGroupsResponse response) {
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
        public Builder body(DetachVServerGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachVServerGroupsResponse build() {
            return new DetachVServerGroupsResponse(this);
        } 

    } 

}
