// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PublicIpAddresses")
    private String publicIpAddresses;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.instanceIds = builder.instanceIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publicIpAddresses = builder.publicIpAddresses;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
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
     * @return publicIpAddresses
     */
    public String getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String chargeType; 
        private String instanceIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String publicIpAddresses; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.instanceIds = request.instanceIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.publicIpAddresses = request.publicIpAddresses;
            this.regionId = request.regionId;
        } 

        /**
         * The billing method of the simple application server. Set the value to PrePaid, which indicates the subscription billing method. Only the subscription billing method is supported.
         * <p>
         * 
         * Default value: PrePaid.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The IDs of the simple application servers. The value can be a JSON array that consists of up to 100 simple application server IDs. Separate the server IDs with commas (,).
         * <p>
         * 
         * >  If you specify both `InstanceIds` and `PublicIpAddresses`, make sure that each specified ID and its corresponding public IP address belong to the same simple application server. Otherwise, an empty result is returned.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The public IP addresses of the simple application servers. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,).
         * <p>
         * 
         * >  If you specify both `InstanceIds` and `PublicIpAddresses`, make sure that each specified ID and its corresponding public IP address belong to the same simple application server. Otherwise, an empty result is returned.
         */
        public Builder publicIpAddresses(String publicIpAddresses) {
            this.putQueryParameter("PublicIpAddresses", publicIpAddresses);
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }

        /**
         * The region ID of the simple application servers.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
