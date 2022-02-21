// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandWithdChargeTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeBandWithdChargeTypeResponse</p>
 */
public class DescribeBandWithdChargeTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBandWithdChargeTypeResponseBody body;

    private DescribeBandWithdChargeTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBandWithdChargeTypeResponse create() {
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
    public DescribeBandWithdChargeTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBandWithdChargeTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBandWithdChargeTypeResponseBody body);

        @Override
        DescribeBandWithdChargeTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBandWithdChargeTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBandWithdChargeTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBandWithdChargeTypeResponse response) {
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
        public Builder body(DescribeBandWithdChargeTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBandWithdChargeTypeResponse build() {
            return new DescribeBandWithdChargeTypeResponse(this);
        } 

    } 

}
