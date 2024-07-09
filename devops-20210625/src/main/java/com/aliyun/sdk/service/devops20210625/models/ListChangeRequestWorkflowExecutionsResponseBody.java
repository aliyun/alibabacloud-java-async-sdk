// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChangeRequestWorkflowExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChangeRequestWorkflowExecutionsResponseBody</p>
 */
public class ListChangeRequestWorkflowExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("pages")
    private Long pages;

    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List < ? > records;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListChangeRequestWorkflowExecutionsResponseBody(Builder builder) {
        this.current = builder.current;
        this.pageSize = builder.pageSize;
        this.pages = builder.pages;
        this.records = builder.records;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChangeRequestWorkflowExecutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pages
     */
    public Long getPages() {
        return this.pages;
    }

    /**
     * @return records
     */
    public java.util.List < ? > getRecords() {
        return this.records;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long current; 
        private Long pageSize; 
        private Long pages; 
        private java.util.List < ? > records; 
        private Long total; 

        /**
         * current.
         */
        public Builder current(Long current) {
            this.current = current;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * pages.
         */
        public Builder pages(Long pages) {
            this.pages = pages;
            return this;
        }

        /**
         * records.
         */
        public Builder records(java.util.List < ? > records) {
            this.records = records;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListChangeRequestWorkflowExecutionsResponseBody build() {
            return new ListChangeRequestWorkflowExecutionsResponseBody(this);
        } 

    } 

}
