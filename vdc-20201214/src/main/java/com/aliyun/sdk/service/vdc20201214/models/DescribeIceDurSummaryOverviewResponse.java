// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIceDurSummaryOverviewResponse} extends {@link TeaModel}
 *
 * <p>DescribeIceDurSummaryOverviewResponse</p>
 */
public class DescribeIceDurSummaryOverviewResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeIceDurSummaryOverviewResponseBody body;

    private DescribeIceDurSummaryOverviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeIceDurSummaryOverviewResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeIceDurSummaryOverviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIceDurSummaryOverviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeIceDurSummaryOverviewResponseBody body);

        @Override
        DescribeIceDurSummaryOverviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIceDurSummaryOverviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeIceDurSummaryOverviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIceDurSummaryOverviewResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeIceDurSummaryOverviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIceDurSummaryOverviewResponse build() {
            return new DescribeIceDurSummaryOverviewResponse(this);
        } 

    } 

}
