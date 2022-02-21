// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElbAvailableResourceInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeElbAvailableResourceInfoResponse</p>
 */
public class DescribeElbAvailableResourceInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeElbAvailableResourceInfoResponseBody body;

    private DescribeElbAvailableResourceInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeElbAvailableResourceInfoResponse create() {
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
    public DescribeElbAvailableResourceInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeElbAvailableResourceInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeElbAvailableResourceInfoResponseBody body);

        @Override
        DescribeElbAvailableResourceInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeElbAvailableResourceInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeElbAvailableResourceInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeElbAvailableResourceInfoResponse response) {
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
        public Builder body(DescribeElbAvailableResourceInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeElbAvailableResourceInfoResponse build() {
            return new DescribeElbAvailableResourceInfoResponse(this);
        } 

    } 

}
