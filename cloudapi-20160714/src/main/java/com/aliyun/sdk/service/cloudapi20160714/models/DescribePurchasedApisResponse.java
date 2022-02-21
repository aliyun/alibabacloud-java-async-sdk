// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedApisResponse} extends {@link TeaModel}
 *
 * <p>DescribePurchasedApisResponse</p>
 */
public class DescribePurchasedApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePurchasedApisResponseBody body;

    private DescribePurchasedApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePurchasedApisResponse create() {
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
    public DescribePurchasedApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePurchasedApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePurchasedApisResponseBody body);

        @Override
        DescribePurchasedApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePurchasedApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePurchasedApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePurchasedApisResponse response) {
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
        public Builder body(DescribePurchasedApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePurchasedApisResponse build() {
            return new DescribePurchasedApisResponse(this);
        } 

    } 

}
