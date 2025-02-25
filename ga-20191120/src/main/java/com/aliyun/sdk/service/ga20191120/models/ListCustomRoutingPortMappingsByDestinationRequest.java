// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingPortMappingsByDestinationRequest} extends {@link RequestModel}
 *
 * <p>ListCustomRoutingPortMappingsByDestinationRequest</p>
 */
public class ListCustomRoutingPortMappingsByDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

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

    private ListCustomRoutingPortMappingsByDestinationRequest(Builder builder) {
        super(builder);
        this.destinationAddress = builder.destinationAddress;
        this.endpointId = builder.endpointId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomRoutingPortMappingsByDestinationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationAddress
     */
    public String getDestinationAddress() {
        return this.destinationAddress;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
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

    public static final class Builder extends Request.Builder<ListCustomRoutingPortMappingsByDestinationRequest, Builder> {
        private String destinationAddress; 
        private String endpointId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomRoutingPortMappingsByDestinationRequest request) {
            super(request);
            this.destinationAddress = request.destinationAddress;
            this.endpointId = request.endpointId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * The service IP address of the backend instance.
         */
        public Builder destinationAddress(String destinationAddress) {
            this.putQueryParameter("DestinationAddress", destinationAddress);
            this.destinationAddress = destinationAddress;
            return this;
        }

        /**
         * The ID of the endpoint to which the backend instance belongs.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListCustomRoutingPortMappingsByDestinationRequest build() {
            return new ListCustomRoutingPortMappingsByDestinationRequest(this);
        } 

    } 

}
