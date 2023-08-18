// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdvisorChecksResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdvisorChecksResponse</p>
 */
public class DescribeAdvisorChecksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAdvisorChecksResponseBody body;

    private DescribeAdvisorChecksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAdvisorChecksResponse create() {
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
    public DescribeAdvisorChecksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdvisorChecksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAdvisorChecksResponseBody body);

        @Override
        DescribeAdvisorChecksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdvisorChecksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAdvisorChecksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdvisorChecksResponse response) {
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
        public Builder body(DescribeAdvisorChecksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdvisorChecksResponse build() {
            return new DescribeAdvisorChecksResponse(this);
        } 

    } 

}
