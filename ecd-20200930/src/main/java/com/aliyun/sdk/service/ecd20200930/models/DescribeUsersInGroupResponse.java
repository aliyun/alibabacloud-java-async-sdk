// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersInGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeUsersInGroupResponse</p>
 */
public class DescribeUsersInGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUsersInGroupResponseBody body;

    private DescribeUsersInGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUsersInGroupResponse create() {
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
    public DescribeUsersInGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUsersInGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUsersInGroupResponseBody body);

        @Override
        DescribeUsersInGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUsersInGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUsersInGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUsersInGroupResponse response) {
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
        public Builder body(DescribeUsersInGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUsersInGroupResponse build() {
            return new DescribeUsersInGroupResponse(this);
        } 

    } 

}
