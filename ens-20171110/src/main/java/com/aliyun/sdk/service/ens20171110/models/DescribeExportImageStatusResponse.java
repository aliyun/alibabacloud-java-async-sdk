// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportImageStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeExportImageStatusResponse</p>
 */
public class DescribeExportImageStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExportImageStatusResponseBody body;

    private DescribeExportImageStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExportImageStatusResponse create() {
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
    public DescribeExportImageStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExportImageStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExportImageStatusResponseBody body);

        @Override
        DescribeExportImageStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExportImageStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExportImageStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExportImageStatusResponse response) {
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
        public Builder body(DescribeExportImageStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExportImageStatusResponse build() {
            return new DescribeExportImageStatusResponse(this);
        } 

    } 

}
