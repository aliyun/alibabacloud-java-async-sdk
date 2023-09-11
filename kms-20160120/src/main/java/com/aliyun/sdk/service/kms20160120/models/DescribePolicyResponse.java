// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyResponse} extends {@link TeaModel}
 *
 * <p>DescribePolicyResponse</p>
 */
public class DescribePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePolicyResponseBody body;

    private DescribePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePolicyResponse create() {
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
    public DescribePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePolicyResponseBody body);

        @Override
        DescribePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePolicyResponse response) {
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
        public Builder body(DescribePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePolicyResponse build() {
            return new DescribePolicyResponse(this);
        } 

    } 

}
