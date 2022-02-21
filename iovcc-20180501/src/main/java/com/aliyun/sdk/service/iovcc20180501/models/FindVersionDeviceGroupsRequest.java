// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionDeviceGroupsRequest} extends {@link RequestModel}
 *
 * <p>FindVersionDeviceGroupsRequest</p>
 */
public class FindVersionDeviceGroupsRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OriginalId")
    private String originalId;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true)
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private FindVersionDeviceGroupsRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.name = builder.name;
        this.originalId = builder.originalId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindVersionDeviceGroupsRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return originalId
     */
    public String getOriginalId() {
        return this.originalId;
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

    public static final class Builder extends Request.Builder<FindVersionDeviceGroupsRequest, Builder> {
        private String deviceId; 
        private String name; 
        private String originalId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(FindVersionDeviceGroupsRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.name = response.name;
            this.originalId = response.originalId;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OriginalId.
         */
        public Builder originalId(String originalId) {
            this.putQueryParameter("OriginalId", originalId);
            this.originalId = originalId;
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

        @Override
        public FindVersionDeviceGroupsRequest build() {
            return new FindVersionDeviceGroupsRequest(this);
        } 

    } 

}
