// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecoverableTimeRangeResponse} extends {@link TeaModel}
 *
 * <p>DescribeRecoverableTimeRangeResponse</p>
 */
public class DescribeRecoverableTimeRangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRecoverableTimeRangeResponseBody body;

    private DescribeRecoverableTimeRangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRecoverableTimeRangeResponse create() {
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
    public DescribeRecoverableTimeRangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRecoverableTimeRangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRecoverableTimeRangeResponseBody body);

        @Override
        DescribeRecoverableTimeRangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRecoverableTimeRangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRecoverableTimeRangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRecoverableTimeRangeResponse response) {
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
        public Builder body(DescribeRecoverableTimeRangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRecoverableTimeRangeResponse build() {
            return new DescribeRecoverableTimeRangeResponse(this);
        } 

    } 

}
