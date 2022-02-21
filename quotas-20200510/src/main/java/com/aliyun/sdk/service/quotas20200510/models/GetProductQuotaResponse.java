// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductQuotaResponse} extends {@link TeaModel}
 *
 * <p>GetProductQuotaResponse</p>
 */
public class GetProductQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProductQuotaResponseBody body;

    private GetProductQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProductQuotaResponse create() {
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
    public GetProductQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProductQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProductQuotaResponseBody body);

        @Override
        GetProductQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProductQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProductQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProductQuotaResponse response) {
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
        public Builder body(GetProductQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProductQuotaResponse build() {
            return new GetProductQuotaResponse(this);
        } 

    } 

}
