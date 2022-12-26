// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceInfoNodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeTraceInfoNodeResponse</p>
 */
public class DescribeTraceInfoNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTraceInfoNodeResponseBody body;

    private DescribeTraceInfoNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTraceInfoNodeResponse create() {
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
    public DescribeTraceInfoNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTraceInfoNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTraceInfoNodeResponseBody body);

        @Override
        DescribeTraceInfoNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTraceInfoNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTraceInfoNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTraceInfoNodeResponse response) {
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
        public Builder body(DescribeTraceInfoNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTraceInfoNodeResponse build() {
            return new DescribeTraceInfoNodeResponse(this);
        } 

    } 

}
