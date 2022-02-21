// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeRecordDataResponse</p>
 */
public class DescribeRecordDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRecordDataResponseBody body;

    private DescribeRecordDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRecordDataResponse create() {
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
    public DescribeRecordDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRecordDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRecordDataResponseBody body);

        @Override
        DescribeRecordDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRecordDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRecordDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRecordDataResponse response) {
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
        public Builder body(DescribeRecordDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRecordDataResponse build() {
            return new DescribeRecordDataResponse(this);
        } 

    } 

}
