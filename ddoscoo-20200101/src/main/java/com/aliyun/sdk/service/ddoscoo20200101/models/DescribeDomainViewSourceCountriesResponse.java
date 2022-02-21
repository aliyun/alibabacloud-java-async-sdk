// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainViewSourceCountriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainViewSourceCountriesResponse</p>
 */
public class DescribeDomainViewSourceCountriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainViewSourceCountriesResponseBody body;

    private DescribeDomainViewSourceCountriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainViewSourceCountriesResponse create() {
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
    public DescribeDomainViewSourceCountriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainViewSourceCountriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainViewSourceCountriesResponseBody body);

        @Override
        DescribeDomainViewSourceCountriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainViewSourceCountriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainViewSourceCountriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainViewSourceCountriesResponse response) {
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
        public Builder body(DescribeDomainViewSourceCountriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainViewSourceCountriesResponse build() {
            return new DescribeDomainViewSourceCountriesResponse(this);
        } 

    } 

}
