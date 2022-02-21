// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotMonitorDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotMonitorDataResponse</p>
 */
public class DescribeSnapshotMonitorDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSnapshotMonitorDataResponseBody body;

    private DescribeSnapshotMonitorDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSnapshotMonitorDataResponse create() {
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
    public DescribeSnapshotMonitorDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSnapshotMonitorDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSnapshotMonitorDataResponseBody body);

        @Override
        DescribeSnapshotMonitorDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSnapshotMonitorDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSnapshotMonitorDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSnapshotMonitorDataResponse response) {
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
        public Builder body(DescribeSnapshotMonitorDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSnapshotMonitorDataResponse build() {
            return new DescribeSnapshotMonitorDataResponse(this);
        } 

    } 

}
