// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainConsortiumsV2Response} extends {@link TeaModel}
 *
 * <p>DescribeAntChainConsortiumsV2Response</p>
 */
public class DescribeAntChainConsortiumsV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAntChainConsortiumsV2ResponseBody body;

    private DescribeAntChainConsortiumsV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAntChainConsortiumsV2Response create() {
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
    public DescribeAntChainConsortiumsV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainConsortiumsV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAntChainConsortiumsV2ResponseBody body);

        @Override
        DescribeAntChainConsortiumsV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainConsortiumsV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAntChainConsortiumsV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainConsortiumsV2Response response) {
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
        public Builder body(DescribeAntChainConsortiumsV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainConsortiumsV2Response build() {
            return new DescribeAntChainConsortiumsV2Response(this);
        } 

    } 

}
