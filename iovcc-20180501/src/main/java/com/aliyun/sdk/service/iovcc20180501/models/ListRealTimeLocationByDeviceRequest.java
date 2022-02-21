// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealTimeLocationByDeviceRequest} extends {@link RequestModel}
 *
 * <p>ListRealTimeLocationByDeviceRequest</p>
 */
public class ListRealTimeLocationByDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceIdList")
    @Validation(required = true)
    private java.util.List < String > deviceIdList;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListRealTimeLocationByDeviceRequest(Builder builder) {
        super(builder);
        this.deviceIdList = builder.deviceIdList;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealTimeLocationByDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceIdList
     */
    public java.util.List < String > getDeviceIdList() {
        return this.deviceIdList;
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

    public static final class Builder extends Request.Builder<ListRealTimeLocationByDeviceRequest, Builder> {
        private java.util.List < String > deviceIdList; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListRealTimeLocationByDeviceRequest response) {
            super(response);
            this.deviceIdList = response.deviceIdList;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * DeviceIdList.
         */
        public Builder deviceIdList(java.util.List < String > deviceIdList) {
            this.putQueryParameter("DeviceIdList", deviceIdList);
            this.deviceIdList = deviceIdList;
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
        public ListRealTimeLocationByDeviceRequest build() {
            return new ListRealTimeLocationByDeviceRequest(this);
        } 

    } 

}
