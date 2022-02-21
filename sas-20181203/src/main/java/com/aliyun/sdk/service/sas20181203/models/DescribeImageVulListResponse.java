// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageVulListResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageVulListResponse</p>
 */
public class DescribeImageVulListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageVulListResponseBody body;

    private DescribeImageVulListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageVulListResponse create() {
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
    public DescribeImageVulListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageVulListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageVulListResponseBody body);

        @Override
        DescribeImageVulListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageVulListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageVulListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageVulListResponse response) {
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
        public Builder body(DescribeImageVulListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageVulListResponse build() {
            return new DescribeImageVulListResponse(this);
        } 

    } 

}
