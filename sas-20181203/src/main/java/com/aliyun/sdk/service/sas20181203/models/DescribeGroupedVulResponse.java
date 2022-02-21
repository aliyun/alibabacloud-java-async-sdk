// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedVulResponse} extends {@link TeaModel}
 *
 * <p>DescribeGroupedVulResponse</p>
 */
public class DescribeGroupedVulResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGroupedVulResponseBody body;

    private DescribeGroupedVulResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGroupedVulResponse create() {
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
    public DescribeGroupedVulResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGroupedVulResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGroupedVulResponseBody body);

        @Override
        DescribeGroupedVulResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGroupedVulResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGroupedVulResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGroupedVulResponse response) {
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
        public Builder body(DescribeGroupedVulResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGroupedVulResponse build() {
            return new DescribeGroupedVulResponse(this);
        } 

    } 

}
