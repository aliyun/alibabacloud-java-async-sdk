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

    private UpdatePoolRequest(Builder builder) {
        super(builder);
        this.poolName = builder.poolName;
        this.priority = builder.priority;
        this.resourceLimits = builder.resourceLimits;
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

    public static final class Builder extends Request.Builder<UpdatePoolRequest, Builder> {
        private String poolName; 
        private Integer priority; 
        private ResourceLimits resourceLimits; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePoolRequest request) {
            super(request);
            this.poolName = request.poolName;
            this.priority = request.priority;
            this.resourceLimits = request.resourceLimits;
        } 

        /**
         * <p>The name of the resource pool.</p>
         * <ul>
         * <li>The value can be up to 15 characters in length.</li>
         * <li>It can contain digits, uppercase letters, lowercase letters, underscores (_), and dots (.).</li>
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
         * <li>You can set a priority in the range of 1 to 99. The default value is 1, which is the lowest priority.</li>
         * <li>Jobs submitted to a resource pool with a higher priority level value will be scheduled before pending jobs in a resource pool with a lower priority level value, and the priority level of the resource pool takes precedence over the priority of the job.</li>
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
         * <p>The quota of resources that users are allowed to concurrently use in a resource pool.</p>
         */
        public Builder resourceLimits(ResourceLimits resourceLimits) {
            String resourceLimitsShrink = shrink(resourceLimits, "ResourceLimits", "json");
            this.putQueryParameter("ResourceLimits", resourceLimitsShrink);
            this.resourceLimits = resourceLimits;
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
        @com.aliyun.core.annotation.NameInMap("MaxExectorNum")
        private Integer maxExectorNum;

        private ResourceLimits(Builder builder) {
            this.maxExectorNum = builder.maxExectorNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceLimits create() {
            return builder().build();
        }

        /**
         * @return maxExectorNum
         */
        public Integer getMaxExectorNum() {
            return this.maxExectorNum;
        }

        public static final class Builder {
            private Integer maxExectorNum; 

            private Builder() {
            } 

            private Builder(ResourceLimits model) {
                this.maxExectorNum = model.maxExectorNum;
            } 

            /**
             * <p>The maximum number of concurrent execution nodes in a resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder maxExectorNum(Integer maxExectorNum) {
                this.maxExectorNum = maxExectorNum;
                return this;
            }

            public ResourceLimits build() {
                return new ResourceLimits(this);
            } 

        } 

    }
}
