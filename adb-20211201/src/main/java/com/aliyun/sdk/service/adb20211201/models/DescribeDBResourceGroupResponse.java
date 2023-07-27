// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBResourceGroupResponse</p>
 */
public class DescribeDBResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBResourceGroupResponseBody body;

    private DescribeDBResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBResourceGroupResponse create() {
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
    public DescribeDBResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBResourceGroupResponseBody body);

        @Override
        DescribeDBResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBResourceGroupResponse response) {
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
        public Builder body(DescribeDBResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBResourceGroupResponse build() {
            return new DescribeDBResourceGroupResponse(this);
        } 

    } 

}
