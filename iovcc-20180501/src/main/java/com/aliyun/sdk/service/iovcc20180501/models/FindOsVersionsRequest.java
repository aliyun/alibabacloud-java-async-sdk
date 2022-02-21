// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindOsVersionsRequest} extends {@link RequestModel}
 *
 * <p>FindOsVersionsRequest</p>
 */
public class FindOsVersionsRequest extends Request {
    @Query
    @NameInMap("DeviceModelId")
    private String deviceModelId;

    @Query
    @NameInMap("IsMilestone")
    private String isMilestone;

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
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("SystemVersion")
    private String systemVersion;

    @Query
    @NameInMap("VersionId")
    private String versionId;

    private FindOsVersionsRequest(Builder builder) {
        super(builder);
        this.deviceModelId = builder.deviceModelId;
        this.isMilestone = builder.isMilestone;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.status = builder.status;
        this.systemVersion = builder.systemVersion;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindOsVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceModelId
     */
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    /**
     * @return isMilestone
     */
    public String getIsMilestone() {
        return this.isMilestone;
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return systemVersion
     */
    public String getSystemVersion() {
        return this.systemVersion;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<FindOsVersionsRequest, Builder> {
        private String deviceModelId; 
        private String isMilestone; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String projectId; 
        private String regionId; 
        private String remark; 
        private String status; 
        private String systemVersion; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(FindOsVersionsRequest response) {
            super(response);
            this.deviceModelId = response.deviceModelId;
            this.isMilestone = response.isMilestone;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.remark = response.remark;
            this.status = response.status;
            this.systemVersion = response.systemVersion;
            this.versionId = response.versionId;
        } 

        /**
         * DeviceModelId.
         */
        public Builder deviceModelId(String deviceModelId) {
            this.putQueryParameter("DeviceModelId", deviceModelId);
            this.deviceModelId = deviceModelId;
            return this;
        }

        /**
         * IsMilestone.
         */
        public Builder isMilestone(String isMilestone) {
            this.putQueryParameter("IsMilestone", isMilestone);
            this.isMilestone = isMilestone;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SystemVersion.
         */
        public Builder systemVersion(String systemVersion) {
            this.putQueryParameter("SystemVersion", systemVersion);
            this.systemVersion = systemVersion;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public FindOsVersionsRequest build() {
            return new FindOsVersionsRequest(this);
        } 

    } 

}
