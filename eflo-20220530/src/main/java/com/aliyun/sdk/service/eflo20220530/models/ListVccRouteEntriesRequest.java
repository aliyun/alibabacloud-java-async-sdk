// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link ListVccRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListVccRouteEntriesRequest</p>
 */
public class ListVccRouteEntriesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnablePage")
    private Boolean enablePage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreDetailedRouteEntry")
    private Boolean ignoreDetailedRouteEntry;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextHopId")
    private String nextHopId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextHopType")
    private String nextHopType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RouteType")
    private String routeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vccId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdRouteEntryId")
    private String vpdRouteEntryId;

    private ListVccRouteEntriesRequest(Builder builder) {
        super(builder);
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.enablePage = builder.enablePage;
        this.ignoreDetailedRouteEntry = builder.ignoreDetailedRouteEntry;
        this.nextHopId = builder.nextHopId;
        this.nextHopType = builder.nextHopType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.routeType = builder.routeType;
        this.status = builder.status;
        this.vccId = builder.vccId;
        this.vpdRouteEntryId = builder.vpdRouteEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVccRouteEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return enablePage
     */
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    /**
     * @return ignoreDetailedRouteEntry
     */
    public Boolean getIgnoreDetailedRouteEntry() {
        return this.ignoreDetailedRouteEntry;
    }

    /**
     * @return nextHopId
     */
    public String getNextHopId() {
        return this.nextHopId;
    }

    /**
     * @return nextHopType
     */
    public String getNextHopType() {
        return this.nextHopType;
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return routeType
     */
    public String getRouteType() {
        return this.routeType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    /**
     * @return vpdRouteEntryId
     */
    public String getVpdRouteEntryId() {
        return this.vpdRouteEntryId;
    }

    public static final class Builder extends Request.Builder<ListVccRouteEntriesRequest, Builder> {
        private String destinationCidrBlock; 
        private Boolean enablePage; 
        private Boolean ignoreDetailedRouteEntry; 
        private String nextHopId; 
        private String nextHopType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String routeType; 
        private String status; 
        private String vccId; 
        private String vpdRouteEntryId; 

        private Builder() {
            super();
        } 

        private Builder(ListVccRouteEntriesRequest request) {
            super(request);
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.enablePage = request.enablePage;
            this.ignoreDetailedRouteEntry = request.ignoreDetailedRouteEntry;
            this.nextHopId = request.nextHopId;
            this.nextHopType = request.nextHopType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.routeType = request.routeType;
            this.status = request.status;
            this.vccId = request.vccId;
            this.vpdRouteEntryId = request.vpdRouteEntryId;
        } 

        /**
         * <p>Destination CIDR block</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>Specifies whether to enable pagination query.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enablePage(Boolean enablePage) {
            this.putBodyParameter("EnablePage", enablePage);
            this.enablePage = enablePage;
            return this;
        }

        /**
         * <p>Filter 32 detailed CIDR blocks. Default value: true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreDetailedRouteEntry(Boolean ignoreDetailedRouteEntry) {
            this.putBodyParameter("IgnoreDetailedRouteEntry", ignoreDetailedRouteEntry);
            this.ignoreDetailedRouteEntry = ignoreDetailedRouteEntry;
            return this;
        }

        /**
         * <p>Next Hop Instance</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-jaj34d75h01</p>
         */
        public Builder nextHopId(String nextHopId) {
            this.putBodyParameter("NextHopId", nextHopId);
            this.nextHopId = nextHopId;
            return this;
        }

        /**
         * <p>Next Hop Instance Type</p>
         * 
         * <strong>example:</strong>
         * <p>VCC</p>
         */
        public Builder nextHopType(String nextHopType) {
            this.putBodyParameter("NextHopType", nextHopType);
            this.nextHopType = nextHopType;
            return this;
        }

        /**
         * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2l4sq6l7unhi</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Route type</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        public Builder routeType(String routeType) {
            this.putBodyParameter("RouteType", routeType);
            this.routeType = routeType;
            return this;
        }

        /**
         * <p>The status of the enterprise-level snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the Lingjun connection instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        /**
         * <p>Lingjun CIDR block route entry instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-rte-toekyqel</p>
         */
        public Builder vpdRouteEntryId(String vpdRouteEntryId) {
            this.putBodyParameter("VpdRouteEntryId", vpdRouteEntryId);
            this.vpdRouteEntryId = vpdRouteEntryId;
            return this;
        }

        @Override
        public ListVccRouteEntriesRequest build() {
            return new ListVccRouteEntriesRequest(this);
        } 

    } 

}
