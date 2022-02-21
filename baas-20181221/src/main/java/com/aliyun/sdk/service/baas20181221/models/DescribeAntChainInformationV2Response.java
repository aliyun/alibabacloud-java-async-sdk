// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainInformationV2Response} extends {@link TeaModel}
 *
 * <p>DescribeAntChainInformationV2Response</p>
 */
public class DescribeAntChainInformationV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAntChainInformationV2ResponseBody body;

    private DescribeAntChainInformationV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAntChainInformationV2Response create() {
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
    public DescribeAntChainInformationV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainInformationV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAntChainInformationV2ResponseBody body);

        @Override
        DescribeAntChainInformationV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainInformationV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAntChainInformationV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainInformationV2Response response) {
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
        public Builder body(DescribeAntChainInformationV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainInformationV2Response build() {
            return new DescribeAntChainInformationV2Response(this);
        } 

    } 

}
