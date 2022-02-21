// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnWafDomainResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnWafDomainResponse</p>
 */
public class DescribeCdnWafDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnWafDomainResponseBody body;

    private DescribeCdnWafDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnWafDomainResponse create() {
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
    public DescribeCdnWafDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnWafDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnWafDomainResponseBody body);

        @Override
        DescribeCdnWafDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnWafDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnWafDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnWafDomainResponse response) {
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
        public Builder body(DescribeCdnWafDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnWafDomainResponse build() {
            return new DescribeCdnWafDomainResponse(this);
        } 

    } 

}
