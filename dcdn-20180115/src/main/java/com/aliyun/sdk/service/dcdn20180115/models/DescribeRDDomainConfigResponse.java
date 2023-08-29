// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDDomainConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeRDDomainConfigResponse</p>
 */
public class DescribeRDDomainConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRDDomainConfigResponseBody body;

    private DescribeRDDomainConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRDDomainConfigResponse create() {
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
    public DescribeRDDomainConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRDDomainConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRDDomainConfigResponseBody body);

        @Override
        DescribeRDDomainConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRDDomainConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRDDomainConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRDDomainConfigResponse response) {
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
        public Builder body(DescribeRDDomainConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRDDomainConfigResponse build() {
            return new DescribeRDDomainConfigResponse(this);
        } 

    } 

}
