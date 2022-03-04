// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignIpv6AddressesRequest} extends {@link RequestModel}
 *
 * <p>AssignIpv6AddressesRequest</p>
 */
public class AssignIpv6AddressesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    private String networkInterfaceId;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("Ipv6Address")
    private java.util.List < String > ipv6Address;

    private AssignIpv6AddressesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.regionId = builder.regionId;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.ipv6Address = builder.ipv6Address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignIpv6AddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return ipv6Address
     */
    public java.util.List < String > getIpv6Address() {
        return this.ipv6Address;
    }

    public static final class Builder extends Request.Builder<AssignIpv6AddressesRequest, Builder> {
        private String sourceRegionId; 
        private String regionId; 
        private String networkInterfaceId; 
        private Integer ipv6AddressCount; 
        private java.util.List < String > ipv6Address; 

        private Builder() {
            super();
        } 

        private Builder(AssignIpv6AddressesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.regionId = request.regionId;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.ipv6Address = request.ipv6Address;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The ID of the region to which the Eni belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the Eni.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * Specify the number of randomly generated IPv6 addresses for the Eni. Valid values: 1 to 10.
         * <p>
         * 
         * > When you call this operation, you must set either the "Ipv6Addresses. **parameter or the "Ipv6AddressCount" parameter, but you cannot set both parameters at the same time.
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * Specify one or more IPv6 addresses for the Eni. You can set up to 10 IPv6 addresses. Valid values of N: 1 to 10.
         * <p>
         * 
         * Valid values: Ipv6Address.1=2001:db8:1234:1 a00::****
         * 
         * > When you call this operation, you must set either the "Ipv6Addresses. **parameter or the "Ipv6AddressCount" parameter, but you cannot set both parameters at the same time.
         */
        public Builder ipv6Address(java.util.List < String > ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        @Override
        public AssignIpv6AddressesRequest build() {
            return new AssignIpv6AddressesRequest(this);
        } 

    } 

}
