// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListVodPackagingGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVodPackagingGroupsResponseBody</p>
 */
public class ListVodPackagingGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PackagingGroups")
    private java.util.List<VodPackagingGroup> packagingGroups;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListVodPackagingGroupsResponseBody(Builder builder) {
        this.packagingGroups = builder.packagingGroups;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodPackagingGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return packagingGroups
     */
    public java.util.List<VodPackagingGroup> getPackagingGroups() {
        return this.packagingGroups;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<VodPackagingGroup> packagingGroups; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String sortBy; 
        private Long totalCount; 

        /**
         * PackagingGroups.
         */
        public Builder packagingGroups(java.util.List<VodPackagingGroup> packagingGroups) {
            this.packagingGroups = packagingGroups;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVodPackagingGroupsResponseBody build() {
            return new ListVodPackagingGroupsResponseBody(this);
        } 

    } 

}
