// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectStepsResponse} extends {@link TeaModel}
 *
 * <p>DescribeProjectStepsResponse</p>
 */
public class DescribeProjectStepsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProjectStepsResponseBody body;

    private DescribeProjectStepsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProjectStepsResponse create() {
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
    public DescribeProjectStepsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProjectStepsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProjectStepsResponseBody body);

        @Override
        DescribeProjectStepsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProjectStepsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProjectStepsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProjectStepsResponse response) {
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
        public Builder body(DescribeProjectStepsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProjectStepsResponse build() {
            return new DescribeProjectStepsResponse(this);
        } 

    } 

}
