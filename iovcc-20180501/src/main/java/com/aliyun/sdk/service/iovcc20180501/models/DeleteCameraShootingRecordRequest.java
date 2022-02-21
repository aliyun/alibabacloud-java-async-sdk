// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCameraShootingRecordRequest} extends {@link RequestModel}
 *
 * <p>DeleteCameraShootingRecordRequest</p>
 */
public class DeleteCameraShootingRecordRequest extends Request {
    @Query
    @NameInMap("EdgeDeviceId")
    @Validation(required = true)
    private String edgeDeviceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShootingRecordId")
    @Validation(required = true)
    private Long shootingRecordId;

    private DeleteCameraShootingRecordRequest(Builder builder) {
        super(builder);
        this.edgeDeviceId = builder.edgeDeviceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.shootingRecordId = builder.shootingRecordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCameraShootingRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeDeviceId
     */
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
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

    /**
     * @return shootingRecordId
     */
    public Long getShootingRecordId() {
        return this.shootingRecordId;
    }

    public static final class Builder extends Request.Builder<DeleteCameraShootingRecordRequest, Builder> {
        private String edgeDeviceId; 
        private String projectId; 
        private String regionId; 
        private Long shootingRecordId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCameraShootingRecordRequest response) {
            super(response);
            this.edgeDeviceId = response.edgeDeviceId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.shootingRecordId = response.shootingRecordId;
        } 

        /**
         * 终端设备id
         */
        public Builder edgeDeviceId(String edgeDeviceId) {
            this.putQueryParameter("EdgeDeviceId", edgeDeviceId);
            this.edgeDeviceId = edgeDeviceId;
            return this;
        }

        /**
         * 项目ID
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

        /**
         * 拍摄记录ID
         */
        public Builder shootingRecordId(Long shootingRecordId) {
            this.putQueryParameter("ShootingRecordId", shootingRecordId);
            this.shootingRecordId = shootingRecordId;
            return this;
        }

        @Override
        public DeleteCameraShootingRecordRequest build() {
            return new DeleteCameraShootingRecordRequest(this);
        } 

    } 

}
