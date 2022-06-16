// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppDetailResponse</p>
 */
public class DescribeAppDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppDetailResponseBody body;

    private DescribeAppDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppDetailResponse create() {
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
    public DescribeAppDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppDetailResponseBody body);

        @Override
        DescribeAppDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppDetailResponse response) {
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
        public Builder body(DescribeAppDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppDetailResponse build() {
            return new DescribeAppDetailResponse(this);
        } 

    } 

}
