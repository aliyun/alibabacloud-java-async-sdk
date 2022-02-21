// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindPrepublishPassedDevicesRequest} extends {@link RequestModel}
 *
 * <p>FindPrepublishPassedDevicesRequest</p>
 */
public class FindPrepublishPassedDevicesRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true)
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

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

    private FindPrepublishPassedDevicesRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.prepublishId = builder.prepublishId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindPrepublishPassedDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<FindPrepublishPassedDevicesRequest, Builder> {
        private String deviceId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String prepublishId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(FindPrepublishPassedDevicesRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.prepublishId = response.prepublishId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public FindPrepublishPassedDevicesRequest build() {
            return new FindPrepublishPassedDevicesRequest(this);
        } 

    } 

}
