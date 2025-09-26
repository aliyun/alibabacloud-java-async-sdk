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
 * {@link ListDomainsOutput} extends {@link TeaModel}
 *
 * <p>ListDomainsOutput</p>
 */
public class ListDomainsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<DomainInfo> items;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private String totalCount;

    private ListDomainsOutput(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<DomainInfo> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DomainInfo> items; 
        private String pageNumber; 
        private String pageSize; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListDomainsOutput model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * items.
         */
        public Builder items(java.util.List<DomainInfo> items) {
            this.items = items;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDomainsOutput build() {
            return new ListDomainsOutput(this);
        } 

    } 

}
