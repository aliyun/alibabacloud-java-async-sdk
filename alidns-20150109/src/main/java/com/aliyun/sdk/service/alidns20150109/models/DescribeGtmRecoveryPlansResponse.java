// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmRecoveryPlansResponse} extends {@link TeaModel}
 *
 * <p>DescribeGtmRecoveryPlansResponse</p>
 */
public class DescribeGtmRecoveryPlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGtmRecoveryPlansResponseBody body;

    private DescribeGtmRecoveryPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGtmRecoveryPlansResponse create() {
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
    public DescribeGtmRecoveryPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGtmRecoveryPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGtmRecoveryPlansResponseBody body);

        @Override
        DescribeGtmRecoveryPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGtmRecoveryPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGtmRecoveryPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGtmRecoveryPlansResponse response) {
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
        public Builder body(DescribeGtmRecoveryPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGtmRecoveryPlansResponse build() {
            return new DescribeGtmRecoveryPlansResponse(this);
        } 

    } 

}
