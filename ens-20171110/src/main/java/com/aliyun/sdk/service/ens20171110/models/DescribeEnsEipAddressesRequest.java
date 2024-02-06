// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsEipAddressesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsEipAddressesRequest</p>
 */
public class DescribeEnsEipAddressesRequest extends Request {
    @Query
    @NameInMap("AllocationId")
    private String allocationId;

    @Query
    @NameInMap("AssociatedInstanceId")
    private String associatedInstanceId;

    @Query
    @NameInMap("AssociatedInstanceType")
    private String associatedInstanceType;

    @Query
    @NameInMap("EipAddress")
    private String eipAddress;

    @Query
    @NameInMap("EipName")
    private String eipName;

    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("Standby")
    private String standby;

    private DescribeEnsEipAddressesRequest(Builder builder) {
        super(builder);
        this.allocationId = builder.allocationId;
        this.associatedInstanceId = builder.associatedInstanceId;
        this.associatedInstanceType = builder.associatedInstanceType;
        this.eipAddress = builder.eipAddress;
        this.eipName = builder.eipName;
        this.ensRegionId = builder.ensRegionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.standby = builder.standby;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsEipAddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return associatedInstanceId
     */
    public String getAssociatedInstanceId() {
        return this.associatedInstanceId;
    }

    /**
     * @return associatedInstanceType
     */
    public String getAssociatedInstanceType() {
        return this.associatedInstanceType;
    }

    /**
     * @return eipAddress
     */
    public String getEipAddress() {
        return this.eipAddress;
    }

    /**
     * @return eipName
     */
    public String getEipName() {
        return this.eipName;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
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
     * @return standby
     */
    public String getStandby() {
        return this.standby;
    }

    public static final class Builder extends Request.Builder<DescribeEnsEipAddressesRequest, Builder> {
        private String allocationId; 
        private String associatedInstanceId; 
        private String associatedInstanceType; 
        private String eipAddress; 
        private String eipName; 
        private String ensRegionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String standby; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsEipAddressesRequest request) {
            super(request);
            this.allocationId = request.allocationId;
            this.associatedInstanceId = request.associatedInstanceId;
            this.associatedInstanceType = request.associatedInstanceType;
            this.eipAddress = request.eipAddress;
            this.eipName = request.eipName;
            this.ensRegionId = request.ensRegionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.standby = request.standby;
        } 

        /**
         * The ID of the EIP that you want to query. You can specify up to 50 EIP IDs. Separate multiple IDs with commas (,).
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * The ID of the instance with which you want to associate the EIP.
         */
        public Builder associatedInstanceId(String associatedInstanceId) {
            this.putQueryParameter("AssociatedInstanceId", associatedInstanceId);
            this.associatedInstanceId = associatedInstanceId;
            return this;
        }

        /**
         * The type of the instance with which you want to associate the EIP. Valid values:
         * <p>
         * 
         * *   **EnsInstance**: ENS instance in a VPC
         * *   **SlbInstance**: Edge Load Balancer (ELB) instance
         */
        public Builder associatedInstanceType(String associatedInstanceType) {
            this.putQueryParameter("AssociatedInstanceType", associatedInstanceType);
            this.associatedInstanceType = associatedInstanceType;
            return this;
        }

        /**
         * The EIP that you want to query. You can specify up to 50 EIPs. Separate multiple EIPs with commas (,).
         */
        public Builder eipAddress(String eipAddress) {
            this.putQueryParameter("EipAddress", eipAddress);
            this.eipAddress = eipAddress;
            return this;
        }

        /**
         * The name of the EIP.
         */
        public Builder eipName(String eipName) {
            this.putQueryParameter("EipName", eipName);
            this.eipName = eipName;
            return this;
        }

        /**
         * The ID of the Edge Node Service (ENS) node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether the EIP is a secondary EIP. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder standby(String standby) {
            this.putQueryParameter("Standby", standby);
            this.standby = standby;
            return this;
        }

        @Override
        public DescribeEnsEipAddressesRequest build() {
            return new DescribeEnsEipAddressesRequest(this);
        } 

    } 

}
