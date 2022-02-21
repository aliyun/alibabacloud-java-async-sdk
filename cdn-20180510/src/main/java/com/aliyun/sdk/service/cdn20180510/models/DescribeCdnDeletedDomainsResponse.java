// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDeletedDomainsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnDeletedDomainsResponse</p>
 */
public class DescribeCdnDeletedDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnDeletedDomainsResponseBody body;

    private DescribeCdnDeletedDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnDeletedDomainsResponse create() {
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
    public DescribeCdnDeletedDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnDeletedDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnDeletedDomainsResponseBody body);

        @Override
        DescribeCdnDeletedDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnDeletedDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnDeletedDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnDeletedDomainsResponse response) {
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
        public Builder body(DescribeCdnDeletedDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnDeletedDomainsResponse build() {
            return new DescribeCdnDeletedDomainsResponse(this);
        } 

    } 

}
