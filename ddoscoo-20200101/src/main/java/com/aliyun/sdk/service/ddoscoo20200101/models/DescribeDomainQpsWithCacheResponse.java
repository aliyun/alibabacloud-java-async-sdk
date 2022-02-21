// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainQpsWithCacheResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainQpsWithCacheResponse</p>
 */
public class DescribeDomainQpsWithCacheResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainQpsWithCacheResponseBody body;

    private DescribeDomainQpsWithCacheResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainQpsWithCacheResponse create() {
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
    public DescribeDomainQpsWithCacheResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainQpsWithCacheResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainQpsWithCacheResponseBody body);

        @Override
        DescribeDomainQpsWithCacheResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainQpsWithCacheResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainQpsWithCacheResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainQpsWithCacheResponse response) {
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
        public Builder body(DescribeDomainQpsWithCacheResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainQpsWithCacheResponse build() {
            return new DescribeDomainQpsWithCacheResponse(this);
        } 

    } 

}
