// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckQuotaResponse} extends {@link TeaModel}
 *
 * <p>CheckQuotaResponse</p>
 */
public class CheckQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckQuotaResponseBody body;

    private CheckQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckQuotaResponse create() {
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
    public CheckQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckQuotaResponseBody body);

        @Override
        CheckQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckQuotaResponse response) {
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
        public Builder body(CheckQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckQuotaResponse build() {
            return new CheckQuotaResponse(this);
        } 

    } 

}
