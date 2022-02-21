// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEdgeDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListEdgeDevicesRequest</p>
 */
public class ListEdgeDevicesRequest extends Request {
    @Query
    @NameInMap("EdgeDeviceName")
    private String edgeDeviceName;

    @Query
    @NameInMap("EdgeDeviceType")
    private Long edgeDeviceType;

    @Query
    @NameInMap("HostDeviceId")
    @Validation(required = true)
    private String hostDeviceId;

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

    private ListEdgeDevicesRequest(Builder builder) {
        super(builder);
        this.edgeDeviceName = builder.edgeDeviceName;
        this.edgeDeviceType = builder.edgeDeviceType;
        this.hostDeviceId = builder.hostDeviceId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeDeviceName
     */
    public String getEdgeDeviceName() {
        return this.edgeDeviceName;
    }

    /**
     * @return edgeDeviceType
     */
    public Long getEdgeDeviceType() {
        return this.edgeDeviceType;
    }

    /**
     * @return hostDeviceId
     */
    public String getHostDeviceId() {
        return this.hostDeviceId;
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

    public static final class Builder extends Request.Builder<ListEdgeDevicesRequest, Builder> {
        private String edgeDeviceName; 
        private Long edgeDeviceType; 
        private String hostDeviceId; 
        private Long pageIndex; 
        private Long pageSize; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEdgeDevicesRequest response) {
            super(response);
            this.edgeDeviceName = response.edgeDeviceName;
            this.edgeDeviceType = response.edgeDeviceType;
            this.hostDeviceId = response.hostDeviceId;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * EdgeDeviceName.
         */
        public Builder edgeDeviceName(String edgeDeviceName) {
            this.putQueryParameter("EdgeDeviceName", edgeDeviceName);
            this.edgeDeviceName = edgeDeviceName;
            return this;
        }

        /**
         * EdgeDeviceType.
         */
        public Builder edgeDeviceType(Long edgeDeviceType) {
            this.putQueryParameter("EdgeDeviceType", edgeDeviceType);
            this.edgeDeviceType = edgeDeviceType;
            return this;
        }

        /**
         * HostDeviceId.
         */
        public Builder hostDeviceId(String hostDeviceId) {
            this.putQueryParameter("HostDeviceId", hostDeviceId);
            this.hostDeviceId = hostDeviceId;
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

        @Override
        public ListEdgeDevicesRequest build() {
            return new ListEdgeDevicesRequest(this);
        } 

    } 

}
