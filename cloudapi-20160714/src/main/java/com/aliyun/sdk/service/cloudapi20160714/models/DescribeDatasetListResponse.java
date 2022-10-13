// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatasetListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDatasetListResponse</p>
 */
public class DescribeDatasetListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDatasetListResponseBody body;

    private DescribeDatasetListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDatasetListResponse create() {
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
    public DescribeDatasetListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDatasetListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDatasetListResponseBody body);

        @Override
        DescribeDatasetListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDatasetListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDatasetListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDatasetListResponse response) {
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
        public Builder body(DescribeDatasetListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDatasetListResponse build() {
            return new DescribeDatasetListResponse(this);
        } 

    } 

}
