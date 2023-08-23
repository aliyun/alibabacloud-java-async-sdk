// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaResponse} extends {@link TeaModel}
 *
 * <p>GetQuotaResponse</p>
 */
public class GetQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQuotaResponseBody body;

    private GetQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQuotaResponse create() {
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
    public GetQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQuotaResponseBody body);

        @Override
        GetQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQuotaResponse response) {
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
        public Builder body(GetQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQuotaResponse build() {
            return new GetQuotaResponse(this);
        } 

    } 

}
