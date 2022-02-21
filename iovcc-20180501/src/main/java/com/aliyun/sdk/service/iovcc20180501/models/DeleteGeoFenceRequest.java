// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGeoFenceRequest} extends {@link RequestModel}
 *
 * <p>DeleteGeoFenceRequest</p>
 */
public class DeleteGeoFenceRequest extends Request {
    @Query
    @NameInMap("FenceId")
    @Validation(required = true)
    private Long fenceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteGeoFenceRequest(Builder builder) {
        super(builder);
        this.fenceId = builder.fenceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGeoFenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fenceId
     */
    public Long getFenceId() {
        return this.fenceId;
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

    public static final class Builder extends Request.Builder<DeleteGeoFenceRequest, Builder> {
        private Long fenceId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGeoFenceRequest response) {
            super(response);
            this.fenceId = response.fenceId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * FenceId.
         */
        public Builder fenceId(Long fenceId) {
            this.putQueryParameter("FenceId", fenceId);
            this.fenceId = fenceId;
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
        public DeleteGeoFenceRequest build() {
            return new DeleteGeoFenceRequest(this);
        } 

    } 

}
