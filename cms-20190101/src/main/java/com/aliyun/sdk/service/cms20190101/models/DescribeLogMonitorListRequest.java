// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogMonitorListRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogMonitorListRequest</p>
 */
public class DescribeLogMonitorListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchValue")
    private String searchValue;

    private DescribeLogMonitorListRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchValue = builder.searchValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogMonitorListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
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
     * @return searchValue
     */
    public String getSearchValue() {
        return this.searchValue;
    }

    public static final class Builder extends Request.Builder<DescribeLogMonitorListRequest, Builder> {
        private Long groupId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLogMonitorListRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchValue = request.searchValue;
        } 

        /**
         * The ID of the application group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The keyword that is used to search for log monitoring metrics. Fuzzy match is supported.
         */
        public Builder searchValue(String searchValue) {
            this.putQueryParameter("SearchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        @Override
        public DescribeLogMonitorListRequest build() {
            return new DescribeLogMonitorListRequest(this);
        } 

    } 

}
