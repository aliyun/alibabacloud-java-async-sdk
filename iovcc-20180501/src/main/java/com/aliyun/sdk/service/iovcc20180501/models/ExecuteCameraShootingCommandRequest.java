// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteCameraShootingCommandRequest} extends {@link RequestModel}
 *
 * <p>ExecuteCameraShootingCommandRequest</p>
 */
public class ExecuteCameraShootingCommandRequest extends Request {
    @Query
    @NameInMap("EdgeDeviceId")
    @Validation(required = true)
    private String edgeDeviceId;

    @Query
    @NameInMap("Number")
    private Long number;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShootingType")
    @Validation(required = true)
    private Long shootingType;

    @Query
    @NameInMap("Time")
    private Long time;

    private ExecuteCameraShootingCommandRequest(Builder builder) {
        super(builder);
        this.edgeDeviceId = builder.edgeDeviceId;
        this.number = builder.number;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.shootingType = builder.shootingType;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteCameraShootingCommandRequest create() {
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
     * @return number
     */
    public Long getNumber() {
        return this.number;
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
     * @return shootingType
     */
    public Long getShootingType() {
        return this.shootingType;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<ExecuteCameraShootingCommandRequest, Builder> {
        private String edgeDeviceId; 
        private Long number; 
        private String projectId; 
        private String regionId; 
        private Long shootingType; 
        private Long time; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteCameraShootingCommandRequest response) {
            super(response);
            this.edgeDeviceId = response.edgeDeviceId;
            this.number = response.number;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.shootingType = response.shootingType;
            this.time = response.time;
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
         * 拍摄数量
         */
        public Builder number(Long number) {
            this.putQueryParameter("Number", number);
            this.number = number;
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
         * 拍摄类型，0-图片，1-视频
         */
        public Builder shootingType(Long shootingType) {
            this.putQueryParameter("ShootingType", shootingType);
            this.shootingType = shootingType;
            return this;
        }

        /**
         * 拍照间隔/视频时长，单位为s
         */
        public Builder time(Long time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public ExecuteCameraShootingCommandRequest build() {
            return new ExecuteCameraShootingCommandRequest(this);
        } 

    } 

}
