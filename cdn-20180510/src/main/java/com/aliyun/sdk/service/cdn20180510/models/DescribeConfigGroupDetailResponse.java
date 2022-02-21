// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigGroupDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigGroupDetailResponse</p>
 */
public class DescribeConfigGroupDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigGroupDetailResponseBody body;

    private DescribeConfigGroupDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigGroupDetailResponse create() {
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
    public DescribeConfigGroupDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigGroupDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigGroupDetailResponseBody body);

        @Override
        DescribeConfigGroupDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigGroupDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigGroupDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigGroupDetailResponse response) {
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
        public Builder body(DescribeConfigGroupDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigGroupDetailResponse build() {
            return new DescribeConfigGroupDetailResponse(this);
        } 

    } 

}
