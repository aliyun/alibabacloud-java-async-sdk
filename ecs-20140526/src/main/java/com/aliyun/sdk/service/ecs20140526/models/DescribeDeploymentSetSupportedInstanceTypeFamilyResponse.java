// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentSetSupportedInstanceTypeFamilyResponse} extends {@link TeaModel}
 *
 * <p>DescribeDeploymentSetSupportedInstanceTypeFamilyResponse</p>
 */
public class DescribeDeploymentSetSupportedInstanceTypeFamilyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody body;

    private DescribeDeploymentSetSupportedInstanceTypeFamilyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDeploymentSetSupportedInstanceTypeFamilyResponse create() {
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
    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDeploymentSetSupportedInstanceTypeFamilyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody body);

        @Override
        DescribeDeploymentSetSupportedInstanceTypeFamilyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDeploymentSetSupportedInstanceTypeFamilyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDeploymentSetSupportedInstanceTypeFamilyResponse response) {
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
        public Builder body(DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse build() {
            return new DescribeDeploymentSetSupportedInstanceTypeFamilyResponse(this);
        } 

    } 

}
