// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStudioLayoutsResponse} extends {@link TeaModel}
 *
 * <p>DescribeStudioLayoutsResponse</p>
 */
public class DescribeStudioLayoutsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStudioLayoutsResponseBody body;

    private DescribeStudioLayoutsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStudioLayoutsResponse create() {
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
    public DescribeStudioLayoutsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStudioLayoutsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStudioLayoutsResponseBody body);

        @Override
        DescribeStudioLayoutsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStudioLayoutsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStudioLayoutsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStudioLayoutsResponse response) {
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
        public Builder body(DescribeStudioLayoutsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStudioLayoutsResponse build() {
            return new DescribeStudioLayoutsResponse(this);
        } 

    } 

}
