// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNFSClientStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeNFSClientStatusResponse</p>
 */
public class DescribeNFSClientStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNFSClientStatusResponseBody body;

    private DescribeNFSClientStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNFSClientStatusResponse create() {
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
    public DescribeNFSClientStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNFSClientStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNFSClientStatusResponseBody body);

        @Override
        DescribeNFSClientStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNFSClientStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNFSClientStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNFSClientStatusResponse response) {
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
        public Builder body(DescribeNFSClientStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNFSClientStatusResponse build() {
            return new DescribeNFSClientStatusResponse(this);
        } 

    } 

}
