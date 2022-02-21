// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnHttpsDomainListResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnHttpsDomainListResponse</p>
 */
public class DescribeCdnHttpsDomainListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnHttpsDomainListResponseBody body;

    private DescribeCdnHttpsDomainListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnHttpsDomainListResponse create() {
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
    public DescribeCdnHttpsDomainListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnHttpsDomainListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnHttpsDomainListResponseBody body);

        @Override
        DescribeCdnHttpsDomainListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnHttpsDomainListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnHttpsDomainListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnHttpsDomainListResponse response) {
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
        public Builder body(DescribeCdnHttpsDomainListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnHttpsDomainListResponse build() {
            return new DescribeCdnHttpsDomainListResponse(this);
        } 

    } 

}
