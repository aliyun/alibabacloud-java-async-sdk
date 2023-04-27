// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyInstancesResponse} extends {@link TeaModel}
 *
 * <p>DescribePolicyInstancesResponse</p>
 */
public class DescribePolicyInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePolicyInstancesResponseBody body;

    private DescribePolicyInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePolicyInstancesResponse create() {
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
    public DescribePolicyInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePolicyInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePolicyInstancesResponseBody body);

        @Override
        DescribePolicyInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePolicyInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePolicyInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePolicyInstancesResponse response) {
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
        public Builder body(DescribePolicyInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePolicyInstancesResponse build() {
            return new DescribePolicyInstancesResponse(this);
        } 

    } 

}
