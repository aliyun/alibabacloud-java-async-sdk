// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveVersionOfConfigGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeActiveVersionOfConfigGroupResponse</p>
 */
public class DescribeActiveVersionOfConfigGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeActiveVersionOfConfigGroupResponseBody body;

    private DescribeActiveVersionOfConfigGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeActiveVersionOfConfigGroupResponse create() {
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
    public DescribeActiveVersionOfConfigGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeActiveVersionOfConfigGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeActiveVersionOfConfigGroupResponseBody body);

        @Override
        DescribeActiveVersionOfConfigGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeActiveVersionOfConfigGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeActiveVersionOfConfigGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeActiveVersionOfConfigGroupResponse response) {
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
        public Builder body(DescribeActiveVersionOfConfigGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeActiveVersionOfConfigGroupResponse build() {
            return new DescribeActiveVersionOfConfigGroupResponse(this);
        } 

    } 

}
