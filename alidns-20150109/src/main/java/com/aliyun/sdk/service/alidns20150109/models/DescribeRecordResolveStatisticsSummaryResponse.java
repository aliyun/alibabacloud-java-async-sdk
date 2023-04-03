// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordResolveStatisticsSummaryResponse} extends {@link TeaModel}
 *
 * <p>DescribeRecordResolveStatisticsSummaryResponse</p>
 */
public class DescribeRecordResolveStatisticsSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRecordResolveStatisticsSummaryResponseBody body;

    private DescribeRecordResolveStatisticsSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRecordResolveStatisticsSummaryResponse create() {
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
    public DescribeRecordResolveStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRecordResolveStatisticsSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRecordResolveStatisticsSummaryResponseBody body);

        @Override
        DescribeRecordResolveStatisticsSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRecordResolveStatisticsSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRecordResolveStatisticsSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRecordResolveStatisticsSummaryResponse response) {
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
        public Builder body(DescribeRecordResolveStatisticsSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRecordResolveStatisticsSummaryResponse build() {
            return new DescribeRecordResolveStatisticsSummaryResponse(this);
        } 

    } 

}
