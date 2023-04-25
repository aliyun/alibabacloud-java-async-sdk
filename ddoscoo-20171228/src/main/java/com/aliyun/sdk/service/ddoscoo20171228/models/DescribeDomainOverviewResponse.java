// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainOverviewResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainOverviewResponse</p>
 */
public class DescribeDomainOverviewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainOverviewResponseBody body;

    private DescribeDomainOverviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainOverviewResponse create() {
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
    public DescribeDomainOverviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainOverviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainOverviewResponseBody body);

        @Override
        DescribeDomainOverviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainOverviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainOverviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainOverviewResponse response) {
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
        public Builder body(DescribeDomainOverviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainOverviewResponse build() {
            return new DescribeDomainOverviewResponse(this);
        } 

    } 

}
