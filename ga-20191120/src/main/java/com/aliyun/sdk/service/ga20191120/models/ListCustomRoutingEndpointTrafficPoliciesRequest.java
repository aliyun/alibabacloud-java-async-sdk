// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingEndpointTrafficPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListCustomRoutingEndpointTrafficPoliciesRequest</p>
 */
public class ListCustomRoutingEndpointTrafficPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListCustomRoutingEndpointTrafficPoliciesRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.address = builder.address;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointId = builder.endpointId;
        this.listenerId = builder.listenerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomRoutingEndpointTrafficPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
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

    public static final class Builder extends Request.Builder<ListCustomRoutingEndpointTrafficPoliciesRequest, Builder> {
        private String acceleratorId; 
        private String address; 
        private String endpointGroupId; 
        private String endpointId; 
        private String listenerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomRoutingEndpointTrafficPoliciesRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.address = request.address;
            this.endpointGroupId = request.endpointGroupId;
            this.endpointId = request.endpointId;
            this.listenerId = request.listenerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the GA instance to which the traffic policies belong.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The IP address of the traffic destination.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * The ID of the endpoint group to which the traffic policies belong.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the endpoint to which the traffic policies belong.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The ID of the listener to which the traffic policies belong.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the Global Accelerator (GA) instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListCustomRoutingEndpointTrafficPoliciesRequest build() {
            return new ListCustomRoutingEndpointTrafficPoliciesRequest(this);
        } 

    } 

}
