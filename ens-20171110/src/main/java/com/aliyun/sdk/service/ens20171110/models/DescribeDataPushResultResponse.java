// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataPushResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataPushResultResponse</p>
 */
public class DescribeDataPushResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataPushResultResponseBody body;

    private DescribeDataPushResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataPushResultResponse create() {
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
    public DescribeDataPushResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataPushResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataPushResultResponseBody body);

        @Override
        DescribeDataPushResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataPushResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataPushResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataPushResultResponse response) {
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
        public Builder body(DescribeDataPushResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataPushResultResponse build() {
            return new DescribeDataPushResultResponse(this);
        } 

    } 

}
