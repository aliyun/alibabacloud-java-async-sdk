// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeControlPlaneLogAlertRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeControlPlaneLogAlertRulesResponse</p>
 */
public class DescribeControlPlaneLogAlertRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeControlPlaneLogAlertRulesResponseBody body;

    private DescribeControlPlaneLogAlertRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeControlPlaneLogAlertRulesResponse create() {
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
    public DescribeControlPlaneLogAlertRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeControlPlaneLogAlertRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeControlPlaneLogAlertRulesResponseBody body);

        @Override
        DescribeControlPlaneLogAlertRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeControlPlaneLogAlertRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeControlPlaneLogAlertRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeControlPlaneLogAlertRulesResponse response) {
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
        public Builder body(DescribeControlPlaneLogAlertRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeControlPlaneLogAlertRulesResponse build() {
            return new DescribeControlPlaneLogAlertRulesResponse(this);
        } 

    } 

}
