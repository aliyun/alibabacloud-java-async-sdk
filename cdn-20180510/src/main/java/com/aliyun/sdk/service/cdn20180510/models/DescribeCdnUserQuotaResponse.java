// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserQuotaResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserQuotaResponse</p>
 */
public class DescribeCdnUserQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnUserQuotaResponseBody body;

    private DescribeCdnUserQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnUserQuotaResponse create() {
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
    public DescribeCdnUserQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnUserQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnUserQuotaResponseBody body);

        @Override
        DescribeCdnUserQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnUserQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnUserQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnUserQuotaResponse response) {
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
        public Builder body(DescribeCdnUserQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnUserQuotaResponse build() {
            return new DescribeCdnUserQuotaResponse(this);
        } 

    } 

}
