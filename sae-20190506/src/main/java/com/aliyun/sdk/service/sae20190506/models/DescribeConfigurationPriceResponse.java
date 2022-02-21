// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigurationPriceResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigurationPriceResponse</p>
 */
public class DescribeConfigurationPriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigurationPriceResponseBody body;

    private DescribeConfigurationPriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigurationPriceResponse create() {
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
    public DescribeConfigurationPriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigurationPriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigurationPriceResponseBody body);

        @Override
        DescribeConfigurationPriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigurationPriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigurationPriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigurationPriceResponse response) {
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
        public Builder body(DescribeConfigurationPriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigurationPriceResponse build() {
            return new DescribeConfigurationPriceResponse(this);
        } 

    } 

}
