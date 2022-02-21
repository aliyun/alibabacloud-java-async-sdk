// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVehicleRequest} extends {@link RequestModel}
 *
 * <p>ListVehicleRequest</p>
 */
public class ListVehicleRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Vin")
    private String vin;

    private ListVehicleRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.vin = builder.vin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVehicleRequest create() {
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
     * @return vin
     */
    public String getVin() {
        return this.vin;
    }

    public static final class Builder extends Request.Builder<ListVehicleRequest, Builder> {
        private String deviceId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String projectId; 
        private String regionId; 
        private String vin; 

        private Builder() {
            super();
        } 

        private Builder(ListVehicleRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.vin = response.vin;
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

        /**
         * Vin.
         */
        public Builder vin(String vin) {
            this.putQueryParameter("Vin", vin);
            this.vin = vin;
            return this;
        }

        @Override
        public ListVehicleRequest build() {
            return new ListVehicleRequest(this);
        } 

    } 

}
