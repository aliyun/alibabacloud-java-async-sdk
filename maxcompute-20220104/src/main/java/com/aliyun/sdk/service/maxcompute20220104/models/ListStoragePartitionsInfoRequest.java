// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListStoragePartitionsInfoRequest} extends {@link RequestModel}
 *
 * <p>ListStoragePartitionsInfoRequest</p>
 */
public class ListStoragePartitionsInfoRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("table")
    @com.aliyun.core.annotation.Validation(required = true)
    private String table;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ascOrder")
    private Boolean ascOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("partitionPrefix")
    private String partitionPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("schema")
    private String schema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("types")
    private java.util.List<String> types;

    private ListStoragePartitionsInfoRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.table = builder.table;
        this.ascOrder = builder.ascOrder;
        this.date = builder.date;
        this.orderColumn = builder.orderColumn;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.partitionPrefix = builder.partitionPrefix;
        this.region = builder.region;
        this.schema = builder.schema;
        this.tenantId = builder.tenantId;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStoragePartitionsInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return ascOrder
     */
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
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
     * @return partitionPrefix
     */
    public String getPartitionPrefix() {
        return this.partitionPrefix;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return types
     */
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListStoragePartitionsInfoRequest, Builder> {
        private String project; 
        private String table; 
        private Boolean ascOrder; 
        private String date; 
        private String orderColumn; 
        private Long pageNumber; 
        private Long pageSize; 
        private String partitionPrefix; 
        private String region; 
        private String schema; 
        private String tenantId; 
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(ListStoragePartitionsInfoRequest request) {
            super(request);
            this.project = request.project;
            this.table = request.table;
            this.ascOrder = request.ascOrder;
            this.date = request.date;
            this.orderColumn = request.orderColumn;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.partitionPrefix = request.partitionPrefix;
            this.region = request.region;
            this.schema = request.schema;
            this.tenantId = request.tenantId;
            this.types = request.types;
        } 

        /**
         * <p>The name of the MaxCompute project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        public Builder project(String project) {
            this.putPathParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bank_data</p>
         */
        public Builder table(String table) {
            this.putPathParameter("table", table);
            this.table = table;
            return this;
        }

        /**
         * <p>Specifies whether to sort data in ascending order.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ascOrder(Boolean ascOrder) {
            this.putQueryParameter("ascOrder", ascOrder);
            this.ascOrder = ascOrder;
            return this;
        }

        /**
         * <p>The date on which the statistics are collected, in days. Set this parameter to a value in the YYYYMMdd format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("date", date);
            this.date = date;
            return this;
        }

        /**
         * <p>The sorting column.</p>
         * 
         * <strong>example:</strong>
         * <p>totalFrequency</p>
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("orderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the partition that you want to use for fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20241201</p>
         */
        public Builder partitionPrefix(String partitionPrefix) {
            this.putQueryParameter("partitionPrefix", partitionPrefix);
            this.partitionPrefix = partitionPrefix;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The name of the schema.</p>
         * 
         * <strong>example:</strong>
         * <p>schema</p>
         */
        public Builder schema(String schema) {
            this.putQueryParameter("schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can log on to the MaxCompute console, and choose <strong>Tenants</strong> &gt; <strong>Tenant Property</strong> from the left-side navigation pane to view the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40713753659****</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The storage types.</p>
         */
        public Builder types(java.util.List<String> types) {
            String typesShrink = shrink(types, "types", "json");
            this.putQueryParameter("types", typesShrink);
            this.types = types;
            return this;
        }

        @Override
        public ListStoragePartitionsInfoRequest build() {
            return new ListStoragePartitionsInfoRequest(this);
        } 

    } 

}
