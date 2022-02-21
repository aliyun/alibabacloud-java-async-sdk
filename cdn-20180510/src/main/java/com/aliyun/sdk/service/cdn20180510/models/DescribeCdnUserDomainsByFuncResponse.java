// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserDomainsByFuncResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserDomainsByFuncResponse</p>
 */
public class DescribeCdnUserDomainsByFuncResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnUserDomainsByFuncResponseBody body;

    private DescribeCdnUserDomainsByFuncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnUserDomainsByFuncResponse create() {
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
    public DescribeCdnUserDomainsByFuncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnUserDomainsByFuncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnUserDomainsByFuncResponseBody body);

        @Override
        DescribeCdnUserDomainsByFuncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnUserDomainsByFuncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnUserDomainsByFuncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnUserDomainsByFuncResponse response) {
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
        public Builder body(DescribeCdnUserDomainsByFuncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnUserDomainsByFuncResponse build() {
            return new DescribeCdnUserDomainsByFuncResponse(this);
        } 

    } 

}
