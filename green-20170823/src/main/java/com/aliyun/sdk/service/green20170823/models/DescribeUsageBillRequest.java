// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsageBillRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsageBillRequest</p>
 */
public class DescribeUsageBillRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Day")
    @Validation(required = true)
    private String day;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TotalCount")
    private Integer totalCount;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeUsageBillRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.day = builder.day;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsageBillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return day
     */
    public String getDay() {
        return this.day;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeUsageBillRequest, Builder> {
        private Integer currentPage; 
        private String day; 
        private Integer pageSize; 
        private Integer totalCount; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUsageBillRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.day = request.day;
            this.pageSize = request.pageSize;
            this.totalCount = request.totalCount;
            this.type = request.type;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Day.
         */
        public Builder day(String day) {
            this.putQueryParameter("Day", day);
            this.day = day;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.putQueryParameter("TotalCount", totalCount);
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeUsageBillRequest build() {
            return new DescribeUsageBillRequest(this);
        } 

    } 

}
