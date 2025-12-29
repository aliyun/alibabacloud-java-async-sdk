// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeRoleTagStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoleTagStatusResponseBody</p>
 */
public class DescribeRoleTagStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleTagStatus")
    private String roleTagStatus;

    @com.aliyun.core.annotation.NameInMap("ShardRoleTagStatus")
    private java.util.Map<String, ?> shardRoleTagStatus;

    private DescribeRoleTagStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roleTagStatus = builder.roleTagStatus;
        this.shardRoleTagStatus = builder.shardRoleTagStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoleTagStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleTagStatus
     */
    public String getRoleTagStatus() {
        return this.roleTagStatus;
    }

    /**
     * @return shardRoleTagStatus
     */
    public java.util.Map<String, ?> getShardRoleTagStatus() {
        return this.shardRoleTagStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String roleTagStatus; 
        private java.util.Map<String, ?> shardRoleTagStatus; 

        private Builder() {
        } 

        private Builder(DescribeRoleTagStatusResponseBody model) {
            this.requestId = model.requestId;
            this.roleTagStatus = model.roleTagStatus;
            this.shardRoleTagStatus = model.shardRoleTagStatus;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoleTagStatus.
         */
        public Builder roleTagStatus(String roleTagStatus) {
            this.roleTagStatus = roleTagStatus;
            return this;
        }

        /**
         * ShardRoleTagStatus.
         */
        public Builder shardRoleTagStatus(java.util.Map<String, ?> shardRoleTagStatus) {
            this.shardRoleTagStatus = shardRoleTagStatus;
            return this;
        }

        public DescribeRoleTagStatusResponseBody build() {
            return new DescribeRoleTagStatusResponseBody(this);
        } 

    } 

}
