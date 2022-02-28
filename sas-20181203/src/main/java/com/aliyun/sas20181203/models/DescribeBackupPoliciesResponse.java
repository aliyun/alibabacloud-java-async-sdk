// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPoliciesResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupPoliciesResponse</p>
 */
public class DescribeBackupPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupPoliciesResponseBody body;

    private DescribeBackupPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupPoliciesResponse create() {
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
    public DescribeBackupPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupPoliciesResponseBody body);

        @Override
        DescribeBackupPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupPoliciesResponse response) {
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
        public Builder body(DescribeBackupPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupPoliciesResponse build() {
            return new DescribeBackupPoliciesResponse(this);
        } 

    } 

}
