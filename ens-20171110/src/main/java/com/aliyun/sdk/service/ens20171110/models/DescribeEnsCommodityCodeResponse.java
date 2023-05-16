// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsCommodityCodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsCommodityCodeResponse</p>
 */
public class DescribeEnsCommodityCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsCommodityCodeResponseBody body;

    private DescribeEnsCommodityCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsCommodityCodeResponse create() {
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
    public DescribeEnsCommodityCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsCommodityCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsCommodityCodeResponseBody body);

        @Override
        DescribeEnsCommodityCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsCommodityCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsCommodityCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsCommodityCodeResponse response) {
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
        public Builder body(DescribeEnsCommodityCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsCommodityCodeResponse build() {
            return new DescribeEnsCommodityCodeResponse(this);
        } 

    } 

}
