// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedDeviceResponse} extends {@link TeaModel}
 *
 * <p>DescribePurchasedDeviceResponse</p>
 */
public class DescribePurchasedDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePurchasedDeviceResponseBody body;

    private DescribePurchasedDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePurchasedDeviceResponse create() {
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
    public DescribePurchasedDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePurchasedDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePurchasedDeviceResponseBody body);

        @Override
        DescribePurchasedDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePurchasedDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePurchasedDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePurchasedDeviceResponse response) {
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
        public Builder body(DescribePurchasedDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePurchasedDeviceResponse build() {
            return new DescribePurchasedDeviceResponse(this);
        } 

    } 

}
