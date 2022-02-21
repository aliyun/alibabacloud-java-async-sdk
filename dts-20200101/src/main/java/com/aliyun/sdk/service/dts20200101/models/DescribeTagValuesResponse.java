// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagValuesResponse} extends {@link TeaModel}
 *
 * <p>DescribeTagValuesResponse</p>
 */
public class DescribeTagValuesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTagValuesResponseBody body;

    private DescribeTagValuesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTagValuesResponse create() {
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
    public DescribeTagValuesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTagValuesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTagValuesResponseBody body);

        @Override
        DescribeTagValuesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTagValuesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTagValuesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTagValuesResponse response) {
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
        public Builder body(DescribeTagValuesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTagValuesResponse build() {
            return new DescribeTagValuesResponse(this);
        } 

    } 

}
