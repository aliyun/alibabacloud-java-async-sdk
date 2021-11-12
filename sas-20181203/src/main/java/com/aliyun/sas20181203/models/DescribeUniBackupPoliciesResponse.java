// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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


    private DescribeUniBackupPoliciesResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniBackupPoliciesResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUniBackupPoliciesResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUniBackupPoliciesResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(DescribeUniBackupPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeUniBackupPoliciesResponse build() {
            return new DescribeUniBackupPoliciesResponse(this);
        } 

    } 

}
