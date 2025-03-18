// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsRouteTablesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsRouteTablesRequest</p>
 */
public class DescribeEnsRouteTablesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociateType")
    private String associateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
    private java.util.List<String> ensRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    private String routeTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String routeTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeEnsRouteTablesRequest(Builder builder) {
        super(builder);
        this.associateType = builder.associateType;
        this.ensRegionId = builder.ensRegionId;
        this.ensRegionIds = builder.ensRegionIds;
        this.networkId = builder.networkId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.routeTableId = builder.routeTableId;
        this.routeTableName = builder.routeTableName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRouteTablesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associateType
     */
    public String getAssociateType() {
        return this.associateType;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return ensRegionIds
     */
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
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
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * @return routeTableName
     */
    public String getRouteTableName() {
        return this.routeTableName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeEnsRouteTablesRequest, Builder> {
        private String associateType; 
        private String ensRegionId; 
        private java.util.List<String> ensRegionIds; 
        private String networkId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String routeTableId; 
        private String routeTableName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsRouteTablesRequest request) {
            super(request);
            this.associateType = request.associateType;
            this.ensRegionId = request.ensRegionId;
            this.ensRegionIds = request.ensRegionIds;
            this.networkId = request.networkId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.routeTableId = request.routeTableId;
            this.routeTableName = request.routeTableName;
            this.type = request.type;
        } 

        /**
         * AssociateType.
         */
        public Builder associateType(String associateType) {
            this.putQueryParameter("AssociateType", associateType);
            this.associateType = associateType;
            return this;
        }

        /**
         * <p>The ID of the ENS node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-xian-unicom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The IDs of the Edge Node Service (ENS) nodes.</p>
         */
        public Builder ensRegionIds(java.util.List<String> ensRegionIds) {
            this.putQueryParameter("EnsRegionIds", ensRegionIds);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-257gqcdfvx6n****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-5p1cifr72di****</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * RouteTableName.
         */
        public Builder routeTableName(String routeTableName) {
            this.putQueryParameter("RouteTableName", routeTableName);
            this.routeTableName = routeTableName;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeEnsRouteTablesRequest build() {
            return new DescribeEnsRouteTablesRequest(this);
        } 

    } 

}
