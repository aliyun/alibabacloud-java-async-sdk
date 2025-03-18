// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLoadBalancersRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoadBalancersRequest</p>
 */
public class DescribeLoadBalancersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
    private java.util.List<String> ensRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
    private String loadBalancerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerId")
    private String serverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private DescribeLoadBalancersRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.ensRegionId = builder.ensRegionId;
        this.ensRegionIds = builder.ensRegionIds;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.networkId = builder.networkId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serverId = builder.serverId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
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
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
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
     * @return serverId
     */
    public String getServerId() {
        return this.serverId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<DescribeLoadBalancersRequest, Builder> {
        private String address; 
        private String ensRegionId; 
        private java.util.List<String> ensRegionIds; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String loadBalancerStatus; 
        private String networkId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String serverId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLoadBalancersRequest request) {
            super(request);
            this.address = request.address;
            this.ensRegionId = request.ensRegionId;
            this.ensRegionIds = request.ensRegionIds;
            this.loadBalancerId = request.loadBalancerId;
            this.loadBalancerName = request.loadBalancerName;
            this.loadBalancerStatus = request.loadBalancerStatus;
            this.networkId = request.networkId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serverId = request.serverId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The IP address that the ELB instance uses to provide services.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>The ID of the Edge Node Service (ENS) node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-guangzhou-10</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * EnsRegionIds.
         */
        public Builder ensRegionIds(java.util.List<String> ensRegionIds) {
            this.putQueryParameter("EnsRegionIds", ensRegionIds);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * <p>The ID of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5q73cv04zeyh43lh74lp4****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The name of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The status of the listener for the ELB instance. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: The listener for the instance can forward the received traffic based on forwarding rules.</li>
         * <li><strong>InActive</strong>: The listener for the instance does not forward the received traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InActive</p>
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.putQueryParameter("LoadBalancerStatus", loadBalancerStatus);
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5s9ayrxsd9hszrlt5fgv2****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: <strong>10</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5f67ffjc004wwz0t****</p>
         */
        public Builder serverId(String serverId) {
            this.putQueryParameter("ServerId", serverId);
            this.serverId = serverId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5sy773iy25rulsmgskmba****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public DescribeLoadBalancersRequest build() {
            return new DescribeLoadBalancersRequest(this);
        } 

    } 

}
