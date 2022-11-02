// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseResourcesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourcesResponse</p>
 */
public class DescribeDefenseResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDefenseResourcesResponseBody body;

    private DescribeDefenseResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDefenseResourcesResponse create() {
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
    public DescribeDefenseResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDefenseResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDefenseResourcesResponseBody body);

        @Override
        DescribeDefenseResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDefenseResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDefenseResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDefenseResourcesResponse response) {
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
        public Builder body(DescribeDefenseResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDefenseResourcesResponse build() {
            return new DescribeDefenseResourcesResponse(this);
        } 

    } 

}
