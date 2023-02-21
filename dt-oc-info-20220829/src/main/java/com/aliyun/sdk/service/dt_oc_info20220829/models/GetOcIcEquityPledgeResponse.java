// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcEquityPledgeResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcEquityPledgeResponse</p>
 */
public class GetOcIcEquityPledgeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcEquityPledgeResponseBody body;

    private GetOcIcEquityPledgeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcEquityPledgeResponse create() {
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
    public GetOcIcEquityPledgeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcEquityPledgeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcEquityPledgeResponseBody body);

        @Override
        GetOcIcEquityPledgeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcEquityPledgeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcEquityPledgeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcEquityPledgeResponse response) {
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
        public Builder body(GetOcIcEquityPledgeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcEquityPledgeResponse build() {
            return new GetOcIcEquityPledgeResponse(this);
        } 

    } 

}
