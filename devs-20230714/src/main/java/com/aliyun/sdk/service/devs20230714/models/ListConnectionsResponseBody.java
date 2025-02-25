// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectionsResponseBody</p>
 */
public class ListConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Connection > data;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListConnectionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Connection > getData() {
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
        private java.util.List < Connection > data; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long totalCount; 

        /**
         * data.
         */
        public Builder data(java.util.List < Connection > data) {
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

        public ListConnectionsResponseBody build() {
            return new ListConnectionsResponseBody(this);
        } 

    } 

}
