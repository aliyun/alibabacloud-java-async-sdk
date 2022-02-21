// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowEntitySnapshotResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowEntitySnapshotResponse</p>
 */
public class DescribeFlowEntitySnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowEntitySnapshotResponseBody body;

    private DescribeFlowEntitySnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowEntitySnapshotResponse create() {
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
    public DescribeFlowEntitySnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowEntitySnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowEntitySnapshotResponseBody body);

        @Override
        DescribeFlowEntitySnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowEntitySnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowEntitySnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowEntitySnapshotResponse response) {
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
        public Builder body(DescribeFlowEntitySnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowEntitySnapshotResponse build() {
            return new DescribeFlowEntitySnapshotResponse(this);
        } 

    } 

}
