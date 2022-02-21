// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupResponse</p>
 */
public class DescribeApiGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApiGroupResponseBody body;

    private DescribeApiGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApiGroupResponse create() {
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
    public DescribeApiGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApiGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApiGroupResponseBody body);

        @Override
        DescribeApiGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApiGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApiGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApiGroupResponse response) {
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
        public Builder body(DescribeApiGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApiGroupResponse build() {
            return new DescribeApiGroupResponse(this);
        } 

    } 

}
