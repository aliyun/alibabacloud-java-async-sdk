// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link TransformClusterMemberRequest} extends {@link RequestModel}
 *
 * <p>TransformClusterMemberRequest</p>
 */
public class TransformClusterMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetClusterId;

    private TransformClusterMemberRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.password = builder.password;
        this.targetClusterId = builder.targetClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformClusterMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return targetClusterId
     */
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

    public static final class Builder extends Request.Builder<TransformClusterMemberRequest, Builder> {
        private String instanceIds; 
        private String password; 
        private String targetClusterId; 

        private Builder() {
            super();
        } 

        private Builder(TransformClusterMemberRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.password = request.password;
            this.targetClusterId = request.targetClusterId;
        } 

        /**
         * <p>The IDs of the ECS instances. Separate multiple IDs with a comma (,).</p>
         * <ul>
         * <li><p>The instances must be in the same VPC as the target cluster.</p>
         * </li>
         * <li><p>An instance can belong to only one cluster at a time.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze7s2v0b789k60p****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The logon password to set for the instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The ID of the target cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b3e3f77b-462e-<strong><strong>-</strong></strong>-bec8727a****</p>
         */
        public Builder targetClusterId(String targetClusterId) {
            this.putQueryParameter("TargetClusterId", targetClusterId);
            this.targetClusterId = targetClusterId;
            return this;
        }

        @Override
        public TransformClusterMemberRequest build() {
            return new TransformClusterMemberRequest(this);
        } 

    } 

}
