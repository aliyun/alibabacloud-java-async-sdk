// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransferHistoryResponse} extends {@link TeaModel}
 *
 * <p>DescribeTransferHistoryResponse</p>
 */
public class DescribeTransferHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTransferHistoryResponseBody body;

    private DescribeTransferHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTransferHistoryResponse create() {
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
    public DescribeTransferHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTransferHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTransferHistoryResponseBody body);

        @Override
        DescribeTransferHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTransferHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTransferHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTransferHistoryResponse response) {
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
        public Builder body(DescribeTransferHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTransferHistoryResponse build() {
            return new DescribeTransferHistoryResponse(this);
        } 

    } 

}
