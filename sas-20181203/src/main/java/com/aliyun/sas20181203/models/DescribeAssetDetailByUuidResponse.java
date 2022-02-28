// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetDetailByUuidResponse} extends {@link TeaModel}
 *
 * <p>DescribeAssetDetailByUuidResponse</p>
 */
public class DescribeAssetDetailByUuidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAssetDetailByUuidResponseBody body;

    private DescribeAssetDetailByUuidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAssetDetailByUuidResponse create() {
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
    public DescribeAssetDetailByUuidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAssetDetailByUuidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAssetDetailByUuidResponseBody body);

        @Override
        DescribeAssetDetailByUuidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAssetDetailByUuidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAssetDetailByUuidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAssetDetailByUuidResponse response) {
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
        public Builder body(DescribeAssetDetailByUuidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAssetDetailByUuidResponse build() {
            return new DescribeAssetDetailByUuidResponse(this);
        } 

    } 

}
