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
         * AllocationId.
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * AssociatedInstanceId.
         */
        public Builder associatedInstanceId(String associatedInstanceId) {
            this.putQueryParameter("AssociatedInstanceId", associatedInstanceId);
            this.associatedInstanceId = associatedInstanceId;
            return this;
        }

        /**
         * AssociatedInstanceType.
         */
        public Builder associatedInstanceType(String associatedInstanceType) {
            this.putQueryParameter("AssociatedInstanceType", associatedInstanceType);
            this.associatedInstanceType = associatedInstanceType;
            return this;
        }

        /**
         * EipAddress.
         */
        public Builder eipAddress(String eipAddress) {
            this.putQueryParameter("EipAddress", eipAddress);
            this.eipAddress = eipAddress;
            return this;
        }

        /**
         * EipName.
         */
        public Builder eipName(String eipName) {
            this.putQueryParameter("EipName", eipName);
            this.eipName = eipName;
            return this;
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
         * Standby.
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
