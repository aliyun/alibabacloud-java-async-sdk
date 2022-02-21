// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOfficeSitesResponse} extends {@link TeaModel}
 *
 * <p>DescribeOfficeSitesResponse</p>
 */
public class DescribeOfficeSitesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOfficeSitesResponseBody body;

    private DescribeOfficeSitesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOfficeSitesResponse create() {
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
    public DescribeOfficeSitesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOfficeSitesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOfficeSitesResponseBody body);

        @Override
        DescribeOfficeSitesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOfficeSitesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOfficeSitesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOfficeSitesResponse response) {
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
        public Builder body(DescribeOfficeSitesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOfficeSitesResponse build() {
            return new DescribeOfficeSitesResponse(this);
        } 

    } 

}
