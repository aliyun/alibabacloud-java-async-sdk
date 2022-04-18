// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeColumnsResponse} extends {@link TeaModel}
 *
 * <p>DescribeColumnsResponse</p>
 */
public class DescribeColumnsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeColumnsResponseBody body;

    private DescribeColumnsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeColumnsResponse create() {
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
    public DescribeColumnsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeColumnsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeColumnsResponseBody body);

        @Override
        DescribeColumnsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeColumnsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeColumnsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeColumnsResponse response) {
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
        public Builder body(DescribeColumnsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeColumnsResponse build() {
            return new DescribeColumnsResponse(this);
        } 

    } 

}
