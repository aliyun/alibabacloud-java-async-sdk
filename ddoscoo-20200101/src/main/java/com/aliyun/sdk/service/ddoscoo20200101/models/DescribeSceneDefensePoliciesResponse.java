// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneDefensePoliciesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSceneDefensePoliciesResponse</p>
 */
public class DescribeSceneDefensePoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSceneDefensePoliciesResponseBody body;

    private DescribeSceneDefensePoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSceneDefensePoliciesResponse create() {
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
    public DescribeSceneDefensePoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSceneDefensePoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSceneDefensePoliciesResponseBody body);

        @Override
        DescribeSceneDefensePoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSceneDefensePoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSceneDefensePoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSceneDefensePoliciesResponse response) {
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
        public Builder body(DescribeSceneDefensePoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSceneDefensePoliciesResponse build() {
            return new DescribeSceneDefensePoliciesResponse(this);
        } 

    } 

}
