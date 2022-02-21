// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCameraShootingRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListCameraShootingRecordsRequest</p>
 */
public class ListCameraShootingRecordsRequest extends Request {
    @Query
    @NameInMap("EdgeDeviceId")
    @Validation(required = true)
    private String edgeDeviceId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true)
    private Long pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShootingType")
    private Long shootingType;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private ListCameraShootingRecordsRequest(Builder builder) {
        super(builder);
        this.edgeDeviceId = builder.edgeDeviceId;
        this.endTime = builder.endTime;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.shootingType = builder.shootingType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCameraShootingRecordsRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListCameraShootingRecordsRequest, Builder> {
        private String edgeDeviceId; 
        private Long endTime; 
        private Long pageIndex; 
        private Long pageSize; 
        private String projectId; 
        private String regionId; 
        private Long shootingType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListCameraShootingRecordsRequest response) {
            super(response);
            this.edgeDeviceId = response.edgeDeviceId;
            this.endTime = response.endTime;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.shootingType = response.shootingType;
            this.startTime = response.startTime;
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
         * 截止时间
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 查询开始页号
         */
        public Builder pageIndex(Long pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * 每页记录数
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * 起始时间
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListCameraShootingRecordsRequest build() {
            return new ListCameraShootingRecordsRequest(this);
        } 

    } 

}
