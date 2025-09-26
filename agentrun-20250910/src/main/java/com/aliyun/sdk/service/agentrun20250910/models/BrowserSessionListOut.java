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
 * {@link BrowserSessionListOut} extends {@link TeaModel}
 *
 * <p>BrowserSessionListOut</p>
 */
public class BrowserSessionListOut extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<BrowserSessionOut> items;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private BrowserSessionListOut(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrowserSessionListOut create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<BrowserSessionOut> getItems() {
        return this.items;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<BrowserSessionOut> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long total; 

        private Builder() {
        } 

        private Builder(BrowserSessionListOut model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.total = model.total;
        } 

        /**
         * items.
         */
        public Builder items(java.util.List<BrowserSessionOut> items) {
            this.items = items;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public BrowserSessionListOut build() {
            return new BrowserSessionListOut(this);
        } 

    } 

}
