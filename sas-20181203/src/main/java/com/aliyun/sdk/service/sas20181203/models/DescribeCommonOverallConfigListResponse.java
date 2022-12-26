// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonOverallConfigListResponse} extends {@link TeaModel}
 *
 * <p>DescribeCommonOverallConfigListResponse</p>
 */
public class DescribeCommonOverallConfigListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCommonOverallConfigListResponseBody body;

    private DescribeCommonOverallConfigListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCommonOverallConfigListResponse create() {
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
    public DescribeCommonOverallConfigListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCommonOverallConfigListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCommonOverallConfigListResponseBody body);

        @Override
        DescribeCommonOverallConfigListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCommonOverallConfigListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCommonOverallConfigListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCommonOverallConfigListResponse response) {
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
        public Builder body(DescribeCommonOverallConfigListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCommonOverallConfigListResponse build() {
            return new DescribeCommonOverallConfigListResponse(this);
        } 

    } 

}
