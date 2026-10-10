// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link CostModelDetailRespDTO} extends {@link TeaModel}
 *
 * <p>CostModelDetailRespDTO</p>
 */
public class CostModelDetailRespDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columns")
    private java.util.List<MetricDefRespDTO> columns;

    @com.aliyun.core.annotation.NameInMap("granularity")
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("rows")
    private java.util.List<CostModelDetailRowDTO> rows;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private CostModelDetailRespDTO(Builder builder) {
        this.columns = builder.columns;
        this.granularity = builder.granularity;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.rows = builder.rows;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostModelDetailRespDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columns
     */
    public java.util.List<MetricDefRespDTO> getColumns() {
        return this.columns;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rows
     */
    public java.util.List<CostModelDetailRowDTO> getRows() {
        return this.rows;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<MetricDefRespDTO> columns; 
        private String granularity; 
        private Long modelId; 
        private String modelName; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List<CostModelDetailRowDTO> rows; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(CostModelDetailRespDTO model) {
            this.columns = model.columns;
            this.granularity = model.granularity;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.rows = model.rows;
            this.total = model.total;
        } 

        /**
         * <p>List of column definitions</p>
         */
        public Builder columns(java.util.List<MetricDefRespDTO> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>Current granularity: daily/hourly</p>
         * 
         * <strong>example:</strong>
         * <p>hourly</p>
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>Model ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder modelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>Model name</p>
         * 
         * <strong>example:</strong>
         * <p>通义千问-Plus</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>Current page</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>Number of entries per page</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>List of data rows</p>
         */
        public Builder rows(java.util.List<CostModelDetailRowDTO> rows) {
            this.rows = rows;
            return this;
        }

        /**
         * <p>Total number of entries</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public CostModelDetailRespDTO build() {
            return new CostModelDetailRespDTO(this);
        } 

    } 

}
