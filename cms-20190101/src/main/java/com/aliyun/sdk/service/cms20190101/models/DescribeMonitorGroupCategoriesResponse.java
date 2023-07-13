// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupCategoriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupCategoriesResponse</p>
 */
public class DescribeMonitorGroupCategoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMonitorGroupCategoriesResponseBody body;

    private DescribeMonitorGroupCategoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMonitorGroupCategoriesResponse create() {
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
    public DescribeMonitorGroupCategoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitorGroupCategoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMonitorGroupCategoriesResponseBody body);

        @Override
        DescribeMonitorGroupCategoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitorGroupCategoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMonitorGroupCategoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitorGroupCategoriesResponse response) {
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
        public Builder body(DescribeMonitorGroupCategoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitorGroupCategoriesResponse build() {
            return new DescribeMonitorGroupCategoriesResponse(this);
        } 

    } 

}
