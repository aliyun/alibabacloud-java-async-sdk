// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniSupportRegionResponse} extends {@link TeaModel}
 *
 * <p>DescribeUniSupportRegionResponse</p>
 */
public class DescribeUniSupportRegionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUniSupportRegionResponseBody body;

    private DescribeUniSupportRegionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUniSupportRegionResponse create() {
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
    public DescribeUniSupportRegionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUniSupportRegionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUniSupportRegionResponseBody body);

        @Override
        DescribeUniSupportRegionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUniSupportRegionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUniSupportRegionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUniSupportRegionResponse response) {
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
        public Builder body(DescribeUniSupportRegionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUniSupportRegionResponse build() {
            return new DescribeUniSupportRegionResponse(this);
        } 

    } 

}
