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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69D55DEC-B219-569F-A686-AC2F67A1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tag status of the ReplicaSet node. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The tag is created.</p>
         * </li>
         * <li><p><strong>false</strong>: The tag is not created.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the instance is a sharded cluster, this parameter returns false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder roleTagStatus(String roleTagStatus) {
            this.roleTagStatus = roleTagStatus;
            return this;
        }

        /**
         * <p>The tag status of each node in the sharded cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The tag is created.</p>
         * </li>
         * <li><p><strong>false</strong>: The tag is not created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;d-2ze204b4db58****&quot;: &quot;false&quot;,
         *     &quot;d-2zeb9716646e***&quot;: &quot;false&quot;
         * }</p>
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
