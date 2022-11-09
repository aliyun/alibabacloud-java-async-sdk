// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogicInstanceTopologyResponse} extends {@link TeaModel}
 *
 * <p>DescribeLogicInstanceTopologyResponse</p>
 */
public class DescribeLogicInstanceTopologyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLogicInstanceTopologyResponseBody body;

    private DescribeLogicInstanceTopologyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLogicInstanceTopologyResponse create() {
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
    public DescribeLogicInstanceTopologyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLogicInstanceTopologyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLogicInstanceTopologyResponseBody body);

        @Override
        DescribeLogicInstanceTopologyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLogicInstanceTopologyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLogicInstanceTopologyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLogicInstanceTopologyResponse response) {
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
        public Builder body(DescribeLogicInstanceTopologyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLogicInstanceTopologyResponse build() {
            return new DescribeLogicInstanceTopologyResponse(this);
        } 

    } 

}
