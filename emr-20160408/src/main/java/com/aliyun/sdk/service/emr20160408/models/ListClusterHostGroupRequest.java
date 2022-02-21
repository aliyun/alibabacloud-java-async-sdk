// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHostGroupRequest} extends {@link RequestModel}
 *
 * <p>ListClusterHostGroupRequest</p>
 */
public class ListClusterHostGroupRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("HostGroupId")
    private String hostGroupId;

    @Query
    @NameInMap("HostGroupName")
    private String hostGroupName;

    @Query
    @NameInMap("HostGroupType")
    private String hostGroupType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    private ListClusterHostGroupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.hostGroupId = builder.hostGroupId;
        this.hostGroupName = builder.hostGroupName;
        this.hostGroupType = builder.hostGroupType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterHostGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return hostGroupName
     */
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    /**
     * @return hostGroupType
     */
    public String getHostGroupType() {
        return this.hostGroupType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListClusterHostGroupRequest, Builder> {
        private String clusterId; 
        private String hostGroupId; 
        private String hostGroupName; 
        private String hostGroupType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private java.util.List < String > statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterHostGroupRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.hostGroupId = response.hostGroupId;
            this.hostGroupName = response.hostGroupName;
            this.hostGroupType = response.hostGroupType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.statusList = response.statusList;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * HostGroupName.
         */
        public Builder hostGroupName(String hostGroupName) {
            this.putQueryParameter("HostGroupName", hostGroupName);
            this.hostGroupName = hostGroupName;
            return this;
        }

        /**
         * HostGroupType.
         */
        public Builder hostGroupType(String hostGroupType) {
            this.putQueryParameter("HostGroupType", hostGroupType);
            this.hostGroupType = hostGroupType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListClusterHostGroupRequest build() {
            return new ListClusterHostGroupRequest(this);
        } 

    } 

}
