// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeployedApisResponse} extends {@link TeaModel}
 *
 * <p>DescribeDeployedApisResponse</p>
 */
public class DescribeDeployedApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDeployedApisResponseBody body;

    private DescribeDeployedApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDeployedApisResponse create() {
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
    public DescribeDeployedApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDeployedApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDeployedApisResponseBody body);

        @Override
        DescribeDeployedApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDeployedApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDeployedApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDeployedApisResponse response) {
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
        public Builder body(DescribeDeployedApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDeployedApisResponse build() {
            return new DescribeDeployedApisResponse(this);
        } 

    } 

}
