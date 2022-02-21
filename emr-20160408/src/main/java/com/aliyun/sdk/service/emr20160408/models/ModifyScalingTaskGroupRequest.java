// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingTaskGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingTaskGroupRequest</p>
 */
public class ModifyScalingTaskGroupRequest extends Request {
    @Query
    @NameInMap("ActiveRuleCategory")
    private String activeRuleCategory;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DefaultCooldown")
    private Integer defaultCooldown;

    @Query
    @NameInMap("HostGroupId")
    @Validation(required = true)
    private String hostGroupId;

    @Query
    @NameInMap("MaxSize")
    private Integer maxSize;

    @Query
    @NameInMap("MinSize")
    private Integer minSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TimeoutWithGrace")
    private Long timeoutWithGrace;

    @Query
    @NameInMap("WithGrace")
    private Boolean withGrace;

    private ModifyScalingTaskGroupRequest(Builder builder) {
        super(builder);
        this.activeRuleCategory = builder.activeRuleCategory;
        this.clusterId = builder.clusterId;
        this.defaultCooldown = builder.defaultCooldown;
        this.hostGroupId = builder.hostGroupId;
        this.maxSize = builder.maxSize;
        this.minSize = builder.minSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.timeoutWithGrace = builder.timeoutWithGrace;
        this.withGrace = builder.withGrace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingTaskGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeRuleCategory
     */
    public String getActiveRuleCategory() {
        return this.activeRuleCategory;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return defaultCooldown
     */
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return maxSize
     */
    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return minSize
     */
    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return timeoutWithGrace
     */
    public Long getTimeoutWithGrace() {
        return this.timeoutWithGrace;
    }

    /**
     * @return withGrace
     */
    public Boolean getWithGrace() {
        return this.withGrace;
    }

    public static final class Builder extends Request.Builder<ModifyScalingTaskGroupRequest, Builder> {
        private String activeRuleCategory; 
        private String clusterId; 
        private Integer defaultCooldown; 
        private String hostGroupId; 
        private Integer maxSize; 
        private Integer minSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private Long timeoutWithGrace; 
        private Boolean withGrace; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingTaskGroupRequest response) {
            super(response);
            this.activeRuleCategory = response.activeRuleCategory;
            this.clusterId = response.clusterId;
            this.defaultCooldown = response.defaultCooldown;
            this.hostGroupId = response.hostGroupId;
            this.maxSize = response.maxSize;
            this.minSize = response.minSize;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.timeoutWithGrace = response.timeoutWithGrace;
            this.withGrace = response.withGrace;
        } 

        /**
         * ActiveRuleCategory.
         */
        public Builder activeRuleCategory(String activeRuleCategory) {
            this.putQueryParameter("ActiveRuleCategory", activeRuleCategory);
            this.activeRuleCategory = activeRuleCategory;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DefaultCooldown.
         */
        public Builder defaultCooldown(Integer defaultCooldown) {
            this.putQueryParameter("DefaultCooldown", defaultCooldown);
            this.defaultCooldown = defaultCooldown;
            return this;
        }

        /**
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * MaxSize.
         */
        public Builder maxSize(Integer maxSize) {
            this.putQueryParameter("MaxSize", maxSize);
            this.maxSize = maxSize;
            return this;
        }

        /**
         * MinSize.
         */
        public Builder minSize(Integer minSize) {
            this.putQueryParameter("MinSize", minSize);
            this.minSize = minSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * TimeoutWithGrace.
         */
        public Builder timeoutWithGrace(Long timeoutWithGrace) {
            this.putQueryParameter("TimeoutWithGrace", timeoutWithGrace);
            this.timeoutWithGrace = timeoutWithGrace;
            return this;
        }

        /**
         * WithGrace.
         */
        public Builder withGrace(Boolean withGrace) {
            this.putQueryParameter("WithGrace", withGrace);
            this.withGrace = withGrace;
            return this;
        }

        @Override
        public ModifyScalingTaskGroupRequest build() {
            return new ModifyScalingTaskGroupRequest(this);
        } 

    } 

}
