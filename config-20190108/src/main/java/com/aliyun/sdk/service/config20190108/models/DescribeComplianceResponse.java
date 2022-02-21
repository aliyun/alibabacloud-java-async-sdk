// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComplianceResponse} extends {@link TeaModel}
 *
 * <p>DescribeComplianceResponse</p>
 */
public class DescribeComplianceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeComplianceResponseBody body;

    private DescribeComplianceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeComplianceResponse create() {
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
    public DescribeComplianceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeComplianceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeComplianceResponseBody body);

        @Override
        DescribeComplianceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeComplianceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeComplianceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeComplianceResponse response) {
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
        public Builder body(DescribeComplianceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeComplianceResponse build() {
            return new DescribeComplianceResponse(this);
        } 

    } 

}
