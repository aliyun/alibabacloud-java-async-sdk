// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserQuotaApplicationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserQuotaApplicationsResponse</p>
 */
public class DescribeUserQuotaApplicationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserQuotaApplicationsResponseBody body;

    private DescribeUserQuotaApplicationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserQuotaApplicationsResponse create() {
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
    public DescribeUserQuotaApplicationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserQuotaApplicationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserQuotaApplicationsResponseBody body);

        @Override
        DescribeUserQuotaApplicationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserQuotaApplicationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserQuotaApplicationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserQuotaApplicationsResponse response) {
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
        public Builder body(DescribeUserQuotaApplicationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserQuotaApplicationsResponse build() {
            return new DescribeUserQuotaApplicationsResponse(this);
        } 

    } 

}
