// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConnectionCountRecordsResponse} extends {@link TeaModel}
 *
 * <p>DescribeConnectionCountRecordsResponse</p>
 */
public class DescribeConnectionCountRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConnectionCountRecordsResponseBody body;

    private DescribeConnectionCountRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConnectionCountRecordsResponse create() {
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
    public DescribeConnectionCountRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConnectionCountRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConnectionCountRecordsResponseBody body);

        @Override
        DescribeConnectionCountRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConnectionCountRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConnectionCountRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConnectionCountRecordsResponse response) {
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
        public Builder body(DescribeConnectionCountRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConnectionCountRecordsResponse build() {
            return new DescribeConnectionCountRecordsResponse(this);
        } 

    } 

}
