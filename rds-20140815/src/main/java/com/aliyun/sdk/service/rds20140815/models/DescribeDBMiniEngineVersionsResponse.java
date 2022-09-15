// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBMiniEngineVersionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBMiniEngineVersionsResponse</p>
 */
public class DescribeDBMiniEngineVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBMiniEngineVersionsResponseBody body;

    private DescribeDBMiniEngineVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBMiniEngineVersionsResponse create() {
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
    public DescribeDBMiniEngineVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBMiniEngineVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBMiniEngineVersionsResponseBody body);

        @Override
        DescribeDBMiniEngineVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBMiniEngineVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBMiniEngineVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBMiniEngineVersionsResponse response) {
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
        public Builder body(DescribeDBMiniEngineVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBMiniEngineVersionsResponse build() {
            return new DescribeDBMiniEngineVersionsResponse(this);
        } 

    } 

}
