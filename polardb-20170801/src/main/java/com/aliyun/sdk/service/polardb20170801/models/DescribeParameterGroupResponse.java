// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupResponse</p>
 */
public class DescribeParameterGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeParameterGroupResponseBody body;

    private DescribeParameterGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeParameterGroupResponse create() {
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
    public DescribeParameterGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeParameterGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeParameterGroupResponseBody body);

        @Override
        DescribeParameterGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeParameterGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeParameterGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeParameterGroupResponse response) {
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
        public Builder body(DescribeParameterGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeParameterGroupResponse build() {
            return new DescribeParameterGroupResponse(this);
        } 

    } 

}
