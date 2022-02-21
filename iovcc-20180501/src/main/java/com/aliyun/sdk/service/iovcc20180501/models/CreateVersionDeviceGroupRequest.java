// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVersionDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateVersionDeviceGroupRequest</p>
 */
public class CreateVersionDeviceGroupRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("MaxCount")
    @Validation(required = true)
    private String maxCount;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateVersionDeviceGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.maxCount = builder.maxCount;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVersionDeviceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return maxCount
     */
    public String getMaxCount() {
        return this.maxCount;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateVersionDeviceGroupRequest, Builder> {
        private String description; 
        private String maxCount; 
        private String name; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVersionDeviceGroupRequest response) {
            super(response);
            this.description = response.description;
            this.maxCount = response.maxCount;
            this.name = response.name;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * MaxCount.
         */
        public Builder maxCount(String maxCount) {
            this.putQueryParameter("MaxCount", maxCount);
            this.maxCount = maxCount;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        @Override
        public CreateVersionDeviceGroupRequest build() {
            return new CreateVersionDeviceGroupRequest(this);
        } 

    } 

}
