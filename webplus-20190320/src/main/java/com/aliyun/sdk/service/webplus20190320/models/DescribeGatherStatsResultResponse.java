// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatherStatsResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeGatherStatsResultResponse</p>
 */
public class DescribeGatherStatsResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGatherStatsResultResponseBody body;

    private DescribeGatherStatsResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGatherStatsResultResponse create() {
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
    public DescribeGatherStatsResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGatherStatsResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGatherStatsResultResponseBody body);

        @Override
        DescribeGatherStatsResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGatherStatsResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGatherStatsResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGatherStatsResultResponse response) {
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
        public Builder body(DescribeGatherStatsResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGatherStatsResultResponse build() {
            return new DescribeGatherStatsResultResponse(this);
        } 

    } 

}
