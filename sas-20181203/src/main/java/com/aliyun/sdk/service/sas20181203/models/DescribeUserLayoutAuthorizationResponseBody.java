// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserLayoutAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserLayoutAuthorizationResponseBody</p>
 */
public class DescribeUserLayoutAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Authorized")
    private Boolean authorized;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The result of the query. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The brute-force attacks protection feature has been authorized.</li>
         * <li><strong>false</strong>: The brute-force attacks protection feature is not authorized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder authorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4A80EE8F-2175-49DA-B8BF-FAE1B3D52E4C</p>
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
