// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotLinksResponse} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotLinksResponse</p>
 */
public class DescribeSnapshotLinksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSnapshotLinksResponseBody body;

    private DescribeSnapshotLinksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSnapshotLinksResponse create() {
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
    public DescribeSnapshotLinksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSnapshotLinksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSnapshotLinksResponseBody body);

        @Override
        DescribeSnapshotLinksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSnapshotLinksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSnapshotLinksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSnapshotLinksResponse response) {
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
        public Builder body(DescribeSnapshotLinksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSnapshotLinksResponse build() {
            return new DescribeSnapshotLinksResponse(this);
        } 

    } 

}
