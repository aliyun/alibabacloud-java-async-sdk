// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReplicaPairsResponse} extends {@link TeaModel}
 *
 * <p>DescribeReplicaPairsResponse</p>
 */
public class DescribeReplicaPairsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReplicaPairsResponseBody body;

    private DescribeReplicaPairsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReplicaPairsResponse create() {
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
    public DescribeReplicaPairsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReplicaPairsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReplicaPairsResponseBody body);

        @Override
        DescribeReplicaPairsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReplicaPairsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReplicaPairsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReplicaPairsResponse response) {
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
        public Builder body(DescribeReplicaPairsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReplicaPairsResponse build() {
            return new DescribeReplicaPairsResponse(this);
        } 

    } 

}
