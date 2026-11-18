// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link UpdatePoolRequest} extends {@link RequestModel}
 *
 * <p>UpdatePoolRequest</p>
 */
public class UpdatePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceLimits")
    private ResourceLimits resourceLimits;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulingPolicyId")
    private String schedulingPolicyId;

    private UpdatePoolRequest(Builder builder) {
        super(builder);
        this.poolName = builder.poolName;
        this.priority = builder.priority;
        this.resourceLimits = builder.resourceLimits;
        this.schedulingPolicyId = builder.schedulingPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return poolName
     */
    public String getPoolName() {
        return this.poolName;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return resourceLimits
     */
    public ResourceLimits getResourceLimits() {
        return this.resourceLimits;
    }

    /**
     * @return schedulingPolicyId
     */
    public String getSchedulingPolicyId() {
        return this.schedulingPolicyId;
    }

    public static final class Builder extends Request.Builder<UpdatePoolRequest, Builder> {
        private String poolName; 
        private Integer priority; 
        private ResourceLimits resourceLimits; 
        private String schedulingPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePoolRequest request) {
            super(request);
            this.poolName = request.poolName;
            this.priority = request.priority;
            this.resourceLimits = request.resourceLimits;
            this.schedulingPolicyId = request.schedulingPolicyId;
        } 

        /**
         * <p>The name of the resource pool.</p>
         * <ul>
         * <li>The name can be up to 15 characters in length.</li>
         * <li>The name can contain digits, uppercase letters, lowercase letters, underscores (_), and periods (.).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PoolTest</p>
         */
        public Builder poolName(String poolName) {
            this.putQueryParameter("PoolName", poolName);
            this.poolName = poolName;
            return this;
        }

        /**
         * <p>The priority of the resource pool.</p>
         * <ul>
         * <li>Valid values: 1 to 99. Default value: 1, which indicates the lowest priority.</li>
         * <li>Jobs submitted to a resource pool with a higher priority value are scheduled before pending jobs in resource pools with lower priority values. The priority of a resource pool takes precedence over the priority of a job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The resource quota limit for concurrent usage by a user within a resource pool.</p>
         */
        public Builder resourceLimits(ResourceLimits resourceLimits) {
            String resourceLimitsShrink = shrink(resourceLimits, "ResourceLimits", "json");
            this.putQueryParameter("ResourceLimits", resourceLimitsShrink);
            this.resourceLimits = resourceLimits;
            return this;
        }

        /**
         * <p>The scheduling policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxx</p>
         */
        public Builder schedulingPolicyId(String schedulingPolicyId) {
            this.putQueryParameter("SchedulingPolicyId", schedulingPolicyId);
            this.schedulingPolicyId = schedulingPolicyId;
            return this;
        }

        @Override
        public UpdatePoolRequest build() {
            return new UpdatePoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePoolRequest} extends {@link TeaModel}
     *
     * <p>UpdatePoolRequest</p>
     */
    public static class ResourceLimits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxExecutorNum")
        private Integer maxExecutorNum;

        private ResourceLimits(Builder builder) {
            this.maxExecutorNum = builder.maxExecutorNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceLimits create() {
            return builder().build();
        }

        /**
         * @return maxExecutorNum
         */
        public Integer getMaxExecutorNum() {
            return this.maxExecutorNum;
        }

        public static final class Builder {
            private Integer maxExecutorNum; 

            private Builder() {
            } 

            private Builder(ResourceLimits model) {
                this.maxExecutorNum = model.maxExecutorNum;
            } 

            /**
             * <p>The maximum number of executor nodes that a user can concurrently run within a resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxExecutorNum(Integer maxExecutorNum) {
                this.maxExecutorNum = maxExecutorNum;
                return this;
            }

            public ResourceLimits build() {
                return new ResourceLimits(this);
            } 

        } 

    }
}
