// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulListResponse} extends {@link TeaModel}
 *
 * <p>DescribeVulListResponse</p>
 */
public class DescribeVulListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVulListResponseBody body;

    private DescribeVulListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVulListResponse create() {
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
    public DescribeVulListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVulListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVulListResponseBody body);

        @Override
        DescribeVulListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVulListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVulListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVulListResponse response) {
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
        public Builder body(DescribeVulListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVulListResponse build() {
            return new DescribeVulListResponse(this);
        } 

    } 

}
