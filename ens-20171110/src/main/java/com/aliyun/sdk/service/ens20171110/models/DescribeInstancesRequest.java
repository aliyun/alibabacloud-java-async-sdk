// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstancesRequest</p>
 */
public class DescribeInstancesRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @Query
    @NameInMap("EnsRegionIds")
    private String ensRegionIds;

    @Query
    @NameInMap("EnsServiceId")
    private String ensServiceId;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InstanceResourceType")
    private String instanceResourceType;

    @Query
    @NameInMap("NetworkId")
    private String networkId;

    @Query
    @NameInMap("OrderByParams")
    private String orderByParams;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("SearchKey")
    private String searchKey;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeInstancesRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.ensRegionIds = builder.ensRegionIds;
        this.ensServiceId = builder.ensServiceId;
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
        this.instanceIds = builder.instanceIds;
        this.instanceName = builder.instanceName;
        this.instanceResourceType = builder.instanceResourceType;
        this.networkId = builder.networkId;
        this.orderByParams = builder.orderByParams;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.securityGroupId = builder.securityGroupId;
        this.status = builder.status;
        this.vSwitchId = builder.vSwitchId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return ensRegionIds
     */
    public String getEnsRegionIds() {
        return this.ensRegionIds;
    }

    /**
     * @return ensServiceId
     */
    public String getEnsServiceId() {
        return this.ensServiceId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceResourceType
     */
    public String getInstanceResourceType() {
        return this.instanceResourceType;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return orderByParams
     */
    public String getOrderByParams() {
        return this.orderByParams;
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
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesRequest, Builder> {
        private String ensRegionId; 
        private String ensRegionIds; 
        private String ensServiceId; 
        private String imageId; 
        private String instanceId; 
        private String instanceIds; 
        private String instanceName; 
        private String instanceResourceType; 
        private String networkId; 
        private String orderByParams; 
        private Integer pageNumber; 
        private String pageSize; 
        private String searchKey; 
        private String securityGroupId; 
        private String status; 
        private String vSwitchId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesRequest response) {
            super(response);
            this.ensRegionId = response.ensRegionId;
            this.ensRegionIds = response.ensRegionIds;
            this.ensServiceId = response.ensServiceId;
            this.imageId = response.imageId;
            this.instanceId = response.instanceId;
            this.instanceIds = response.instanceIds;
            this.instanceName = response.instanceName;
            this.instanceResourceType = response.instanceResourceType;
            this.networkId = response.networkId;
            this.orderByParams = response.orderByParams;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.searchKey = response.searchKey;
            this.securityGroupId = response.securityGroupId;
            this.status = response.status;
            this.vSwitchId = response.vSwitchId;
            this.version = response.version;
        } 

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * EnsRegionIds.
         */
        public Builder ensRegionIds(String ensRegionIds) {
            this.putQueryParameter("EnsRegionIds", ensRegionIds);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * EnsServiceId.
         */
        public Builder ensServiceId(String ensServiceId) {
            this.putQueryParameter("EnsServiceId", ensServiceId);
            this.ensServiceId = ensServiceId;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceResourceType.
         */
        public Builder instanceResourceType(String instanceResourceType) {
            this.putQueryParameter("InstanceResourceType", instanceResourceType);
            this.instanceResourceType = instanceResourceType;
            return this;
        }

        /**
         * NetworkId.
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * OrderByParams.
         */
        public Builder orderByParams(String orderByParams) {
            this.putQueryParameter("OrderByParams", orderByParams);
            this.orderByParams = orderByParams;
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
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
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
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeInstancesRequest build() {
            return new DescribeInstancesRequest(this);
        } 

    } 

}
