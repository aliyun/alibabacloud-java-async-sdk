// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnComputeUserDomainResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnComputeUserDomainResponse</p>
 */
public class DescribeCdnComputeUserDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnComputeUserDomainResponseBody body;

    private DescribeCdnComputeUserDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnComputeUserDomainResponse create() {
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
    public DescribeCdnComputeUserDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnComputeUserDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnComputeUserDomainResponseBody body);

        @Override
        DescribeCdnComputeUserDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnComputeUserDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnComputeUserDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnComputeUserDomainResponse response) {
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
        public Builder body(DescribeCdnComputeUserDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnComputeUserDomainResponse build() {
            return new DescribeCdnComputeUserDomainResponse(this);
        } 

    } 

}
