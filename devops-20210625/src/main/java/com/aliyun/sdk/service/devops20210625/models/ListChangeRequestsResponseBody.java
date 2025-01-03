// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListChangeRequestsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChangeRequestsResponseBody</p>
 */
public class ListChangeRequestsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<?> data;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("pages")
    private Long pages;

    @com.aliyun.core.annotation.NameInMap("perPage")
    private Long perPage;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListChangeRequestsResponseBody(Builder builder) {
        this.current = builder.current;
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.pages = builder.pages;
        this.perPage = builder.perPage;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChangeRequestsResponseBody create() {
        return builder().build();
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return data
     */
    public java.util.List<?> getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pages
     */
    public Long getPages() {
        return this.pages;
    }

    /**
     * @return perPage
     */
    public Long getPerPage() {
        return this.perPage;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long current; 
        private java.util.List<?> data; 
        private String nextToken; 
        private Long pages; 
        private Long perPage; 
        private Long total; 

        /**
         * current.
         */
        public Builder current(Long current) {
            this.current = current;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<?> data) {
            this.data = data;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * perPage.
         */
        public Builder perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListChangeRequestsResponseBody build() {
            return new ListChangeRequestsResponseBody(this);
        } 

    } 

}
