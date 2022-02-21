// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpBpsPeakOfLineResponse} extends {@link TeaModel}
 *
 * <p>DescribeUpBpsPeakOfLineResponse</p>
 */
public class DescribeUpBpsPeakOfLineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUpBpsPeakOfLineResponseBody body;

    private DescribeUpBpsPeakOfLineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUpBpsPeakOfLineResponse create() {
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
    public DescribeUpBpsPeakOfLineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUpBpsPeakOfLineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUpBpsPeakOfLineResponseBody body);

        @Override
        DescribeUpBpsPeakOfLineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUpBpsPeakOfLineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUpBpsPeakOfLineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUpBpsPeakOfLineResponse response) {
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
        public Builder body(DescribeUpBpsPeakOfLineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUpBpsPeakOfLineResponse build() {
            return new DescribeUpBpsPeakOfLineResponse(this);
        } 

    } 

}
