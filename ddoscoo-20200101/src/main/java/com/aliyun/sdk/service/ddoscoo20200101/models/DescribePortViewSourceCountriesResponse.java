// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortViewSourceCountriesResponse} extends {@link TeaModel}
 *
 * <p>DescribePortViewSourceCountriesResponse</p>
 */
public class DescribePortViewSourceCountriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePortViewSourceCountriesResponseBody body;

    private DescribePortViewSourceCountriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePortViewSourceCountriesResponse create() {
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
    public DescribePortViewSourceCountriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePortViewSourceCountriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePortViewSourceCountriesResponseBody body);

        @Override
        DescribePortViewSourceCountriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePortViewSourceCountriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePortViewSourceCountriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePortViewSourceCountriesResponse response) {
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
        public Builder body(DescribePortViewSourceCountriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePortViewSourceCountriesResponse build() {
            return new DescribePortViewSourceCountriesResponse(this);
        } 

    } 

}
