// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoSnapshotTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeAutoSnapshotTasksResponse</p>
 */
public class DescribeAutoSnapshotTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAutoSnapshotTasksResponseBody body;

    private DescribeAutoSnapshotTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAutoSnapshotTasksResponse create() {
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
    public DescribeAutoSnapshotTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAutoSnapshotTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAutoSnapshotTasksResponseBody body);

        @Override
        DescribeAutoSnapshotTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAutoSnapshotTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAutoSnapshotTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAutoSnapshotTasksResponse response) {
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
        public Builder body(DescribeAutoSnapshotTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAutoSnapshotTasksResponse build() {
            return new DescribeAutoSnapshotTasksResponse(this);
        } 

    } 

}
