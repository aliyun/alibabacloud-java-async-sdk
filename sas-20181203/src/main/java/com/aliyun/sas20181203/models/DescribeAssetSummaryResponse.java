// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetSummaryResponse} extends {@link TeaModel}
 *
 * <p>DescribeAssetSummaryResponse</p>
 */
public class DescribeAssetSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAssetSummaryResponseBody body;

    private DescribeAssetSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAssetSummaryResponse create() {
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
    public DescribeAssetSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAssetSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAssetSummaryResponseBody body);

        @Override
        DescribeAssetSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAssetSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAssetSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAssetSummaryResponse response) {
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
        public Builder body(DescribeAssetSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAssetSummaryResponse build() {
            return new DescribeAssetSummaryResponse(this);
        } 

    } 

}
