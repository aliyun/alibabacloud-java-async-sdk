// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceDetailResponse</p>
 */
public class DescribeServiceDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceDetailResponseBody body;

    private DescribeServiceDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceDetailResponse create() {
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
    public DescribeServiceDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceDetailResponseBody body);

        @Override
        DescribeServiceDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceDetailResponse response) {
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
        public Builder body(DescribeServiceDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceDetailResponse build() {
            return new DescribeServiceDetailResponse(this);
        } 

    } 

}
