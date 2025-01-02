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
 * {@link ListStorageTablesInfoRequest} extends {@link RequestModel}
 *
 * <p>ListStorageTablesInfoRequest</p>
 */
public class ListStorageTablesInfoRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

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
    @com.aliyun.core.annotation.NameInMap("recentDays")
    private Integer recentDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("schema")
    private String schema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tablePrefix")
    private String tablePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("types")
    private java.util.List<String> types;

    private ListStorageTablesInfoRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.ascOrder = builder.ascOrder;
        this.date = builder.date;
        this.orderColumn = builder.orderColumn;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recentDays = builder.recentDays;
        this.region = builder.region;
        this.schema = builder.schema;
        this.tablePrefix = builder.tablePrefix;
        this.tenantId = builder.tenantId;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStorageTablesInfoRequest create() {
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
     * @return recentDays
     */
    public Integer getRecentDays() {
        return this.recentDays;
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
     * @return tablePrefix
     */
    public String getTablePrefix() {
        return this.tablePrefix;
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

    public static final class Builder extends Request.Builder<ListStorageTablesInfoRequest, Builder> {
        private String project; 
        private Boolean ascOrder; 
        private String date; 
        private String orderColumn; 
        private Long pageNumber; 
        private Long pageSize; 
        private Integer recentDays; 
        private String region; 
        private String schema; 
        private String tablePrefix; 
        private String tenantId; 
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(ListStorageTablesInfoRequest request) {
            super(request);
            this.project = request.project;
            this.ascOrder = request.ascOrder;
            this.date = request.date;
            this.orderColumn = request.orderColumn;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.recentDays = request.recentDays;
            this.region = request.region;
            this.schema = request.schema;
            this.tablePrefix = request.tablePrefix;
            this.tenantId = request.tenantId;
            this.types = request.types;
        } 

        /**
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
         * ascOrder.
         */
        public Builder ascOrder(Boolean ascOrder) {
            this.putQueryParameter("ascOrder", ascOrder);
            this.ascOrder = ascOrder;
            return this;
        }

        /**
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
         * orderColumn.
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("orderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * recentDays.
         */
        public Builder recentDays(Integer recentDays) {
            this.putQueryParameter("recentDays", recentDays);
            this.recentDays = recentDays;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * tablePrefix.
         */
        public Builder tablePrefix(String tablePrefix) {
            this.putQueryParameter("tablePrefix", tablePrefix);
            this.tablePrefix = tablePrefix;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * types.
         */
        public Builder types(java.util.List<String> types) {
            String typesShrink = shrink(types, "types", "simple");
            this.putQueryParameter("types", typesShrink);
            this.types = types;
            return this;
        }

        @Override
        public ListStorageTablesInfoRequest build() {
            return new ListStorageTablesInfoRequest(this);
        } 

    } 

}
