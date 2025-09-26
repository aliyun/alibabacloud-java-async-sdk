// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link PaginationInfo} extends {@link TeaModel}
 *
 * <p>PaginationInfo</p>
 */
public class PaginationInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("totalPages")
    private Integer totalPages;

    private PaginationInfo(Builder builder) {
        this.limit = builder.limit;
        this.page = builder.page;
        this.total = builder.total;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaginationInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Integer limit; 
        private Integer page; 
        private Integer total; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(PaginationInfo model) {
            this.limit = model.limit;
            this.page = model.page;
            this.total = model.total;
            this.totalPages = model.totalPages;
        } 

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * totalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public PaginationInfo build() {
            return new PaginationInfo(this);
        } 

    } 

}
