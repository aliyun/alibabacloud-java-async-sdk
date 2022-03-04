// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotPackageResponse} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotPackageResponse</p>
 */
public class DescribeSnapshotPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSnapshotPackageResponseBody body;

    private DescribeSnapshotPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSnapshotPackageResponse create() {
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
    public DescribeSnapshotPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSnapshotPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSnapshotPackageResponseBody body);

        @Override
        DescribeSnapshotPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSnapshotPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSnapshotPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSnapshotPackageResponse response) {
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
        public Builder body(DescribeSnapshotPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSnapshotPackageResponse build() {
            return new DescribeSnapshotPackageResponse(this);
        } 

    } 

}
