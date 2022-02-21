// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnHttpsDomainListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDcdnHttpsDomainListResponse</p>
 */
public class DescribeDcdnHttpsDomainListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDcdnHttpsDomainListResponseBody body;

    private DescribeDcdnHttpsDomainListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDcdnHttpsDomainListResponse create() {
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
    public DescribeDcdnHttpsDomainListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDcdnHttpsDomainListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDcdnHttpsDomainListResponseBody body);

        @Override
        DescribeDcdnHttpsDomainListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDcdnHttpsDomainListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDcdnHttpsDomainListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDcdnHttpsDomainListResponse response) {
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
        public Builder body(DescribeDcdnHttpsDomainListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDcdnHttpsDomainListResponse build() {
            return new DescribeDcdnHttpsDomainListResponse(this);
        } 

    } 

}
