// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListHostDevicesRequest</p>
 */
public class ListHostDevicesRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

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
    @NameInMap("SerialNumber")
    private String serialNumber;

    private ListHostDevicesRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.deviceName = builder.deviceName;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostDevicesRequest create() {
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
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
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
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static final class Builder extends Request.Builder<ListHostDevicesRequest, Builder> {
        private String deviceId; 
        private String deviceName; 
        private Long pageIndex; 
        private Long pageSize; 
        private String projectId; 
        private String regionId; 
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(ListHostDevicesRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.deviceName = response.deviceName;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.serialNumber = response.serialNumber;
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
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * 查询开始页
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
         * SerialNumber.
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        @Override
        public ListHostDevicesRequest build() {
            return new ListHostDevicesRequest(this);
        } 

    } 

}
