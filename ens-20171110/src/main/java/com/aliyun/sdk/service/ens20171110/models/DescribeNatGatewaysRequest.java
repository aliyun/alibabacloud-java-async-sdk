// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatGatewaysRequest} extends {@link RequestModel}
 *
 * <p>DescribeNatGatewaysRequest</p>
 */
public class DescribeNatGatewaysRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @Query
    @NameInMap("NetworkId")
    private String networkId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    private DescribeNatGatewaysRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.name = builder.name;
        this.natGatewayId = builder.natGatewayId;
        this.networkId = builder.networkId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatGatewaysRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<DescribeNatGatewaysRequest, Builder> {
        private String ensRegionId; 
        private String name; 
        private String natGatewayId; 
        private String networkId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNatGatewaysRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.name = request.name;
            this.natGatewayId = request.natGatewayId;
            this.networkId = request.networkId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.vSwitchId = request.vSwitchId;
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
         * The name of the NAT gateway.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
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
         * The page number. Pages start from page **1**.
         * <p>
         * 
         * Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. The maximum value is **100**.
         * <p>
         * 
         * Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public DescribeNatGatewaysRequest build() {
            return new DescribeNatGatewaysRequest(this);
        } 

    } 

}
