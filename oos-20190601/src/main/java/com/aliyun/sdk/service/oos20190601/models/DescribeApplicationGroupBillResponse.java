// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationGroupBillResponse} extends {@link TeaModel}
 *
 * <p>DescribeApplicationGroupBillResponse</p>
 */
public class DescribeApplicationGroupBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApplicationGroupBillResponseBody body;

    private DescribeApplicationGroupBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApplicationGroupBillResponse create() {
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
    public DescribeApplicationGroupBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApplicationGroupBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApplicationGroupBillResponseBody body);

        @Override
        DescribeApplicationGroupBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApplicationGroupBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApplicationGroupBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApplicationGroupBillResponse response) {
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
        public Builder body(DescribeApplicationGroupBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApplicationGroupBillResponse build() {
            return new DescribeApplicationGroupBillResponse(this);
        } 

    } 

}
