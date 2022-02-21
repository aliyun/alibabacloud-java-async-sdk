// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainStagingConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainStagingConfigResponse</p>
 */
public class DescribeCdnDomainStagingConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnDomainStagingConfigResponseBody body;

    private DescribeCdnDomainStagingConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnDomainStagingConfigResponse create() {
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
    public DescribeCdnDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnDomainStagingConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnDomainStagingConfigResponseBody body);

        @Override
        DescribeCdnDomainStagingConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnDomainStagingConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnDomainStagingConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnDomainStagingConfigResponse response) {
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
        public Builder body(DescribeCdnDomainStagingConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnDomainStagingConfigResponse build() {
            return new DescribeCdnDomainStagingConfigResponse(this);
        } 

    } 

}
