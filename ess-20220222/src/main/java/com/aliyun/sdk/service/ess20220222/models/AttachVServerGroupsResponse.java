// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachVServerGroupsResponse} extends {@link TeaModel}
 *
 * <p>AttachVServerGroupsResponse</p>
 */
public class AttachVServerGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachVServerGroupsResponseBody body;

    private AttachVServerGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachVServerGroupsResponse create() {
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
    public AttachVServerGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachVServerGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachVServerGroupsResponseBody body);

        @Override
        AttachVServerGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachVServerGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachVServerGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachVServerGroupsResponse response) {
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
        public Builder body(AttachVServerGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachVServerGroupsResponse build() {
            return new AttachVServerGroupsResponse(this);
        } 

    } 

}
