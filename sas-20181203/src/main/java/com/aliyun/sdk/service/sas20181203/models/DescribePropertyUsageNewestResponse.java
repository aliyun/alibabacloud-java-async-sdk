// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyUsageNewestResponse} extends {@link TeaModel}
 *
 * <p>DescribePropertyUsageNewestResponse</p>
 */
public class DescribePropertyUsageNewestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePropertyUsageNewestResponseBody body;

    private DescribePropertyUsageNewestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePropertyUsageNewestResponse create() {
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
    public DescribePropertyUsageNewestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePropertyUsageNewestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePropertyUsageNewestResponseBody body);

        @Override
        DescribePropertyUsageNewestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePropertyUsageNewestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePropertyUsageNewestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePropertyUsageNewestResponse response) {
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
        public Builder body(DescribePropertyUsageNewestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePropertyUsageNewestResponse build() {
            return new DescribePropertyUsageNewestResponse(this);
        } 

    } 

}
