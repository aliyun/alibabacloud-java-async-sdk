// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniBackupPoliciesResponse} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupPoliciesResponse</p>
 */
public class DescribeUniBackupPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUniBackupPoliciesResponseBody body;

    private DescribeUniBackupPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUniBackupPoliciesResponse create() {
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
    public DescribeUniBackupPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUniBackupPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUniBackupPoliciesResponseBody body);

        @Override
        DescribeUniBackupPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUniBackupPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUniBackupPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUniBackupPoliciesResponse response) {
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
        public Builder body(DescribeUniBackupPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUniBackupPoliciesResponse build() {
            return new DescribeUniBackupPoliciesResponse(this);
        } 

    } 

}
