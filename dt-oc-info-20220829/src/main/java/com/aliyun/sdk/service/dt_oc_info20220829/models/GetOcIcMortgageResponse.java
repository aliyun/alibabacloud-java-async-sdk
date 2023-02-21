// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcMortgageResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcMortgageResponse</p>
 */
public class GetOcIcMortgageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcMortgageResponseBody body;

    private GetOcIcMortgageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcMortgageResponse create() {
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
    public GetOcIcMortgageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcMortgageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcMortgageResponseBody body);

        @Override
        GetOcIcMortgageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcMortgageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcMortgageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcMortgageResponse response) {
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
        public Builder body(GetOcIcMortgageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcMortgageResponse build() {
            return new GetOcIcMortgageResponse(this);
        } 

    } 

}
