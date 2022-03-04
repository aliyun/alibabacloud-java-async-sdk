// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyDetailsResponse} extends {@link TeaModel}
 *
 * <p>DescribePolicyDetailsResponse</p>
 */
public class DescribePolicyDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePolicyDetailsResponseBody body;

    private DescribePolicyDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePolicyDetailsResponse create() {
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
    public DescribePolicyDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePolicyDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePolicyDetailsResponseBody body);

        @Override
        DescribePolicyDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePolicyDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePolicyDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePolicyDetailsResponse response) {
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
        public Builder body(DescribePolicyDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePolicyDetailsResponse build() {
            return new DescribePolicyDetailsResponse(this);
        } 

    } 

}
