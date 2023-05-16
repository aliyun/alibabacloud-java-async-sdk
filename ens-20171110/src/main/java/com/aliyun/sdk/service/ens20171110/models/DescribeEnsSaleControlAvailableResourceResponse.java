// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsSaleControlAvailableResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsSaleControlAvailableResourceResponse</p>
 */
public class DescribeEnsSaleControlAvailableResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsSaleControlAvailableResourceResponseBody body;

    private DescribeEnsSaleControlAvailableResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsSaleControlAvailableResourceResponse create() {
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
    public DescribeEnsSaleControlAvailableResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsSaleControlAvailableResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsSaleControlAvailableResourceResponseBody body);

        @Override
        DescribeEnsSaleControlAvailableResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsSaleControlAvailableResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsSaleControlAvailableResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsSaleControlAvailableResourceResponse response) {
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
        public Builder body(DescribeEnsSaleControlAvailableResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsSaleControlAvailableResourceResponse build() {
            return new DescribeEnsSaleControlAvailableResourceResponse(this);
        } 

    } 

}
