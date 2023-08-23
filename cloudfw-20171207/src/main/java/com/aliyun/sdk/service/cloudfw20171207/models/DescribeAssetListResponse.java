// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetListResponse} extends {@link TeaModel}
 *
 * <p>DescribeAssetListResponse</p>
 */
public class DescribeAssetListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAssetListResponseBody body;

    private DescribeAssetListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAssetListResponse create() {
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
    public DescribeAssetListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAssetListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAssetListResponseBody body);

        @Override
        DescribeAssetListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAssetListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAssetListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAssetListResponse response) {
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
        public Builder body(DescribeAssetListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAssetListResponse build() {
            return new DescribeAssetListResponse(this);
        } 

    } 

}
