// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyPriorUsedResponse} extends {@link TeaModel}
 *
 * <p>DescribePolicyPriorUsedResponse</p>
 */
public class DescribePolicyPriorUsedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePolicyPriorUsedResponseBody body;

    private DescribePolicyPriorUsedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePolicyPriorUsedResponse create() {
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
    public DescribePolicyPriorUsedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePolicyPriorUsedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePolicyPriorUsedResponseBody body);

        @Override
        DescribePolicyPriorUsedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePolicyPriorUsedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePolicyPriorUsedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePolicyPriorUsedResponse response) {
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
        public Builder body(DescribePolicyPriorUsedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePolicyPriorUsedResponse build() {
            return new DescribePolicyPriorUsedResponse(this);
        } 

    } 

}
