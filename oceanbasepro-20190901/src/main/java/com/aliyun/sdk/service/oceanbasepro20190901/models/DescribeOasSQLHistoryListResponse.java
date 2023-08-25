// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSQLHistoryListResponse} extends {@link TeaModel}
 *
 * <p>DescribeOasSQLHistoryListResponse</p>
 */
public class DescribeOasSQLHistoryListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOasSQLHistoryListResponseBody body;

    private DescribeOasSQLHistoryListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOasSQLHistoryListResponse create() {
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
    public DescribeOasSQLHistoryListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOasSQLHistoryListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOasSQLHistoryListResponseBody body);

        @Override
        DescribeOasSQLHistoryListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOasSQLHistoryListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOasSQLHistoryListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOasSQLHistoryListResponse response) {
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
        public Builder body(DescribeOasSQLHistoryListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOasSQLHistoryListResponse build() {
            return new DescribeOasSQLHistoryListResponse(this);
        } 

    } 

}
