// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcTaxIllegalResponse} extends {@link TeaModel}
 *
 * <p>GetOcTaxIllegalResponse</p>
 */
public class GetOcTaxIllegalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcTaxIllegalResponseBody body;

    private GetOcTaxIllegalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcTaxIllegalResponse create() {
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
    public GetOcTaxIllegalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcTaxIllegalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcTaxIllegalResponseBody body);

        @Override
        GetOcTaxIllegalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcTaxIllegalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcTaxIllegalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcTaxIllegalResponse response) {
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
        public Builder body(GetOcTaxIllegalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcTaxIllegalResponse build() {
            return new GetOcTaxIllegalResponse(this);
        } 

    } 

}
