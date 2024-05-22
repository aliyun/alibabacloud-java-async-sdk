// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRouteEntryListRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsRouteEntryListRequest</p>
 */
public class DescribeEnsRouteEntryListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopId")
    private String nextHopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopType")
    private String nextHopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryId")
    private String routeEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryName")
    private String routeEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryType")
    private String routeEntryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeTableId;

    private DescribeEnsRouteEntryListRequest(Builder builder) {
        super(builder);
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.nextHopId = builder.nextHopId;
        this.nextHopType = builder.nextHopType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.routeEntryId = builder.routeEntryId;
        this.routeEntryName = builder.routeEntryName;
        this.routeEntryType = builder.routeEntryType;
        this.routeTableId = builder.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRouteEntryListRequest create() {
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
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    /**
     * @return routeEntryName
     */
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    /**
     * @return routeEntryType
     */
    public String getRouteEntryType() {
        return this.routeEntryType;
    }

    /**
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static final class Builder extends Request.Builder<DescribeEnsRouteEntryListRequest, Builder> {
        private String destinationCidrBlock; 
        private String nextHopId; 
        private String nextHopType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String routeEntryId; 
        private String routeEntryName; 
        private String routeEntryType; 
        private String routeTableId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsRouteEntryListRequest request) {
            super(request);
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.nextHopId = request.nextHopId;
            this.nextHopType = request.nextHopType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.routeEntryId = request.routeEntryId;
            this.routeEntryName = request.routeEntryName;
            this.routeEntryType = request.routeEntryType;
            this.routeTableId = request.routeTableId;
        } 

        /**
         * The destination Classless Inter-Domain Routing (CIDR) block of the route entry.
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * The ID of the next hop.
         */
        public Builder nextHopId(String nextHopId) {
            this.putQueryParameter("NextHopId", nextHopId);
            this.nextHopId = nextHopId;
            return this;
        }

        /**
         * The type of next hop of the custom route entry. Valid values:
         * <p>
         * 
         * *   Instance: an ENS instance.
         */
        public Builder nextHopType(String nextHopType) {
            this.putQueryParameter("NextHopType", nextHopType);
            this.nextHopType = nextHopType;
            return this;
        }

        /**
         * The page number of the returned page. Valid values: integers that are greater than 0. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. Valid values: 10 to 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the route that you want to query.
         */
        public Builder routeEntryId(String routeEntryId) {
            this.putQueryParameter("RouteEntryId", routeEntryId);
            this.routeEntryId = routeEntryId;
            return this;
        }

        /**
         * The name of the route.
         */
        public Builder routeEntryName(String routeEntryName) {
            this.putQueryParameter("RouteEntryName", routeEntryName);
            this.routeEntryName = routeEntryName;
            return this;
        }

        /**
         * The route type. Valid values:
         * <p>
         * 
         * *   Custom: custom route
         * *   System: system route
         */
        public Builder routeEntryType(String routeEntryType) {
            this.putQueryParameter("RouteEntryType", routeEntryType);
            this.routeEntryType = routeEntryType;
            return this;
        }

        /**
         * The ID of the route table that you want to query.
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        @Override
        public DescribeEnsRouteEntryListRequest build() {
            return new DescribeEnsRouteEntryListRequest(this);
        } 

    } 

}
