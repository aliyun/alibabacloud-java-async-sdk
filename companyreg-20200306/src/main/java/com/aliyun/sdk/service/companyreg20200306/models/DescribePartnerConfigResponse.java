// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePartnerConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribePartnerConfigResponse</p>
 */
public class DescribePartnerConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePartnerConfigResponseBody body;

    private DescribePartnerConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePartnerConfigResponse create() {
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
    public DescribePartnerConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePartnerConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePartnerConfigResponseBody body);

        @Override
        DescribePartnerConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePartnerConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePartnerConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePartnerConfigResponse response) {
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
        public Builder body(DescribePartnerConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePartnerConfigResponse build() {
            return new DescribePartnerConfigResponse(this);
        } 

    } 

}
