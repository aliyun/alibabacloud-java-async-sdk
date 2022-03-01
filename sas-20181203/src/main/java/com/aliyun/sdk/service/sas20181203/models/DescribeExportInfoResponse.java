// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeExportInfoResponse</p>
 */
public class DescribeExportInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExportInfoResponseBody body;

    private DescribeExportInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExportInfoResponse create() {
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
    public DescribeExportInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExportInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExportInfoResponseBody body);

        @Override
        DescribeExportInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExportInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExportInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExportInfoResponse response) {
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
        public Builder body(DescribeExportInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExportInfoResponse build() {
            return new DescribeExportInfoResponse(this);
        } 

    } 

}
