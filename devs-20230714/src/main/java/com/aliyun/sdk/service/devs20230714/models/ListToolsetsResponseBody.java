// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ListToolsetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListToolsetsResponseBody</p>
 */
public class ListToolsetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Toolset> data;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListToolsetsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListToolsetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Toolset> getData() {
        return this.data;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Toolset> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListToolsetsResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Toolset> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
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
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListToolsetsResponseBody build() {
            return new ListToolsetsResponseBody(this);
        } 

    } 

}
