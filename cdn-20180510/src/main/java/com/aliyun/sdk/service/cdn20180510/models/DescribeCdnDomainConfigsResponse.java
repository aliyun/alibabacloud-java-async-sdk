// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainConfigsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainConfigsResponse</p>
 */
public class DescribeCdnDomainConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnDomainConfigsResponseBody body;

    private DescribeCdnDomainConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnDomainConfigsResponse create() {
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
    public DescribeCdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnDomainConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnDomainConfigsResponseBody body);

        @Override
        DescribeCdnDomainConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnDomainConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnDomainConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnDomainConfigsResponse response) {
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
        public Builder body(DescribeCdnDomainConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnDomainConfigsResponse build() {
            return new DescribeCdnDomainConfigsResponse(this);
        } 

    } 

}
