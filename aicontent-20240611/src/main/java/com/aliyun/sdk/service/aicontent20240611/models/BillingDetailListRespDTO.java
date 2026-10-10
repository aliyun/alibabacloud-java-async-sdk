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
 * {@link BillingDetailListRespDTO} extends {@link TeaModel}
 *
 * <p>BillingDetailListRespDTO</p>
 */
public class BillingDetailListRespDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columns")
    private java.util.List<MetricDefRespDTO> columns;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("rows")
    private java.util.List<BillingDetailRowDTO> rows;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private BillingDetailListRespDTO(Builder builder) {
        this.columns = builder.columns;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.rows = builder.rows;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingDetailListRespDTO create() {
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
    public java.util.List<BillingDetailRowDTO> getRows() {
        return this.rows;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<MetricDefRespDTO> columns; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List<BillingDetailRowDTO> rows; 
        private Long total; 

        private Builder() {
        } 

        private Builder(BillingDetailListRespDTO model) {
            this.columns = model.columns;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.rows = model.rows;
            this.total = model.total;
        } 

        /**
         * <p>The column definitions, which are dynamically generated based on the model types that appear in the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder columns(java.util.List<MetricDefRespDTO> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of bill details data.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder rows(java.util.List<BillingDetailRowDTO> rows) {
            this.rows = rows;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public BillingDetailListRespDTO build() {
            return new BillingDetailListRespDTO(this);
        } 

    } 

}
