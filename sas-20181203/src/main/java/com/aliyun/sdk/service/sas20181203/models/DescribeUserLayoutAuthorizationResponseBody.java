// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserLayoutAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserLayoutAuthorizationResponseBody</p>
 */
public class DescribeUserLayoutAuthorizationResponseBody extends TeaModel {
    @NameInMap("Authorized")
    private Boolean authorized;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUserLayoutAuthorizationResponseBody(Builder builder) {
        this.authorized = builder.authorized;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserLayoutAuthorizationResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorized
     */
    public Boolean getAuthorized() {
        return this.authorized;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean authorized; 
        private String requestId; 

        /**
         * The result of the query. Valid values:
         * <p>
         * - **true**: The brute-force attacks protection feature has been authorized.
         * - **false**: The brute-force attacks protection feature is not authorized.
         */
        public Builder authorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserLayoutAuthorizationResponseBody build() {
            return new DescribeUserLayoutAuthorizationResponseBody(this);
        } 

    } 

}
