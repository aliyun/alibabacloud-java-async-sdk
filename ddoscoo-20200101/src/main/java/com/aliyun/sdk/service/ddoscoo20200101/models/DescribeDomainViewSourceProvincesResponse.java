// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainViewSourceProvincesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainViewSourceProvincesResponse</p>
 */
public class DescribeDomainViewSourceProvincesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainViewSourceProvincesResponseBody body;

    private DescribeDomainViewSourceProvincesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainViewSourceProvincesResponse create() {
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
    public DescribeDomainViewSourceProvincesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainViewSourceProvincesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainViewSourceProvincesResponseBody body);

        @Override
        DescribeDomainViewSourceProvincesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainViewSourceProvincesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainViewSourceProvincesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainViewSourceProvincesResponse response) {
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
        public Builder body(DescribeDomainViewSourceProvincesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainViewSourceProvincesResponse build() {
            return new DescribeDomainViewSourceProvincesResponse(this);
        } 

    } 

}
