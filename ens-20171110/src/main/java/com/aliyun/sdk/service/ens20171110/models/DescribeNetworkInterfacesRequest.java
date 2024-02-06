// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInterfacesRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkInterfacesRequest</p>
 */
public class DescribeNetworkInterfacesRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NetworkId")
    private String networkId;

    @Query
    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @Query
    @NameInMap("NetworkInterfaceName")
    @Validation(maxLength = 128)
    private String networkInterfaceName;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private String pageSize;

    @Query
    @NameInMap("PrimaryIpAddress")
    private String primaryIpAddress;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    private DescribeNetworkInterfacesRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.instanceId = builder.instanceId;
        this.networkId = builder.networkId;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.primaryIpAddress = builder.primaryIpAddress;
        this.securityGroupId = builder.securityGroupId;
        this.status = builder.status;
        this.type = builder.type;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInterfacesRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return networkInterfaceName
     */
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return primaryIpAddress
     */
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkInterfacesRequest, Builder> {
        private String ensRegionId; 
        private String instanceId; 
        private String networkId; 
        private String networkInterfaceId; 
        private String networkInterfaceName; 
        private String pageNumber; 
        private String pageSize; 
        private String primaryIpAddress; 
        private String securityGroupId; 
        private String status; 
        private String type; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkInterfacesRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.instanceId = request.instanceId;
            this.networkId = request.networkId;
            this.networkInterfaceId = request.networkInterfaceId;
            this.networkInterfaceName = request.networkInterfaceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.primaryIpAddress = request.primaryIpAddress;
            this.securityGroupId = request.securityGroupId;
            this.status = request.status;
            this.type = request.type;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * The region ID of the instance.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the network.
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * The ID of the ENI.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * The name of the ENI.
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.putQueryParameter("NetworkInterfaceName", networkInterfaceName);
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Maximum value: 50. Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The primary IP address of the ENI.
         */
        public Builder primaryIpAddress(String primaryIpAddress) {
            this.putQueryParameter("PrimaryIpAddress", primaryIpAddress);
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }

        /**
         * The ID of the security group to which the secondary ENI belongs. To query the details of secondary ENIs based on the ID of a security group, specify this parameter.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The status of the ENI. Valid values:
         * <p>
         * 
         * *   Available: The ENI is available.
         * *   Attaching: The ENI is being attached to an instance.
         * *   InUse: The ENI is attached to an instance.
         * *   Detaching: The ENI is being detached from an instance.
         * *   Deleting: The ENI is being deleted.
         * 
         * This parameter is empty by default, which indicates that ENIs in all states are queried.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of the ENI. Valid values:
         * <p>
         * 
         * *   Primary
         * *   Secondary
         * 
         * This parameter is empty by default, which indicates that both primary and secondary ENIs are queried.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public DescribeNetworkInterfacesRequest build() {
            return new DescribeNetworkInterfacesRequest(this);
        } 

    } 

}
