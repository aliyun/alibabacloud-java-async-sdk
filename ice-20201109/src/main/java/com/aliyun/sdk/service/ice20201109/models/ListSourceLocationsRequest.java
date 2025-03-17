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
 * {@link ListSourceLocationsRequest} extends {@link RequestModel}
 *
 * <p>ListSourceLocationsRequest</p>
 */
public class ListSourceLocationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterState")
    private Boolean filterState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortByModifiedTime")
    private String sortByModifiedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    private String sourceLocationName;

    private ListSourceLocationsRequest(Builder builder) {
        super(builder);
        this.filterState = builder.filterState;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sortByModifiedTime = builder.sortByModifiedTime;
        this.sourceLocationName = builder.sourceLocationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSourceLocationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterState
     */
    public Boolean getFilterState() {
        return this.filterState;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortByModifiedTime
     */
    public String getSortByModifiedTime() {
        return this.sortByModifiedTime;
    }

    /**
     * @return sourceLocationName
     */
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public static final class Builder extends Request.Builder<ListSourceLocationsRequest, Builder> {
        private Boolean filterState; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sortBy; 
        private String sortByModifiedTime; 
        private String sourceLocationName; 

        private Builder() {
            super();
        } 

        private Builder(ListSourceLocationsRequest request) {
            super(request);
            this.filterState = request.filterState;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sortByModifiedTime = request.sortByModifiedTime;
            this.sourceLocationName = request.sourceLocationName;
        } 

        /**
         * <p>Specifies whether to ignore source locations marked as deleted. A value of true means ignoring source locations marked as deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder filterState(Boolean filterState) {
            this.putQueryParameter("FilterState", filterState);
            this.filterState = filterState;
            return this;
        }

        /**
         * <ul>
         * <li>The page number.</li>
         * <li>Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sorting order. By default, the query results are sorted by creation time in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The sorting order of the source locations based on the time when they were last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortByModifiedTime(String sortByModifiedTime) {
            this.putQueryParameter("SortByModifiedTime", sortByModifiedTime);
            this.sortByModifiedTime = sortByModifiedTime;
            return this;
        }

        /**
         * <p>The name of the source location.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLocation</p>
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.putQueryParameter("SourceLocationName", sourceLocationName);
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        @Override
        public ListSourceLocationsRequest build() {
            return new ListSourceLocationsRequest(this);
        } 

    } 

}
