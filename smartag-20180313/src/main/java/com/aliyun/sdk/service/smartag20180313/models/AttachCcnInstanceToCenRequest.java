// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link AttachCcnInstanceToCenRequest} extends {@link RequestModel}
 *
 * <p>AttachCcnInstanceToCenRequest</p>
 */
public class AttachCcnInstanceToCenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CcnId")
    private String ccnId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrAllocationMode")
    private String cidrAllocationMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionBindingList")
    private java.util.List<RegionBindingList> regionBindingList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subnet")
    private String subnet;

    private AttachCcnInstanceToCenRequest(Builder builder) {
        super(builder);
        this.ccnId = builder.ccnId;
        this.cenId = builder.cenId;
        this.cidrAllocationMode = builder.cidrAllocationMode;
        this.regionBindingList = builder.regionBindingList;
        this.regionId = builder.regionId;
        this.subnet = builder.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachCcnInstanceToCenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ccnId
     */
    public String getCcnId() {
        return this.ccnId;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return cidrAllocationMode
     */
    public String getCidrAllocationMode() {
        return this.cidrAllocationMode;
    }

    /**
     * @return regionBindingList
     */
    public java.util.List<RegionBindingList> getRegionBindingList() {
        return this.regionBindingList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subnet
     */
    public String getSubnet() {
        return this.subnet;
    }

    public static final class Builder extends Request.Builder<AttachCcnInstanceToCenRequest, Builder> {
        private String ccnId; 
        private String cenId; 
        private String cidrAllocationMode; 
        private java.util.List<RegionBindingList> regionBindingList; 
        private String regionId; 
        private String subnet; 

        private Builder() {
            super();
        } 

        private Builder(AttachCcnInstanceToCenRequest request) {
            super(request);
            this.ccnId = request.ccnId;
            this.cenId = request.cenId;
            this.cidrAllocationMode = request.cidrAllocationMode;
            this.regionBindingList = request.regionBindingList;
            this.regionId = request.regionId;
            this.subnet = request.subnet;
        } 

        /**
         * <p>The ID of the Cloud Connect Network (CCN) to attach.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-isdjvvkexkrpk*****</p>
         */
        public Builder ccnId(String ccnId) {
            this.putQueryParameter("CcnId", ccnId);
            this.ccnId = ccnId;
            return this;
        }

        /**
         * <p>The ID of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-joimmi1s2ob3rdxw79</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The CIDR block allocation mode. Valid values: PER_REGION and UNIFIED. PER_REGION indicates that a custom CIDR block is specified for each region. UNIFIED indicates that CIDR blocks are allocated in a unified manner.</p>
         * 
         * <strong>example:</strong>
         * <p>UNIFIED</p>
         */
        public Builder cidrAllocationMode(String cidrAllocationMode) {
            this.putQueryParameter("CidrAllocationMode", cidrAllocationMode);
            this.cidrAllocationMode = cidrAllocationMode;
            return this;
        }

        /**
         * <p>The list of transit routers (TRs) to be attached to the CCN.</p>
         */
        public Builder regionBindingList(java.util.List<RegionBindingList> regionBindingList) {
            String regionBindingListShrink = shrink(regionBindingList, "RegionBindingList", "json");
            this.putQueryParameter("RegionBindingList", regionBindingListShrink);
            this.regionBindingList = regionBindingList;
            return this;
        }

        /**
         * <p>The region ID of the Cloud Connect Network (CCN) instance. You can call the DescribeRegions operation to query the regions supported by Smart Access Gateway and the corresponding region IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Internet CIDR block used when the Cloud Connect Network (CCN) is attached to the Cloud Enterprise Network (CEN).</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.55.0/24</p>
         */
        public Builder subnet(String subnet) {
            this.putQueryParameter("Subnet", subnet);
            this.subnet = subnet;
            return this;
        }

        @Override
        public AttachCcnInstanceToCenRequest build() {
            return new AttachCcnInstanceToCenRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachCcnInstanceToCenRequest} extends {@link TeaModel}
     *
     * <p>AttachCcnInstanceToCenRequest</p>
     */
    public static class RegionBindingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        private RegionBindingList(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.regionId = builder.regionId;
            this.transitRouterId = builder.transitRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionBindingList create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String regionId; 
            private String transitRouterId; 

            private Builder() {
            } 

            private Builder(RegionBindingList model) {
                this.cidrBlock = model.cidrBlock;
                this.regionId = model.regionId;
                this.transitRouterId = model.transitRouterId;
            } 

            /**
             * <p>The custom CIDR block for each region when the CidrAllocationMode parameter is set to PER_REGION.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.60.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The region ID of the transit router to be attached.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-finance-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The transit router instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-wz9h1y152p7bajkehs5a3</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public RegionBindingList build() {
                return new RegionBindingList(this);
            } 

        } 

    }
}
