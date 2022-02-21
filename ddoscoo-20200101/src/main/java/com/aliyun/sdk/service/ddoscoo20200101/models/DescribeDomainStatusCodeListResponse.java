// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainStatusCodeListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainStatusCodeListResponse</p>
 */
public class DescribeDomainStatusCodeListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainStatusCodeListResponseBody body;

    private DescribeDomainStatusCodeListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainStatusCodeListResponse create() {
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
    public DescribeDomainStatusCodeListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainStatusCodeListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainStatusCodeListResponseBody body);

        @Override
        DescribeDomainStatusCodeListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainStatusCodeListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainStatusCodeListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainStatusCodeListResponse response) {
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
        public Builder body(DescribeDomainStatusCodeListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainStatusCodeListResponse build() {
            return new DescribeDomainStatusCodeListResponse(this);
        } 

    } 

}
