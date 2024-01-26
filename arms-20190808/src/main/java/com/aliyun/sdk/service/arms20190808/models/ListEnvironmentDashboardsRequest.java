// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentDashboardsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentDashboardsRequest</p>
 */
public class ListEnvironmentDashboardsRequest extends Request {
    @Query
    @NameInMap("AddonName")
    private String addonName;

    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Scene")
    private String scene;

    private ListEnvironmentDashboardsRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentDashboardsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentDashboardsRequest, Builder> {
        private String addonName; 
        private String environmentId; 
        private String regionId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentDashboardsRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
            this.scene = request.scene;
        } 

        /**
         * Name of Addon.AddonName and Scene are required.
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("AddonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * The ID of the environment instance.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Scene of Addon.AddonName and Scene are required
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public ListEnvironmentDashboardsRequest build() {
            return new ListEnvironmentDashboardsRequest(this);
        } 

    } 

}
