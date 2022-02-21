// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainConsortiumsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAntChainConsortiumsResponse</p>
 */
public class DescribeAntChainConsortiumsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAntChainConsortiumsResponseBody body;

    private DescribeAntChainConsortiumsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAntChainConsortiumsResponse create() {
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
    public DescribeAntChainConsortiumsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainConsortiumsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAntChainConsortiumsResponseBody body);

        @Override
        DescribeAntChainConsortiumsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainConsortiumsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAntChainConsortiumsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainConsortiumsResponse response) {
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
        public Builder body(DescribeAntChainConsortiumsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainConsortiumsResponse build() {
            return new DescribeAntChainConsortiumsResponse(this);
        } 

    } 

}
