// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResolveResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainResolveResponse</p>
 */
public class DescribeDomainResolveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainResolveResponseBody body;

    private DescribeDomainResolveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainResolveResponse create() {
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
    public DescribeDomainResolveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainResolveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainResolveResponseBody body);

        @Override
        DescribeDomainResolveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainResolveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainResolveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainResolveResponse response) {
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
        public Builder body(DescribeDomainResolveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainResolveResponse build() {
            return new DescribeDomainResolveResponse(this);
        } 

    } 

}
