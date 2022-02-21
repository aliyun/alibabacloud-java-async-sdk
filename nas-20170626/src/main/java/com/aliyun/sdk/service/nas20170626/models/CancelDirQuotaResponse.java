// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelDirQuotaResponse} extends {@link TeaModel}
 *
 * <p>CancelDirQuotaResponse</p>
 */
public class CancelDirQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelDirQuotaResponseBody body;

    private CancelDirQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelDirQuotaResponse create() {
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
    public CancelDirQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelDirQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelDirQuotaResponseBody body);

        @Override
        CancelDirQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelDirQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelDirQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelDirQuotaResponse response) {
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
        public Builder body(CancelDirQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelDirQuotaResponse build() {
            return new CancelDirQuotaResponse(this);
        } 

    } 

}
