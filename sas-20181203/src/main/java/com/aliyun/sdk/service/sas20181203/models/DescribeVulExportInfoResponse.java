// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulExportInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeVulExportInfoResponse</p>
 */
public class DescribeVulExportInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVulExportInfoResponseBody body;

    private DescribeVulExportInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVulExportInfoResponse create() {
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
    public DescribeVulExportInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVulExportInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVulExportInfoResponseBody body);

        @Override
        DescribeVulExportInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVulExportInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVulExportInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVulExportInfoResponse response) {
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
        public Builder body(DescribeVulExportInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVulExportInfoResponse build() {
            return new DescribeVulExportInfoResponse(this);
        } 

    } 

}
