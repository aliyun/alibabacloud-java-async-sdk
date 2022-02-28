// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulDetailsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVulDetailsResponse</p>
 */
public class DescribeVulDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVulDetailsResponseBody body;

    private DescribeVulDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVulDetailsResponse create() {
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
    public DescribeVulDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVulDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVulDetailsResponseBody body);

        @Override
        DescribeVulDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVulDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVulDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVulDetailsResponse response) {
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
        public Builder body(DescribeVulDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVulDetailsResponse build() {
            return new DescribeVulDetailsResponse(this);
        } 

    } 

}
