// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEmgVulItemResponse} extends {@link TeaModel}
 *
 * <p>DescribeEmgVulItemResponse</p>
 */
public class DescribeEmgVulItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEmgVulItemResponseBody body;

    private DescribeEmgVulItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEmgVulItemResponse create() {
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
    public DescribeEmgVulItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEmgVulItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEmgVulItemResponseBody body);

        @Override
        DescribeEmgVulItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEmgVulItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEmgVulItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEmgVulItemResponse response) {
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
        public Builder body(DescribeEmgVulItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEmgVulItemResponse build() {
            return new DescribeEmgVulItemResponse(this);
        } 

    } 

}
