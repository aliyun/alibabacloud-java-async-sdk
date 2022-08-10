// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCountriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCountriesResponse</p>
 */
public class DescribeCountriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCountriesResponseBody body;

    private DescribeCountriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCountriesResponse create() {
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
    public DescribeCountriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCountriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCountriesResponseBody body);

        @Override
        DescribeCountriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCountriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCountriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCountriesResponse response) {
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
        public Builder body(DescribeCountriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCountriesResponse build() {
            return new DescribeCountriesResponse(this);
        } 

    } 

}
