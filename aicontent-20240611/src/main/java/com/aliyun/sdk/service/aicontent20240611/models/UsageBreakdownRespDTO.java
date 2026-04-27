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
 * {@link UsageBreakdownRespDTO} extends {@link TeaModel}
 *
 * <p>UsageBreakdownRespDTO</p>
 */
public class UsageBreakdownRespDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("granularity")
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("rows")
    private java.util.List<UsageBreakdownRowDTO> rows;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private UsageBreakdownRespDTO(Builder builder) {
        this.granularity = builder.granularity;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.rows = builder.rows;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UsageBreakdownRespDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
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
    public java.util.List<UsageBreakdownRowDTO> getRows() {
        return this.rows;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String granularity; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List<UsageBreakdownRowDTO> rows; 
        private Long total; 

        private Builder() {
        } 

        private Builder(UsageBreakdownRespDTO model) {
            this.granularity = model.granularity;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.rows = model.rows;
            this.total = model.total;
        } 

        /**
         * granularity.
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * rows.
         */
        public Builder rows(java.util.List<UsageBreakdownRowDTO> rows) {
            this.rows = rows;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public UsageBreakdownRespDTO build() {
            return new UsageBreakdownRespDTO(this);
        } 

    } 

}
