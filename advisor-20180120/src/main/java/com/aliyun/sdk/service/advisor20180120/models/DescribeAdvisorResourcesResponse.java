// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdvisorResourcesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdvisorResourcesResponse</p>
 */
public class DescribeAdvisorResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAdvisorResourcesResponseBody body;

    private DescribeAdvisorResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAdvisorResourcesResponse create() {
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
    public DescribeAdvisorResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdvisorResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAdvisorResourcesResponseBody body);

        @Override
        DescribeAdvisorResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdvisorResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAdvisorResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdvisorResourcesResponse response) {
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
        public Builder body(DescribeAdvisorResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdvisorResourcesResponse build() {
            return new DescribeAdvisorResourcesResponse(this);
        } 

    } 

}
