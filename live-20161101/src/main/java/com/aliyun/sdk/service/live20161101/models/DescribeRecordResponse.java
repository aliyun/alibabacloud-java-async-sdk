// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordResponse} extends {@link TeaModel}
 *
 * <p>DescribeRecordResponse</p>
 */
public class DescribeRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRecordResponseBody body;

    private DescribeRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRecordResponse create() {
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
    public DescribeRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRecordResponseBody body);

        @Override
        DescribeRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRecordResponse response) {
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
        public Builder body(DescribeRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRecordResponse build() {
            return new DescribeRecordResponse(this);
        } 

    } 

}
