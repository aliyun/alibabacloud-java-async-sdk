// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedCheckWarningResponse} extends {@link TeaModel}
 *
 * <p>DescribeExposedCheckWarningResponse</p>
 */
public class DescribeExposedCheckWarningResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExposedCheckWarningResponseBody body;

    private DescribeExposedCheckWarningResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExposedCheckWarningResponse create() {
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
    public DescribeExposedCheckWarningResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExposedCheckWarningResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExposedCheckWarningResponseBody body);

        @Override
        DescribeExposedCheckWarningResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExposedCheckWarningResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExposedCheckWarningResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExposedCheckWarningResponse response) {
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
        public Builder body(DescribeExposedCheckWarningResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExposedCheckWarningResponse build() {
            return new DescribeExposedCheckWarningResponse(this);
        } 

    } 

}
