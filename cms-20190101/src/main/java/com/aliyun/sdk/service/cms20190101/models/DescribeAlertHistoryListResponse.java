// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertHistoryListResponse} extends {@link TeaModel}
 *
 * <p>DescribeAlertHistoryListResponse</p>
 */
public class DescribeAlertHistoryListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAlertHistoryListResponseBody body;

    private DescribeAlertHistoryListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAlertHistoryListResponse create() {
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
    public DescribeAlertHistoryListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAlertHistoryListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAlertHistoryListResponseBody body);

        @Override
        DescribeAlertHistoryListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAlertHistoryListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAlertHistoryListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAlertHistoryListResponse response) {
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
        public Builder body(DescribeAlertHistoryListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAlertHistoryListResponse build() {
            return new DescribeAlertHistoryListResponse(this);
        } 

    } 

}
