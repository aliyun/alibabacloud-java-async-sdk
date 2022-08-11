// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsageForResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListUsageForResourceGroupRequest</p>
 */
public class ListUsageForResourceGroupRequest extends Request {
    @Body
    @NameInMap("EndTime")
    @Validation(required = true, minimum = 1547952690)
    private Long endTime;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ResourceGroupIdentifier")
    @Validation(required = true)
    private String resourceGroupIdentifier;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true, minimum = 1547952690)
    private Long startTime;

    private ListUsageForResourceGroupRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.projectEnv = builder.projectEnv;
        this.regionId = builder.regionId;
        this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsageForResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupIdentifier
     */
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListUsageForResourceGroupRequest, Builder> {
        private Long endTime; 
        private String projectEnv; 
        private String regionId; 
        private String resourceGroupIdentifier; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListUsageForResourceGroupRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.projectEnv = request.projectEnv;
            this.regionId = request.regionId;
            this.resourceGroupIdentifier = request.resourceGroupIdentifier;
            this.startTime = request.startTime;
        } 

        /**
         * 最晚当前时间
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupIdentifier.
         */
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            this.putBodyParameter("ResourceGroupIdentifier", resourceGroupIdentifier);
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }

        /**
         * 7天内
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListUsageForResourceGroupRequest build() {
            return new ListUsageForResourceGroupRequest(this);
        } 

    } 

}
