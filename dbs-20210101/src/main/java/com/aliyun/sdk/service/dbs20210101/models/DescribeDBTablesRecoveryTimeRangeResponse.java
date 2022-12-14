// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBTablesRecoveryTimeRangeResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBTablesRecoveryTimeRangeResponse</p>
 */
public class DescribeDBTablesRecoveryTimeRangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBTablesRecoveryTimeRangeResponseBody body;

    private DescribeDBTablesRecoveryTimeRangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBTablesRecoveryTimeRangeResponse create() {
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
    public DescribeDBTablesRecoveryTimeRangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBTablesRecoveryTimeRangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBTablesRecoveryTimeRangeResponseBody body);

        @Override
        DescribeDBTablesRecoveryTimeRangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBTablesRecoveryTimeRangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBTablesRecoveryTimeRangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBTablesRecoveryTimeRangeResponse response) {
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
        public Builder body(DescribeDBTablesRecoveryTimeRangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBTablesRecoveryTimeRangeResponse build() {
            return new DescribeDBTablesRecoveryTimeRangeResponse(this);
        } 

    } 

}
