// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDbListResponse</p>
 */
public class DescribeDbListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDbListResponseBody body;

    private DescribeDbListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDbListResponse create() {
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
    public DescribeDbListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDbListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDbListResponseBody body);

        @Override
        DescribeDbListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDbListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDbListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDbListResponse response) {
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
        public Builder body(DescribeDbListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDbListResponse build() {
            return new DescribeDbListResponse(this);
        } 

    } 

}
