// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyGroupsResponse} extends {@link TeaModel}
 *
 * <p>DescribePolicyGroupsResponse</p>
 */
public class DescribePolicyGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePolicyGroupsResponseBody body;

    private DescribePolicyGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePolicyGroupsResponse create() {
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
    public DescribePolicyGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePolicyGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePolicyGroupsResponseBody body);

        @Override
        DescribePolicyGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePolicyGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePolicyGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePolicyGroupsResponse response) {
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
        public Builder body(DescribePolicyGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePolicyGroupsResponse build() {
            return new DescribePolicyGroupsResponse(this);
        } 

    } 

}
