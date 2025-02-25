// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetViewObjectsRequest} extends {@link RequestModel}
 *
 * <p>GetViewObjectsRequest</p>
 */
public class GetViewObjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterOwner")
    private String filterOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterViewName")
    private String filterViewName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterViewType")
    private String filterViewType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    private GetViewObjectsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.filterOwner = builder.filterOwner;
        this.filterViewName = builder.filterViewName;
        this.filterViewType = builder.filterViewType;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.schemaName = builder.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetViewObjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return filterOwner
     */
    public String getFilterOwner() {
        return this.filterOwner;
    }

    /**
     * @return filterViewName
     */
    public String getFilterViewName() {
        return this.filterViewName;
    }

    /**
     * @return filterViewType
     */
    public String getFilterViewType() {
        return this.filterViewType;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    public static final class Builder extends Request.Builder<GetViewObjectsRequest, Builder> {
        private String DBClusterId; 
        private String filterOwner; 
        private String filterViewName; 
        private String filterViewType; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String schemaName; 

        private Builder() {
            super();
        } 

        private Builder(GetViewObjectsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.filterOwner = request.filterOwner;
            this.filterViewName = request.filterViewName;
            this.filterViewType = request.filterViewType;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.schemaName = request.schemaName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1xxxxxxxx47</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The owner of the view.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder filterOwner(String filterOwner) {
            this.putQueryParameter("FilterOwner", filterOwner);
            this.filterOwner = filterOwner;
            return this;
        }

        /**
         * <p>The name of the view.</p>
         * 
         * <strong>example:</strong>
         * <p>test_filter</p>
         */
        public Builder filterViewName(String filterViewName) {
            this.putQueryParameter("FilterViewName", filterViewName);
            this.filterViewName = filterViewName;
            return this;
        }

        /**
         * <p>The type of the view.</p>
         * <p>Valid values:</p>
         * <p>-VIRTUAL_VIEW</p>
         * <p>-MATERIALIZED_VIEW</p>
         * <p>Default value: null.</p>
         * 
         * <strong>example:</strong>
         * <p>VIRTUAL_VIEW</p>
         */
        public Builder filterViewType(String filterViewType) {
            this.putQueryParameter("FilterViewType", filterViewType);
            this.filterViewType = filterViewType;
            return this;
        }

        /**
         * <p>The order in which you want to sort the query results. Valid values for Type:</p>
         * <ul>
         * <li>Asc</li>
         * <li>Desc</li>
         * </ul>
         * <p>Valid values for Field: -ViewName</p>
         * <p>-CreateTime</p>
         * <p>-UpdateTime</p>
         * <p>Default value: {&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;ViewName&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;ViewName&quot;}</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        @Override
        public GetViewObjectsRequest build() {
            return new GetViewObjectsRequest(this);
        } 

    } 

}
