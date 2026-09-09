// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRoleAuthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoleAuthStatusResponseBody</p>
 */
public class DescribeRoleAuthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthStatus")
    private Boolean authStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRoleAuthStatusResponseBody(Builder builder) {
        this.authStatus = builder.authStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoleAuthStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authStatus
     */
    public Boolean getAuthStatus() {
        return this.authStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean authStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRoleAuthStatusResponseBody model) {
            this.authStatus = model.authStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the service-linked role for WAF is authorized.</p>
         * <ul>
         * <li><p><strong>true</strong>: The service-linked role is authorized.</p>
         * </li>
         * <li><p><strong>false</strong>: The service-linked role is not authorized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder authStatus(Boolean authStatus) {
            this.authStatus = authStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>79ECBB08-079C-57C5-A676-***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRoleAuthStatusResponseBody build() {
            return new DescribeRoleAuthStatusResponseBody(this);
        } 

    } 

}
