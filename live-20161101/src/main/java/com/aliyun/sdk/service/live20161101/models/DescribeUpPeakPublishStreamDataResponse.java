// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpPeakPublishStreamDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeUpPeakPublishStreamDataResponse</p>
 */
public class DescribeUpPeakPublishStreamDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUpPeakPublishStreamDataResponseBody body;

    private DescribeUpPeakPublishStreamDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUpPeakPublishStreamDataResponse create() {
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
    public DescribeUpPeakPublishStreamDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUpPeakPublishStreamDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUpPeakPublishStreamDataResponseBody body);

        @Override
        DescribeUpPeakPublishStreamDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUpPeakPublishStreamDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUpPeakPublishStreamDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUpPeakPublishStreamDataResponse response) {
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
        public Builder body(DescribeUpPeakPublishStreamDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUpPeakPublishStreamDataResponse build() {
            return new DescribeUpPeakPublishStreamDataResponse(this);
        } 

    } 

}
