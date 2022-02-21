// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwitdhByInternetChargeTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeBandwitdhByInternetChargeTypeResponse</p>
 */
public class DescribeBandwitdhByInternetChargeTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBandwitdhByInternetChargeTypeResponseBody body;

    private DescribeBandwitdhByInternetChargeTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBandwitdhByInternetChargeTypeResponse create() {
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
    public DescribeBandwitdhByInternetChargeTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBandwitdhByInternetChargeTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBandwitdhByInternetChargeTypeResponseBody body);

        @Override
        DescribeBandwitdhByInternetChargeTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBandwitdhByInternetChargeTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBandwitdhByInternetChargeTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBandwitdhByInternetChargeTypeResponse response) {
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
        public Builder body(DescribeBandwitdhByInternetChargeTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBandwitdhByInternetChargeTypeResponse build() {
            return new DescribeBandwitdhByInternetChargeTypeResponse(this);
        } 

    } 

}
