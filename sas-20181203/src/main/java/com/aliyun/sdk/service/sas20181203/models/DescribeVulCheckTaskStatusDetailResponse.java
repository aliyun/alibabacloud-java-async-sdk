// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulCheckTaskStatusDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeVulCheckTaskStatusDetailResponse</p>
 */
public class DescribeVulCheckTaskStatusDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVulCheckTaskStatusDetailResponseBody body;

    private DescribeVulCheckTaskStatusDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVulCheckTaskStatusDetailResponse create() {
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
    public DescribeVulCheckTaskStatusDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVulCheckTaskStatusDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVulCheckTaskStatusDetailResponseBody body);

        @Override
        DescribeVulCheckTaskStatusDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVulCheckTaskStatusDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVulCheckTaskStatusDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVulCheckTaskStatusDetailResponse response) {
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
        public Builder body(DescribeVulCheckTaskStatusDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVulCheckTaskStatusDetailResponse build() {
            return new DescribeVulCheckTaskStatusDetailResponse(this);
        } 

    } 

}
