// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpBpsPeakDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeUpBpsPeakDataResponse</p>
 */
public class DescribeUpBpsPeakDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUpBpsPeakDataResponseBody body;

    private DescribeUpBpsPeakDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUpBpsPeakDataResponse create() {
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
    public DescribeUpBpsPeakDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUpBpsPeakDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUpBpsPeakDataResponseBody body);

        @Override
        DescribeUpBpsPeakDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUpBpsPeakDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUpBpsPeakDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUpBpsPeakDataResponse response) {
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
        public Builder body(DescribeUpBpsPeakDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUpBpsPeakDataResponse build() {
            return new DescribeUpBpsPeakDataResponse(this);
        } 

    } 

}
