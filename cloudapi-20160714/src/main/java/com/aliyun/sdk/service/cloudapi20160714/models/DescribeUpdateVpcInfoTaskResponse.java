// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpdateVpcInfoTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeUpdateVpcInfoTaskResponse</p>
 */
public class DescribeUpdateVpcInfoTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUpdateVpcInfoTaskResponseBody body;

    private DescribeUpdateVpcInfoTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUpdateVpcInfoTaskResponse create() {
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
    public DescribeUpdateVpcInfoTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUpdateVpcInfoTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUpdateVpcInfoTaskResponseBody body);

        @Override
        DescribeUpdateVpcInfoTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUpdateVpcInfoTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUpdateVpcInfoTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUpdateVpcInfoTaskResponse response) {
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
        public Builder body(DescribeUpdateVpcInfoTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUpdateVpcInfoTaskResponse build() {
            return new DescribeUpdateVpcInfoTaskResponse(this);
        } 

    } 

}
