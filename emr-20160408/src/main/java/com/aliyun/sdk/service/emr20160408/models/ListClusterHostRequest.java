// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHostRequest} extends {@link RequestModel}
 *
 * <p>ListClusterHostRequest</p>
 */
public class ListClusterHostRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComponentName")
    private String componentName;

    @Query
    @NameInMap("GroupType")
    private String groupType;

    @Query
    @NameInMap("HostGroupId")
    private String hostGroupId;

    @Query
    @NameInMap("HostInstanceId")
    private String hostInstanceId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PrivateIp")
    private String privateIp;

    @Query
    @NameInMap("PublicIp")
    private String publicIp;

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

    private ListClusterHostRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentName = builder.componentName;
        this.groupType = builder.groupType;
        this.hostGroupId = builder.hostGroupId;
        this.hostInstanceId = builder.hostInstanceId;
        this.hostName = builder.hostName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.privateIp = builder.privateIp;
        this.publicIp = builder.publicIp;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterHostRequest create() {
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
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return hostInstanceId
     */
    public String getHostInstanceId() {
        return this.hostInstanceId;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
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
     * @return privateIp
     */
    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * @return publicIp
     */
    public String getPublicIp() {
        return this.publicIp;
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

    public static final class Builder extends Request.Builder<ListClusterHostRequest, Builder> {
        private String clusterId; 
        private String componentName; 
        private String groupType; 
        private String hostGroupId; 
        private String hostInstanceId; 
        private String hostName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String privateIp; 
        private String publicIp; 
        private String regionId; 
        private Long resourceOwnerId; 
        private java.util.List < String > statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterHostRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.componentName = response.componentName;
            this.groupType = response.groupType;
            this.hostGroupId = response.hostGroupId;
            this.hostInstanceId = response.hostInstanceId;
            this.hostName = response.hostName;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.privateIp = response.privateIp;
            this.publicIp = response.publicIp;
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
         * ComponentName.
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * GroupType.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
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
         * HostInstanceId.
         */
        public Builder hostInstanceId(String hostInstanceId) {
            this.putQueryParameter("HostInstanceId", hostInstanceId);
            this.hostInstanceId = hostInstanceId;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
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
         * PrivateIp.
         */
        public Builder privateIp(String privateIp) {
            this.putQueryParameter("PrivateIp", privateIp);
            this.privateIp = privateIp;
            return this;
        }

        /**
         * PublicIp.
         */
        public Builder publicIp(String publicIp) {
            this.putQueryParameter("PublicIp", publicIp);
            this.publicIp = publicIp;
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
        public ListClusterHostRequest build() {
            return new ListClusterHostRequest(this);
        } 

    } 

}
