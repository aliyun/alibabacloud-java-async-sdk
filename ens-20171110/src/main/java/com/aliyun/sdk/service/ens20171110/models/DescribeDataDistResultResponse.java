// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataDistResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataDistResultResponse</p>
 */
public class DescribeDataDistResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataDistResultResponseBody body;

    private DescribeDataDistResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataDistResultResponse create() {
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
    public DescribeDataDistResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataDistResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataDistResultResponseBody body);

        @Override
        DescribeDataDistResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataDistResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataDistResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataDistResultResponse response) {
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
        public Builder body(DescribeDataDistResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataDistResultResponse build() {
            return new DescribeDataDistResultResponse(this);
        } 

    } 

}
