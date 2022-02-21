// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStatisticalDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeStatisticalDataResponse</p>
 */
public class DescribeStatisticalDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStatisticalDataResponseBody body;

    private DescribeStatisticalDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStatisticalDataResponse create() {
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
    public DescribeStatisticalDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStatisticalDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStatisticalDataResponseBody body);

        @Override
        DescribeStatisticalDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStatisticalDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStatisticalDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStatisticalDataResponse response) {
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
        public Builder body(DescribeStatisticalDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStatisticalDataResponse build() {
            return new DescribeStatisticalDataResponse(this);
        } 

    } 

}
