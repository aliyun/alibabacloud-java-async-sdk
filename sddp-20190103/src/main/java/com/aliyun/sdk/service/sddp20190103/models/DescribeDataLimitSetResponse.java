// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitSetResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataLimitSetResponse</p>
 */
public class DescribeDataLimitSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataLimitSetResponseBody body;

    private DescribeDataLimitSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataLimitSetResponse create() {
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
    public DescribeDataLimitSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataLimitSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataLimitSetResponseBody body);

        @Override
        DescribeDataLimitSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataLimitSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataLimitSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataLimitSetResponse response) {
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
        public Builder body(DescribeDataLimitSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataLimitSetResponse build() {
            return new DescribeDataLimitSetResponse(this);
        } 

    } 

}
