// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcTaxClassAResponse} extends {@link TeaModel}
 *
 * <p>GetOcTaxClassAResponse</p>
 */
public class GetOcTaxClassAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcTaxClassAResponseBody body;

    private GetOcTaxClassAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcTaxClassAResponse create() {
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
    public GetOcTaxClassAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcTaxClassAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcTaxClassAResponseBody body);

        @Override
        GetOcTaxClassAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcTaxClassAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcTaxClassAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcTaxClassAResponse response) {
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
        public Builder body(GetOcTaxClassAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcTaxClassAResponse build() {
            return new GetOcTaxClassAResponse(this);
        } 

    } 

}
