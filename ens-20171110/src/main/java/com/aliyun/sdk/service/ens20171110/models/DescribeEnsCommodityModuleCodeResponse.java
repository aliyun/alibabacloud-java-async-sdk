// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsCommodityModuleCodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsCommodityModuleCodeResponse</p>
 */
public class DescribeEnsCommodityModuleCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsCommodityModuleCodeResponseBody body;

    private DescribeEnsCommodityModuleCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsCommodityModuleCodeResponse create() {
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
    public DescribeEnsCommodityModuleCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsCommodityModuleCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsCommodityModuleCodeResponseBody body);

        @Override
        DescribeEnsCommodityModuleCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsCommodityModuleCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsCommodityModuleCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsCommodityModuleCodeResponse response) {
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
        public Builder body(DescribeEnsCommodityModuleCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsCommodityModuleCodeResponse build() {
            return new DescribeEnsCommodityModuleCodeResponse(this);
        } 

    } 

}
