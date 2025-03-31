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
 * {@link CreatePoolRequest} extends {@link RequestModel}
 *
 * <p>CreatePoolRequest</p>
 */
public class CreatePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String poolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceLimits")
    private ResourceLimits resourceLimits;

    private CreatePoolRequest(Builder builder) {
        super(builder);
        this.poolName = builder.poolName;
        this.priority = builder.priority;
        this.resourceLimits = builder.resourceLimits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePoolRequest create() {
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

    public static final class Builder extends Request.Builder<CreatePoolRequest, Builder> {
        private String poolName; 
        private Integer priority; 
        private ResourceLimits resourceLimits; 

        private Builder() {
            super();
        } 

        private Builder(CreatePoolRequest request) {
            super(request);
            this.poolName = request.poolName;
            this.priority = request.priority;
            this.resourceLimits = request.resourceLimits;
        } 

        /**
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
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * ResourceLimits.
         */
        public Builder resourceLimits(ResourceLimits resourceLimits) {
            String resourceLimitsShrink = shrink(resourceLimits, "ResourceLimits", "json");
            this.putQueryParameter("ResourceLimits", resourceLimitsShrink);
            this.resourceLimits = resourceLimits;
            return this;
        }

        @Override
        public CreatePoolRequest build() {
            return new CreatePoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePoolRequest} extends {@link TeaModel}
     *
     * <p>CreatePoolRequest</p>
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
             * MaxExectorNum.
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
