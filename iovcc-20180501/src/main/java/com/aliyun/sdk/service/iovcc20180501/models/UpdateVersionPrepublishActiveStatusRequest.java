// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVersionPrepublishActiveStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateVersionPrepublishActiveStatusRequest</p>
 */
public class UpdateVersionPrepublishActiveStatusRequest extends Request {
    @Query
    @NameInMap("IsActive")
    @Validation(required = true)
    private String isActive;

    @Query
    @NameInMap("PrepublishId")
    @Validation(required = true)
    private String prepublishId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateVersionPrepublishActiveStatusRequest(Builder builder) {
        super(builder);
        this.isActive = builder.isActive;
        this.prepublishId = builder.prepublishId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVersionPrepublishActiveStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isActive
     */
    public String getIsActive() {
        return this.isActive;
    }

    /**
     * @return prepublishId
     */
    public String getPrepublishId() {
        return this.prepublishId;
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

    public static final class Builder extends Request.Builder<UpdateVersionPrepublishActiveStatusRequest, Builder> {
        private String isActive; 
        private String prepublishId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVersionPrepublishActiveStatusRequest response) {
            super(response);
            this.isActive = response.isActive;
            this.prepublishId = response.prepublishId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * IsActive.
         */
        public Builder isActive(String isActive) {
            this.putQueryParameter("IsActive", isActive);
            this.isActive = isActive;
            return this;
        }

        /**
         * PrepublishId.
         */
        public Builder prepublishId(String prepublishId) {
            this.putQueryParameter("PrepublishId", prepublishId);
            this.prepublishId = prepublishId;
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
        public UpdateVersionPrepublishActiveStatusRequest build() {
            return new UpdateVersionPrepublishActiveStatusRequest(this);
        } 

    } 

}
