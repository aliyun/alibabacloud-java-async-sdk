// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTableObjectsRequest} extends {@link RequestModel}
 *
 * <p>GetTableObjectsRequest</p>
 */
public class GetTableObjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterDescription")
    private String filterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterOwner")
    private String filterOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterTblName")
    private String filterTblName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterTblType")
    private String filterTblType;

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

    private GetTableObjectsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.filterDescription = builder.filterDescription;
        this.filterOwner = builder.filterOwner;
        this.filterTblName = builder.filterTblName;
        this.filterTblType = builder.filterTblType;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.schemaName = builder.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableObjectsRequest create() {
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
     * @return filterDescription
     */
    public String getFilterDescription() {
        return this.filterDescription;
    }

    /**
     * @return filterOwner
     */
    public String getFilterOwner() {
        return this.filterOwner;
    }

    /**
     * @return filterTblName
     */
    public String getFilterTblName() {
        return this.filterTblName;
    }

    /**
     * @return filterTblType
     */
    public String getFilterTblType() {
        return this.filterTblType;
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

    public static final class Builder extends Request.Builder<GetTableObjectsRequest, Builder> {
        private String DBClusterId; 
        private String filterDescription; 
        private String filterOwner; 
        private String filterTblName; 
        private String filterTblType; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String schemaName; 

        private Builder() {
            super();
        } 

        private Builder(GetTableObjectsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.filterDescription = request.filterDescription;
            this.filterOwner = request.filterOwner;
            this.filterTblName = request.filterTblName;
            this.filterTblType = request.filterTblType;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.schemaName = request.schemaName;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1565u55p32****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The description of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder filterDescription(String filterDescription) {
            this.putQueryParameter("FilterDescription", filterDescription);
            this.filterDescription = filterDescription;
            return this;
        }

        /**
         * <p>The owner of the table.</p>
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
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tbl</p>
         */
        public Builder filterTblName(String filterTblName) {
            this.putQueryParameter("FilterTblName", filterTblName);
            this.filterTblName = filterTblName;
            return this;
        }

        /**
         * <p>The type of the table.</p>
         * <p>Valid values:</p>
         * <p>DIMENSION_TABLE</p>
         * <p>FACT_TABLE</p>
         * <p>EXTERNAL_TABLE</p>
         * <p>Default value: null.</p>
         * 
         * <strong>example:</strong>
         * <p>FACT_TABLE</p>
         */
        public Builder filterTblType(String filterTblType) {
            this.putQueryParameter("FilterTblType", filterTblType);
            this.filterTblType = filterTblType;
            return this;
        }

        /**
         * <p>The order in which the fields to be returned are sorted.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Asc</li>
         * <li>Desc</li>
         * </ul>
         * <p>Values for fields:</p>
         * <p>TableName</p>
         * <p>TableSize</p>
         * <p>CreateTime</p>
         * <p>UpdateTime</p>
         * <p>Default value: {&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;TableName&quot;};</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;TableName&quot;}</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of the page to return. The value is an integer that is greater than 0. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries to return on each page. Valid values:</p>
         * <ul>
         * <li>30</li>
         * <li>50</li>
         * <li>100</li>
         * </ul>
         * <p>Default value: 30.</p>
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
         * <p>The ID of the region in which the cluster resides.</p>
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
        public GetTableObjectsRequest build() {
            return new GetTableObjectsRequest(this);
        } 

    } 

}
