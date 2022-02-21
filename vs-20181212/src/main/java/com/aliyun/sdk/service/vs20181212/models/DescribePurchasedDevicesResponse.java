// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedDevicesResponse} extends {@link TeaModel}
 *
 * <p>DescribePurchasedDevicesResponse</p>
 */
public class DescribePurchasedDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePurchasedDevicesResponseBody body;

    private DescribePurchasedDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePurchasedDevicesResponse create() {
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
    public DescribePurchasedDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePurchasedDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePurchasedDevicesResponseBody body);

        @Override
        DescribePurchasedDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePurchasedDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePurchasedDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePurchasedDevicesResponse response) {
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
        public Builder body(DescribePurchasedDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePurchasedDevicesResponse build() {
            return new DescribePurchasedDevicesResponse(this);
        } 

    } 

}
