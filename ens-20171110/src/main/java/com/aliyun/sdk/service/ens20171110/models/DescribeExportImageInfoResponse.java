// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportImageInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeExportImageInfoResponse</p>
 */
public class DescribeExportImageInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExportImageInfoResponseBody body;

    private DescribeExportImageInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExportImageInfoResponse create() {
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
    public DescribeExportImageInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExportImageInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExportImageInfoResponseBody body);

        @Override
        DescribeExportImageInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExportImageInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExportImageInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExportImageInfoResponse response) {
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
        public Builder body(DescribeExportImageInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExportImageInfoResponse build() {
            return new DescribeExportImageInfoResponse(this);
        } 

    } 

}
