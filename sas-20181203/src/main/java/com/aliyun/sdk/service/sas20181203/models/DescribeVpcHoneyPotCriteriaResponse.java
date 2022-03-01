// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcHoneyPotCriteriaResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpcHoneyPotCriteriaResponse</p>
 */
public class DescribeVpcHoneyPotCriteriaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpcHoneyPotCriteriaResponseBody body;

    private DescribeVpcHoneyPotCriteriaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpcHoneyPotCriteriaResponse create() {
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
    public DescribeVpcHoneyPotCriteriaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpcHoneyPotCriteriaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpcHoneyPotCriteriaResponseBody body);

        @Override
        DescribeVpcHoneyPotCriteriaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpcHoneyPotCriteriaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpcHoneyPotCriteriaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpcHoneyPotCriteriaResponse response) {
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
        public Builder body(DescribeVpcHoneyPotCriteriaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpcHoneyPotCriteriaResponse build() {
            return new DescribeVpcHoneyPotCriteriaResponse(this);
        } 

    } 

}
