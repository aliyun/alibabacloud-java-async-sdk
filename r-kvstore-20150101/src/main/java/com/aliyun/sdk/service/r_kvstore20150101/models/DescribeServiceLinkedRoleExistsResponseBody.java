// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeServiceLinkedRoleExistsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceLinkedRoleExistsResponseBody</p>
 */
public class DescribeServiceLinkedRoleExistsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExistsServiceLinkedRole")
    private Boolean existsServiceLinkedRole;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeServiceLinkedRoleExistsResponseBody(Builder builder) {
        this.existsServiceLinkedRole = builder.existsServiceLinkedRole;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLinkedRoleExistsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return existsServiceLinkedRole
     */
    public Boolean getExistsServiceLinkedRole() {
        return this.existsServiceLinkedRole;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean existsServiceLinkedRole; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeServiceLinkedRoleExistsResponseBody model) {
            this.existsServiceLinkedRole = model.existsServiceLinkedRole;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the service-linked role has been authorized for the current account. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Authorized.</p>
         * </li>
         * <li><p><strong>false</strong>: Not authorized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder existsServiceLinkedRole(Boolean existsServiceLinkedRole) {
            this.existsServiceLinkedRole = existsServiceLinkedRole;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90B82DB7-FB28-4CC2-ADBF-1F8659F3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceLinkedRoleExistsResponseBody build() {
            return new DescribeServiceLinkedRoleExistsResponseBody(this);
        } 

    } 

}
