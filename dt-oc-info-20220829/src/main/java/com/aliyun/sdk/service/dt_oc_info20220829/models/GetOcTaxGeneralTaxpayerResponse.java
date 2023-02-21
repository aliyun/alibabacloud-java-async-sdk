// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcTaxGeneralTaxpayerResponse} extends {@link TeaModel}
 *
 * <p>GetOcTaxGeneralTaxpayerResponse</p>
 */
public class GetOcTaxGeneralTaxpayerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcTaxGeneralTaxpayerResponseBody body;

    private GetOcTaxGeneralTaxpayerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcTaxGeneralTaxpayerResponse create() {
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
    public GetOcTaxGeneralTaxpayerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcTaxGeneralTaxpayerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcTaxGeneralTaxpayerResponseBody body);

        @Override
        GetOcTaxGeneralTaxpayerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcTaxGeneralTaxpayerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcTaxGeneralTaxpayerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcTaxGeneralTaxpayerResponse response) {
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
        public Builder body(GetOcTaxGeneralTaxpayerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcTaxGeneralTaxpayerResponse build() {
            return new GetOcTaxGeneralTaxpayerResponse(this);
        } 

    } 

}
