// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeJobGroupResponse</p>
 */
public class DescribeJobGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeJobGroupResponseBody body;

    private DescribeJobGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeJobGroupResponse create() {
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
    public DescribeJobGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeJobGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeJobGroupResponseBody body);

        @Override
        DescribeJobGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeJobGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeJobGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeJobGroupResponse response) {
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
        public Builder body(DescribeJobGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeJobGroupResponse build() {
            return new DescribeJobGroupResponse(this);
        } 

    } 

}
